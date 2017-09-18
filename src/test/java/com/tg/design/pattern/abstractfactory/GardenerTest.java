package com.tg.design.pattern.abstractfactory;

import com.tg.design.pattern.factory.abstractfactory.farm.Gardener;
import com.tg.design.pattern.factory.abstractfactory.farm.NorthernGardener;
import org.junit.Test;

/**
 * @author tangang
 * @title GardenerTest
 * @date 2017/9/18
 */
public class GardenerTest {

    @Test
    public void testGardener() {
        NorthernGardener northernGardener = new NorthernGardener();


        northernGardener.createFruit("apple");

    }
}
