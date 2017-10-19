package com.tg.design.pattern.proxy.smartproxy;

/**
 * @author tangang
 * @title AccessValidator
 * @date 2017/9/30
 */
public class AccessValidator {

    public boolean validateUser(String userId){
        if(userId.equals("admin")){
            return true;
        }else{
            return false;
        }
    }

}
