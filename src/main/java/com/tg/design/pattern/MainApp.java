package com.tg.design.pattern;

import com.tg.design.pattern.factory.simplefactory.Fruit;
import com.tg.design.pattern.factory.simplefactory.FruitGardener;

/**
 * A Camel Application
 */
public class MainApp {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) throws Exception {
        Fruit apple = FruitGardener.factory("apple");
        apple.grow();
    }

}

