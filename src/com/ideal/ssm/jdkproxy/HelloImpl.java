package com.ideal.ssm.jdkproxy;

public class HelloImpl implements Hello {
    @Override
    public void say() {
        System.out.println("Hello World");
    }

    @Override
    public void eat(String food) {
        System.out.println("eat " + food);
    }
}
