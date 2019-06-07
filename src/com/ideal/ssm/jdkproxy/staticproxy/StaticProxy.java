package com.ideal.ssm.jdkproxy.staticproxy;

import com.ideal.ssm.jdkproxy.Hello;

public class StaticProxy implements Hello {
    private Hello hello;

    public StaticProxy(Hello hello) {
        this.hello = hello;
    }

    @Override
    public void say() {
        System.out.println("static proxy:before say");
        hello.say();
        System.out.println("static proxy:after say");
    }

    @Override
    public void eat(String food) {
        System.out.println("static proxy:before eat");
        hello.eat(food);
        System.out.println("static proxy:after eat");
    }
}
