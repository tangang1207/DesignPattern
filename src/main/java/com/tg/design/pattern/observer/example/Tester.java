package com.tg.design.pattern.observer.example;

/**
 * @author tangang
 * @title Tester
 * @date 2017/10/19
 */
public class Tester {



    public static void main(String[] args) {
        Watched watched = new Watched();

        Watcher watcher = new Watcher(watched);

        watched.changeData("In c,we create bugs.");
        watched.changeData("In java,we inherit bugs.");
        watched.changeData("In java,we inherit bugs.");
        watched.changeData("In VB ,we visualize bugs.");
    }
}
