package com.idea.study.thread;

import java.util.concurrent.Callable;

/**
 * @author andaicheng
 * @date 2016/6/21
 */
public class CallableThread implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("进入CallableThread的call()方法, 开始睡觉, 睡觉时间为" + System.currentTimeMillis());
        Thread.sleep(10000);
        return "abc";
    }
}
