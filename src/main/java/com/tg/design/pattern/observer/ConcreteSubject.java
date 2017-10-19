package com.tg.design.pattern.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author tangang
 * @title ConcreteSubject
 * @date 2017/10/19
 */
public class ConcreteSubject implements Subject {

    private Vector observersVector = new Vector();
    @Override
    public void addtach(Observer observer) {
        observersVector.addElement(observer);

    }

    @Override
    public void detach(Observer observer) {
        observersVector.removeElement(observer);

    }

    @Override
    public void notifyObservers() {

        Enumeration enumeration = observers();
        while (enumeration.hasMoreElements()){
            ((Observer)enumeration.nextElement()).update();
        }

    }

    public Enumeration observers(){
        return ((Vector)observersVector.clone()).elements();
    }
}
