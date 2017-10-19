package com.tg.design.pattern.proxy.smartproxy;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

/**
 * @author tangang
 * @title Proxy
 * @date 2017/9/30
 */
public class Proxy implements Searcher {

    private RealSearcher searcher;

    private UsageLogger usageLogger;

    private AccessValidator accessValidator;


    public Proxy() {
        searcher = new RealSearcher();
    }

    @Override
    public String doSearch(String userId, String searchType) {
        if(checkAccess(userId)){
            String result = searcher.doSearch(null, searchType);
            logUsage(userId);
        }
        return null;
    }

    private boolean checkAccess(String userId){
        accessValidator = new AccessValidator();
        return accessValidator.validateUser(userId);
    }

    private void logUsage(String userId){
        usageLogger = new UsageLogger();
        usageLogger.setUserId(userId);
        usageLogger.save();
    }
}
