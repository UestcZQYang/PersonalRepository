package com.ideal.ssm.jdkproxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {

    private Object subject;

    public DynamicProxy(Object object) {
        this.subject = object;
    }

    public Object newInstance() {
        return Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("dynamic proxy:subject:" + subject);
        System.out.println("dynamic proxy:method:" + method);
        System.out.println("dynamic proxy:args" + args);
        Object object = method.invoke(subject, args);
        System.out.println("dynamic proxy:after invoke");
        return object;
    }
}
