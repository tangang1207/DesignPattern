package com.tg.design.pattern.singleton;

/**
 * 饿汉式单例模式，类被加载时，初始化静态变量实例
 * @author tangang
 * @title EagerSingleton
 * @date 2017/9/20
 */
public class EagerSingleton {

    private static final EagerSingleton m_instance = new EagerSingleton();

    /**
     * 必须设置为私有的构造方法，避免被外部创建
     */
    private EagerSingleton(){}

    /**
     * 提供给外部访问的静态工厂方法。
     * @return
     */
    public static EagerSingleton getInstance(){
        return m_instance;
    }
}
