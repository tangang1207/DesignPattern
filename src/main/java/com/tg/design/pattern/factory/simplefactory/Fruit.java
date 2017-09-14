package com.tg.design.pattern.factory.simplefactory;

/**
 * 简单工厂模式
 * @author tangang
 * @title Fruit
 * @date 2017/9/14
 */
public interface Fruit {

    /**
     * 生长
     */
    void grow();

    /**
     * 收获
     */
    void harvest();

    /**
     * 种植
     */
    void plant();


}
