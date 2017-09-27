package com.tg.design.pattern.adapter.example;

import com.sun.deploy.xml.XMLParser;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author tangang
 * @title XMLProperties
 * @date 2017/9/25
 */
public class XMLProperties extends Properties {

    XMLParser p = null;

    public synchronized void load(InputStream in) throws IOException {

//        p = new XMLParser(in,this);

    }
}
