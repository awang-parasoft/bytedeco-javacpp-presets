# Build JavaCPP New Preset Examples

## Preparation

- Linux x86-64 Ubuntu with C/C++ toolchain, JDK and Maven installed.
- Follow the instructions to build javacpp project locally.

## Build zlib 

```shell
mvn clean install --projects .,zlib

mvn clean install -f platform --projects ../zlib/platform -Djavacpp.platform.host
```

## Build helloworld and Run Samples

Note: You may need to specify a proxy server to use when download the helloworld source code archive from GitHub.
e.g. `export https_proxy=http://192.168.56.1:7890`. Or you can download the source archive [helloworld-2.0.zip](https://github.com/bytedeco/helloworld/archive/2.0.zip) manually and put it in the `downloads` directory before running the following build commands.

```shell
mvn clean install --projects .,helloworld

mvn clean install -f platform --projects ../helloworld/platform -Djavacpp.platform.host

cd samples
mvn compile exec:java
```
