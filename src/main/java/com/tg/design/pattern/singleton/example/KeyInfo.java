package com.tg.design.pattern.singleton.example;

/**
 * @author tangang
 * @title KeyInfo
 * @date 2017/9/21
 */
public class KeyInfo {

    private int keyMax;
    private int keyMin;
    private int nextKey;
    private int poolSize;
    private String keyName;

    public KeyInfo(int poolSize,String keyName){
        this.poolSize = poolSize;
        this.keyName = keyName;
        retrieveFromDB();
    }

    private void retrieveFromDB() {

        //1.将数据库中存放的当前值自增poolSize；根据keyname分别查找与更新
        //2.返回自增后的值；
        int keyFromDB = 1003; //假设从数据库返回1003
        keyMax = keyFromDB;
        keyMin = keyFromDB - poolSize +1;
        nextKey = keyMin;
    }

    public int getNextKey(){
        if(nextKey > keyMax){
            retrieveFromDB();
        }
        return nextKey++;
    }


    public int getNextKey(String keyname){
        if(nextKey > keyMax){
            retrieveFromDB(); //根据keyname分别查询。。。
        }
        return nextKey++;
    }

    public int getKeyMax() {
        return keyMax;
    }

    public int getKeyMin() {
        return keyMin;
    }
}
