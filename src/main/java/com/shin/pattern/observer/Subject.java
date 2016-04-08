package com.shin.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Author : shin
 * Date : 2016/4/8
 */
public interface Subject {
    List<Observer> observers = new ArrayList<Observer>();

    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();

}
