package com.tg.design.pattern.factory.simplefactory;

import com.tg.design.pattern.factory.Apple;
import com.tg.design.pattern.factory.Fruit;
import com.tg.design.pattern.factory.Grape;
import com.tg.design.pattern.factory.Strawberry;
import com.tg.design.pattern.factory.simplefactory.exception.BadFruitException;

/**
 * @author tangang
 * @title FruitGardener
 * @date 2017/9/14
 */
public class FruitGardener {

    public static Fruit factory(String which) throws BadFruitException {
        if(which.equalsIgnoreCase("apple")){
            return new Apple();
        }else if(which.equalsIgnoreCase("strawberry")){
            return new Strawberry();
        }else if(which.equalsIgnoreCase("grape")){
            return new Grape();
        }
        else{
            throw new BadFruitException("Bad fruit request");

        }
    }
}
