package com.ideal.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    protected List<Observer> observers = new ArrayList<>();

    protected boolean attach(Observer observer) {
       return observers.add(observer);
    }

    protected boolean detach(Observer observer) {
        return observers.remove(observer);
    }

    abstract protected void notifyAllO();

}
