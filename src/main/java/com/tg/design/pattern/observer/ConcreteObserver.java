package com.tg.design.pattern.observer;

/**
 * @author tangang
 * @title ConcreteObserver
 * @date 2017/10/19
 */
public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println(" I am notified.");
    }
}
