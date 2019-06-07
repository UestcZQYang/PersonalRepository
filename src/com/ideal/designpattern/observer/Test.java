package com.ideal.designpattern.observer;

public class Test {
    public static void main(String args[]) throws InterruptedException {
        Subject subject = new ConcreteSubject("求救信");
        Observer observer = new ConcreteObserver("郭靖");
        subject.attach(observer);
        subject.attach(new ConcreteObserver("黄蓉"));
        subject.attach(new ConcreteObserver("杨过"));
        subject.notifyAllO();
        System.out.println();
        Thread.sleep(5000);
        System.out.println("five years later...郭靖 is dead");
        subject.detach(observer);
        subject.notifyAllO();
    }
}
