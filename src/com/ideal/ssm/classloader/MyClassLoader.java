package com.ideal.ssm.classloader;

public class MyClassLoader extends ClassLoader {

    public Class<?> defineMyClass(byte[] bytes, int off, int len) {
        return super.defineClass(bytes, off, len);
    }
}
