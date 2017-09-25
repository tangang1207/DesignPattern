package com.tg.design.pattern.adapter.example;

/**
 * 适配器角色
 * @author tangang
 * @title John
 * @date 2017/9/25
 */
public class John extends Kittie implements Puppie {
    @Override
    public void wao() {
        this.miao();
    }

    @Override
    public void fetchBall() {
        this.catchRat();

    }
}
