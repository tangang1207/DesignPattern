package com.tg.design.pattern.factory.abstractfactory.farm;

/**
 * @author tangang
 * @title TropicalGardener
 * @date 2017/9/18
 */
public class TropicalGardener implements Gardener {

    public BaseFruit createFruit(String name){
        return new TropicalFruit(name);
    }

    public BaseVeggie createVeggie(String name){
        return new TropicalVeggie(name);
    }
}
