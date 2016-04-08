package com.shin.pattern;

import com.shin.pattern.adapter.Adapter;
import com.shin.pattern.adapter.Target;
import org.junit.Test;

/**
 * Author : shin
 * Date : 2016/4/8
 * Desc:
 */
public class AdapterTest {

    @Test
    public void test(){
        Target t = new Adapter();
        t.methodA();
    }
}
