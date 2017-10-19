package com.tg.design.pattern.observer;

/**
 * @author tangang
 * @title ConcreteSubject2
 * @date 2017/10/19
 */
public class ConcreteSubject2 extends AbstractSubject {

    private String state;

    public void change(String newState){
        state = newState;
        this.notifyObservers();
    }
}
