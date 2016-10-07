package com.idea.study.concurrency.basic;

import com.idea.study.concurrency.utils.SleepUtils;

/**
 * @author andaicheng
 * @date 2016/4/2
 *
 * 守护线程
 */
public class Deamon {
    public static void main(String[] args) {
        Thread thread = new Thread(new DeamonRunner(), "DeamonRunner");
        thread.setDaemon(false);
        thread.start();
    }

    static class DeamonRunner implements Runnable {

        @Override
        public void run() {
            try {
                SleepUtils.second(100);
            } finally {
                System.out.println("DeamonThread finally run.");
            }
        }
    }
}
