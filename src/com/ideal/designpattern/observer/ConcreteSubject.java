package com.ideal.designpattern.observer;

public class ConcreteSubject extends Subject {

    private String name;

    public ConcreteSubject(String name) {
        this.name = name;
    }

    @Override
    protected void notifyAllO() {
        System.out.println(name + "触发通知...");
        observers.forEach(Observer::update);
    }
}
