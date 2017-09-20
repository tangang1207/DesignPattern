package com.tg.design.pattern.singleton;

/**
 * @author tangang
 * @title LazySingleton
 * @date 2017/9/20
 */
public class LazySingleton {

    private static LazySingleton m_instance = null;

    /**
     * 私有的构造方法，避免被外部创建
     */
    private LazySingleton(){}

    /**
     * 对方法进行同步处理，避免外部多线程场景下，可能会创建多个实例的情况。
     * @return
     */
    synchronized public static LazySingleton getInstance(){
        if(null == m_instance){
            m_instance = new LazySingleton();
        }
        return m_instance;
    }


}
