package com.tg.design.pattern.singleton.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author tangang
 * @title ConfigManager
 * @date 2017/9/20
 */
public class ConfigManager {

    private static final String PFILE = ConfigManager.class.getClassLoader().getResource
            ("log4j2.properties").getFile();

    private File m_file = null;

    private long m_lastModifiedTime = 0;

    private Properties m_props = null;

    private static ConfigManager m_instance = new ConfigManager();
    private ConfigManager(){
        m_file = new File(PFILE);
        m_lastModifiedTime = m_file.lastModified();
        if(m_lastModifiedTime == 0){
            System.out.println(PFILE + " file does not exist!");
        }
        m_props = new Properties();

        try {
            m_props.load(new FileInputStream(PFILE));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public synchronized static ConfigManager getInstance(){
        return m_instance;
    }
    final public Object getConfigItem(String name,Object defaultVal){

        long newTime = m_file.lastModified();
        if(newTime == 0){
            if(m_lastModifiedTime == 0){
                System.out.println(PFILE + " file does not exist!");
            }
            else {
                System.out.println(PFILE + " was deleted!");
            }
            return defaultVal;
        }
        else if(newTime > m_lastModifiedTime){
            m_props.clear();
            try {
                m_props.load(new FileInputStream(PFILE));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        m_lastModifiedTime = newTime;
        Object val = m_props.getProperty(name);
        if(val == null){
            return defaultVal;
        }else{
            return val;
        }

    }

    public static void main(String[] args) {

        System.out.println(ConfigManager.getInstance().getConfigItem("rootLogger.level",
                "default"));
    }
}
