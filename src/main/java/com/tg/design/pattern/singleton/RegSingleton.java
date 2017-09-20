package com.tg.design.pattern.singleton;

import java.util.HashMap;

/**
 * @author tangang
 * @title RegSingleton
 * @date 2017/9/20
 */
public class RegSingleton {

    static private HashMap m_registry = new HashMap();
    static {
        RegSingleton x = new RegSingleton();
        m_registry.put(x.getClass().getName(),x);
    }
    protected RegSingleton(){}

    static public RegSingleton getInstance(String name){
        if(name == null){
            name = "com.tg.design.pattern.singleton.RegSingleton";
        }
        if(m_registry.get(name) == null){
            try {
                m_registry.put(name,Class.forName(name).newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return (RegSingleton) m_registry.get(name);
    }
}
