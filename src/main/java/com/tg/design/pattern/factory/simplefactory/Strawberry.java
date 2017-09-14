package com.tg.design.pattern.factory.simplefactory;

/**
 * @author tangang
 * @title Strawberry
 * @date 2017/9/14
 */
public class Strawberry implements Fruit {
    @Override
    public void grow() {
        System.out.println("Strawberry is growing");
    }

    @Override
    public void harvest() {
        System.out.println("Strawberry has been harvested.");
    }

    @Override
    public void plant() {
        System.out.println("Strawberry has been planted.");
    }
}
