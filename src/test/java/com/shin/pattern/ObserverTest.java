package com.shin.pattern;


import com.shin.pattern.observer.ConcreteObserver;
import com.shin.pattern.observer.ConcreteSubject;
import com.shin.pattern.observer.Observer;
import org.junit.Test;

/**
 * Author : of1200
 * Date : 2016/4/8
 * Desc:
 */
public class ObserverTest {

    @Test
    public void testNotify(){
        Observer observer = new ConcreteObserver();
        ConcreteSubject subject = new ConcreteSubject();

        subject.registerObserver(observer);
        subject.setState(1);
        subject.setState(2);

    }
}
