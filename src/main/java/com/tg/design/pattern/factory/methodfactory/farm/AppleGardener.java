package com.tg.design.pattern.factory.methodfactory.farm;

import com.tg.design.pattern.factory.Apple;
import com.tg.design.pattern.factory.Fruit;

/**
 * @author tangang
 * @title AppleGardener
 * @date 2017/9/18
 */
public class AppleGardener implements FruitGardener {
    @Override
    public Fruit factory() {
        return new Apple();
    }
}
