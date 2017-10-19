package com.tg.design.pattern.proxy.smartproxy;

/**
 * @author tangang
 * @title RealSearcher
 * @date 2017/9/30
 */
public class RealSearcher implements Searcher {
    @Override
    public String doSearch(String userId, String searchType) {
        System.out.println("=========RealSearcher do Search==============");
        return "OK";
    }
}
