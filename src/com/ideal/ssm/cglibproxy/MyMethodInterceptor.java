package com.ideal.ssm.cglibproxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib proxy:" + o.getClass().getName());
        System.out.println("cglib proxy:" + method);
        System.out.println("cglib proxy:" + objects);
        Object object = methodProxy.invokeSuper(o, objects);
        System.out.println(object);
        System.out.println("cglib proxy:after invoker");
        return object
                ;
    }
}
