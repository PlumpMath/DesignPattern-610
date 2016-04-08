package com.shin.pattern.adapter;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Author : shin
 * Date : 2016/4/8
 */
public class Adaptee {
    public static final Logger logger = LoggerFactory.getLogger(Adaptee.class);

    public void methodB(){
        logger.info("Adaptee  methodB invoke");
    }
}
