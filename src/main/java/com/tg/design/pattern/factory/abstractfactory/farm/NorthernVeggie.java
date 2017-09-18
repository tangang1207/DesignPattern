package com.tg.design.pattern.factory.abstractfactory.farm;

/**
 * @author tangang
 * @title NorthernVeggie
 * @date 2017/9/18
 */
public class NorthernVeggie implements BaseVeggie {
    private String name;

    public NorthernVeggie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
