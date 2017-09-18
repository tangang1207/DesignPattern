package com.tg.design.pattern.factory.abstractfactory.farm;

/**
 * @author tangang
 * @title TropicalFruit
 * @date 2017/9/18
 */
public class TropicalFruit implements BaseFruit {
    private String name;

    public TropicalFruit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
