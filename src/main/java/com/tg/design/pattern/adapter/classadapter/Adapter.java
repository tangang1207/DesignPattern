package com.tg.design.pattern.adapter.classadapter;

import com.tg.design.pattern.adapter.Adaptee;
import com.tg.design.pattern.adapter.Target;

/**
 * @author tangang
 * @title Adapter
 * @date 2017/9/25
 */
public class Adapter extends Adaptee implements Target {

    @Override
    /**
     * 实现源类中没有的方法sampleOpertion2
     */
    public void sampleOpertion2() {

    }
}
