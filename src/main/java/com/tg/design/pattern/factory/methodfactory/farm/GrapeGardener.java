package com.tg.design.pattern.factory.methodfactory.farm;

import com.tg.design.pattern.factory.Fruit;
import com.tg.design.pattern.factory.Grape;

/**
 * @author tangang
 * @title GrapeGardener
 * @date 2017/9/18
 */
public class GrapeGardener implements FruitGardener {
    @Override
    public Fruit factory() {
        return new Grape();
    }
}
