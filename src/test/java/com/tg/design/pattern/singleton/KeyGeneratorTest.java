package com.tg.design.pattern.singleton;

import com.tg.design.pattern.singleton.example.KeyGenerator;
import org.junit.Test;

/**
 * @author tangang
 * @title KeyGeneratorTest
 * @date 2017/9/21
 */
public class KeyGeneratorTest {

    @Test
    public void testGetKey(){
        KeyGenerator keygen = KeyGenerator.getInstance();
        System.out.println("key = " + keygen.getNextKey());
        System.out.println("key = " + keygen.getNextKey());
        System.out.println("key = " + keygen.getNextKey());
    }
}
