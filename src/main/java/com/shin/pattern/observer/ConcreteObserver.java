package com.shin.pattern.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Author : shin
 * Date : 2016/4/8
 * Desc:
 */
public class ConcreteObserver implements Observer {
    public static final Logger logger = LoggerFactory.getLogger(ConcreteObserver.class);

    public void update() {
        logger.info("update");
    }
}
