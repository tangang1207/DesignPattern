package com.tg.design.pattern.simplefactory;

import com.tg.design.pattern.factory.Fruit;
import com.tg.design.pattern.factory.simplefactory.FruitGardener;
import com.tg.design.pattern.factory.simplefactory.exception.BadFruitException;
import org.junit.Test;

/**
 * @author tangang
 * @title FruitGardenerTest
 * @date 2017/9/14
 */
public class FruitGardenerTest {

    @Test
    public void testFruite() throws BadFruitException {
        Fruit apple = FruitGardener.factory("apple");
        apple.grow();
        Fruit strawberry = FruitGardener.factory("strawberry");
        strawberry.grow();

    }
}
