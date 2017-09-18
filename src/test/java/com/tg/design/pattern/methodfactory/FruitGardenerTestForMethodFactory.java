package com.tg.design.pattern.methodfactory;

import com.tg.design.pattern.factory.Fruit;

import com.tg.design.pattern.factory.methodfactory.farm.AppleGardener;
import org.junit.Test;

/**
 * @author tangang
 * @title FruitGardenerTestForMethodFactory
 * @date 2017/9/18
 */
public class FruitGardenerTestForMethodFactory {

    @Test
    public void testFruite() {
        AppleGardener appleGardener = new AppleGardener();
        Fruit apple = appleGardener.factory();
        apple.grow();

    }
}
