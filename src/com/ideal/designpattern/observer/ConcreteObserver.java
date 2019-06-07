package com.ideal.designpattern.observer;

public class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("观察者" + name + "收到通知，开始执行...");
    }
}
