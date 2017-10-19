package com.tg.design.pattern.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author tangang
 * @title AbstractSubject
 * @date 2017/10/19
 */
abstract public class AbstractSubject {

    private Vector observersVector = new Vector();
    public void addtach(Observer observer) {
        observersVector.addElement(observer);

    }

    public void detach(Observer observer) {
        observersVector.removeElement(observer);

    }

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
