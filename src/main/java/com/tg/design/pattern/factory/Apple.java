package com.tg.design.pattern.factory;

/**
 * @author tangang
 * @title Apple
 * @date 2017/9/14
 */
public class Apple implements Fruit{

    private int treeAge;

    @Override
    public void grow() {
        System.out.println("Apple is growing");

    }

    @Override
    public void harvest() {
        System.out.println("Apple has been harvested.");

    }

    @Override
    public void plant() {
        System.out.println("Apple has been planted.");
    }

    public int getTreeAge() {
        return treeAge;
    }

    public void setTreeAge(int treeAge) {
        this.treeAge = treeAge;
    }
}
