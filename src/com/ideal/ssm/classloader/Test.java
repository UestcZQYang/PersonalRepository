package com.ideal.ssm.classloader;

import com.ideal.ssm.classloader.MyClassLoader;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Test {
    
    public static void main(String args[]) throws Exception{
        File file = new File(".");
        String classPath = "/out/production/SSM_Section1/com/ideal/ssm/Person.class";
        InputStream inputStream = new FileInputStream(file.getCanonicalPath() + classPath);

        byte[] bytes = new byte[1024];
        int count = inputStream.read(bytes);

        MyClassLoader loader = new MyClassLoader();
        Class personClass = loader.defineMyClass(bytes, 0, count);

        System.out.println(personClass.getSimpleName());

        Object object = personClass.newInstance();
        personClass.getMethod("eat").invoke(object);
    }
}
