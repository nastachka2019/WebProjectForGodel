package com.godel.test.connetion;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Класс для загрузки пропертей
 *
 * @author Shpakova A.
 */

class PropertyLoader {

    private static final Logger logger = LogManager.getLogger();

    Properties setProperty(String fileName) {
        Properties properties = new Properties();
        InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream(fileName); //загрузка(чтение) ресурса
        try {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            logger.fatal("Error loadFile", e);
        }
        return properties;
    }
}