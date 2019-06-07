package com.ideal.designpattern.observer.jdkobserver;

import java.util.Observer;

public class Test {

    public static void main(String args[]) throws InterruptedException {
        ConcreteObservable observable = new ConcreteObservable("求救信");
        Observer observer1 = new ConcreteObserver("郭靖");
        observable.addObserver(observer1);
        observable.addObserver(new ConcreteObserver("黄蓉"));
        observable.addObserver(new ConcreteObserver("杨过"));
        observable.notifyObservers();

        Thread.sleep(5000);
        System.out.println("郭靖 is dead");
        observable.deleteObserver(observer1);

        observable.notifyObservers();
    }
}
