package com.idea.study.concurrency.utils;

import java.util.concurrent.TimeUnit;

/**
 * @author andaicheng
 * @date 2016/4/2
 */
public class SleepUtils {

    public static void second(long seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
