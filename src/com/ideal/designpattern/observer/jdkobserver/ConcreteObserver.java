package com.ideal.designpattern.observer.jdkobserver;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer {

    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + "收到了通知，开始执行任务...");
    }
}
