package com.tg.design.pattern.factory.abstractfactory.farm;

/**
 * @author tangang
 * @title NorthernGardener
 * @date 2017/9/18
 */
public class NorthernGardener implements Gardener {

    public BaseFruit createFruit(String name){
        return new NorthernFruit(name);
    }

    public BaseVeggie createVeggie(String name){
        return new NorthernVeggie(name);
    }
}
