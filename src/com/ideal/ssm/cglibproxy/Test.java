package com.ideal.ssm.cglibproxy;

import net.sf.cglib.proxy.Enhancer;

public class Test {
    
    public static void main(String args[]) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(HelloConcrete.class);
        enhancer.setCallback(new MyMethodInterceptor());

        HelloConcrete helloConcrete = (HelloConcrete) enhancer.create();
        helloConcrete.say(" i love you");
    }
}
