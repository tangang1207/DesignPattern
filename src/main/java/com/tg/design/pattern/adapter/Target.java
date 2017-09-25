package com.tg.design.pattern.adapter;

/**
 * 目标接口
 * @author tangang
 * @title Target
 * @date 2017/9/25
 */
public interface Target {

    /**
     * 这是源类有的方法sampleOperation1
     */
    void sampleOperation1();


    /**
     * 源类没有的方法sampleOperation2
     */
    void sampleOpertion2();


}
