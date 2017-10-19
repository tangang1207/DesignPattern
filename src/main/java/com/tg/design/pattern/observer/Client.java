package com.tg.design.pattern.observer;

/**
 * @author tangang
 * @title Client
 * @date 2017/10/19
 */
public class Client {

    private static ConcreteSubject2 subject;
    private static Observer observer;

    public static void main(String[] args) {
        subject = new ConcreteSubject2();
        observer = new ConcreteObserver();

        subject.addtach(observer);

        //subject.notifyObservers();

        subject.change("new state.");
    }
}
