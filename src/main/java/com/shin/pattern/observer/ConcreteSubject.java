package com.shin.pattern.observer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Author : shin
 * Date : 2016/4/8
 */
public class ConcreteSubject  implements Subject{

    public static final Logger logger = LoggerFactory.getLogger(ConcreteSubject.class);

    private int state;

    public void registerObserver(Observer observer) {
        logger.info("register observer");
        observers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for(Observer observer:observers){
            logger.info("notify all observers start");
            observer.update();
            logger.info("notify all observers end");
        }
    }

    public void setState(int state) {
        logger.info("set state:{}",state);
        this.state = state;
        notifyObservers();
    }

    public int getState() {
        return state;
    }


}
