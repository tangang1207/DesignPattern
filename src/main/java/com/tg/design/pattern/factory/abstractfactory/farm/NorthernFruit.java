package com.tg.design.pattern.factory.abstractfactory.farm;

/**
 * @author tangang
 * @title NorthernFruit
 * @date 2017/9/18
 */
public class NorthernFruit implements BaseFruit {

    private String name;

    public NorthernFruit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
