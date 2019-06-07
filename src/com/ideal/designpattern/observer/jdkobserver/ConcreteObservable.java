package com.ideal.designpattern.observer.jdkobserver;

import java.util.Observable;

public class ConcreteObservable extends Observable {

    private String name;

    public ConcreteObservable(String name) {
        super();
        this.name = name;
    }

    @Override
    public void notifyObservers() {
        notifyObservers(null);
    }

    @Override
    public void notifyObservers(Object object) {
        synchronized (this) {
            super.setChanged();
            System.out.println(name + "发起了通知申请...");
            super.notifyObservers(null);
        }
    }
}
