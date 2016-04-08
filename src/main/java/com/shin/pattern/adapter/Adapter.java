package com.shin.pattern.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Author : shin
 * Date : 2016/4/8
 * Desc:
 */
public class Adapter implements Target{

    public static final Logger logger = LoggerFactory.getLogger(Adapter.class);
    private Adaptee adaptee = new Adaptee();

    public void methodA() {
        logger.info("Adapter methodA invoke");
        adaptee.methodB();
    }
}
