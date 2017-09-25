package com.tg.design.pattern.adapter.apiadapter;

import com.tg.design.pattern.adapter.Adaptee;
import com.tg.design.pattern.adapter.Target;
import com.tg.design.pattern.adapter.classadapter.Adapter;

/**
 * @author tangang
 * @title ObjectAdapter
 * @date 2017/9/25
 */
public class ObjectAdapter implements Target {

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void sampleOperation1() {
        adaptee.sampleOperation1();

    }

    @Override
    public void sampleOpertion2() {
        //todo ..

    }
}
