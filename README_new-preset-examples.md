# Build zlib 

```shell
bash cppbuild.sh install zlib

mvn clean install --projects .,zlib

mvn clean install -f platform --projects ../zlib/platform -Djavacpp.platform.host
# Check /home/devtest/.m2/repository/org/bytedeco/javacpp
```