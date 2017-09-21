package com.tg.design.pattern.singleton.example;

import java.util.HashMap;

/**
 * @author tangang
 * @title KeyGenerator
 * @date 2017/9/21
 */
public class KeyGenerator {

    public static  KeyGenerator keygen = new KeyGenerator();

    private int key = 1000;

    private static final int POOL_SIZE = 20;

    private KeyInfo keyInfo;

    private HashMap keyList = new HashMap(10);


    private KeyGenerator(){
       // keyInfo = new KeyInfo(POOL_SIZE);
    }

    public static KeyGenerator getInstance(){
        return keygen;
    }

    public synchronized int getNextKey(){
        //一、直接内存变量自增
        //return key++;
        //二、模拟从数据库获取
//        return getNextKeyFromDB();
        //三、键值的缓存，一次性先读取多个key
        return keyInfo.getNextKey();


    }
    public synchronized int getNextKey(String keyName){
        //四、键值的缓存，一次性先读取多个key ,管理多个键值
        KeyInfo keyInfo;
        if(keyList.containsKey(keyName)){
            keyInfo = (KeyInfo) keyList.get(keyName);
        }else{
            keyInfo = new KeyInfo(POOL_SIZE,keyName);
            keyList.put(keyName,keyInfo);
        }
        return keyInfo.getNextKey(keyName);

    }
    //模拟从数据库获取值
    private int getNextKeyFromDB(){

        //1.先更新值
        //2.再获取更新后的值
        //3.模拟返回一个固定值
        return 10001;

    }

}
