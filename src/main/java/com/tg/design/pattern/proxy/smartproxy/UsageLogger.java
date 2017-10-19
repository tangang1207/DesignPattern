package com.tg.design.pattern.proxy.smartproxy;

/**
 * @author tangang
 * @title UsageLogger
 * @date 2017/9/30
 */
public class UsageLogger {

    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void save(){
        System.out.println("==save logs into databases===");
    }
    public void save(String userId){
        setUserId(userId);
        save();
    }
}
