// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.helloworld;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.helloworld.global.helloworld.*;



    @Name("Person") @Properties(inherit = org.bytedeco.helloworld.presets.helloworld.class)
public class PersonTypePtr extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public PersonTypePtr() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public PersonTypePtr(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public PersonTypePtr(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public PersonTypePtr position(long position) {
            return (PersonTypePtr)super.position(position);
        }
        @Override public PersonTypePtr getPointer(long i) {
            return new PersonTypePtr((Pointer)this).offsetAddress(i);
        }
    
        public native @Cast("char*") BytePointer firstname(); public native PersonTypePtr firstname(BytePointer setter);
        public native @Cast("char*") BytePointer lastname(); public native PersonTypePtr lastname(BytePointer setter);
    }
