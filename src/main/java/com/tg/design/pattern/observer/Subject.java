package com.tg.design.pattern.observer;

/**
 * @author tangang
 * @title Subject
 * @date 2017/10/19
 */
public interface Subject {

    /**
     * 调用此方法登记一个新的观察者对象
     * @param observer
     */
    public void addtach(Observer observer);


    /**
     * 调用此方法删除一个已经登记过的观察者对象
     * @param observer
     */
    public void detach(Observer observer);

    /**
     * 调用这个方法通知所有登记过的观察者对象
     */
    void notifyObservers();



}
