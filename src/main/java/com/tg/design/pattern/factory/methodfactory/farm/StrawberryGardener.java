package com.tg.design.pattern.factory.methodfactory.farm;

import com.tg.design.pattern.factory.Fruit;
import com.tg.design.pattern.factory.Strawberry;

/**
 * @author tangang
 * @title StrawberryGardener
 * @date 2017/9/18
 */
public class StrawberryGardener implements FruitGardener {
    @Override
    public Fruit factory() {
        return new Strawberry();
    }
}
