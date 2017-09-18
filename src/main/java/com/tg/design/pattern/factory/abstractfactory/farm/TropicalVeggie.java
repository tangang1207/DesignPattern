package com.tg.design.pattern.factory.abstractfactory.farm;

/**
 * @author tangang
 * @title TropicalVeggie
 * @date 2017/9/18
 */
public class TropicalVeggie implements BaseVeggie {

    private String name;

    public TropicalVeggie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
