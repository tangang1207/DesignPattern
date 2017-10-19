package com.tg.design.pattern.observer.example;

import java.util.Observable;
import java.util.Observer;

/**
 * @author tangang
 * @title Watcher
 * @date 2017/10/19
 */
public class Watcher implements Observer {

    public Watcher(Watched w){
        w.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("data haa been changed to: '" + ((Watched)o).retrieveData() + "'");

    }
}
