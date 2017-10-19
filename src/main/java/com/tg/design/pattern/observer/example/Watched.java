package com.tg.design.pattern.observer.example;

import java.util.Observable;

/**
 * @author tangang
 * @title Watched
 * @date 2017/10/19
 */
public class Watched extends Observable {

    private String data = "";

    public String retrieveData(){
        return data;
    }

    public void changeData(String data){
        if(! this.data.equals(data)){
            this.data = data;
            setChanged();
        }
        notifyObservers();
    }

}
