package com.ideal.ssm.jdkproxy;

import com.ideal.ssm.jdkproxy.dynamicproxy.DynamicProxy;
import com.ideal.ssm.jdkproxy.staticproxy.StaticProxy;

public class Test {

    public static void main(String args[]) {
//        Hello hello = new HelloImpl();
//        StaticProxy staticProxy = new StaticProxy(hello);
//        staticProxy.say();
//        staticProxy.eat(" rice");


        DynamicProxy dynamicProxy = new DynamicProxy(new HelloImpl());
        Hello hello = (Hello) dynamicProxy.newInstance();
        hello.eat("rice");
    }
}
