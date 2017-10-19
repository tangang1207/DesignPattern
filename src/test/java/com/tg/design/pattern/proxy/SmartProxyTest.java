package com.tg.design.pattern.proxy;

import com.tg.design.pattern.proxy.smartproxy.Proxy;
import com.tg.design.pattern.proxy.smartproxy.Searcher;
import org.junit.Test;

import java.net.SocketTimeoutException;

/**
 * @author tangang
 * @title SmartProxyTest
 * @date 2017/9/30
 */
public class SmartProxyTest {

    @Test
    public void testSmartSeacher(){

        Searcher searcher = new Proxy();

        String result = searcher.doSearch("admin","test");
        System.out.println("result = " + result);
    }
}
