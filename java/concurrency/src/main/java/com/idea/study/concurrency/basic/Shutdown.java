package com.idea.study.concurrency.basic;

import java.util.concurrent.TimeUnit;

/**
 * @author andaicheng
 * @date 2016/4/2
 */
public class Shutdown {
    public static void main(String[] args) throws InterruptedException {
        Runner one = new Runner();
        Thread countThead = new Thread(one, "CountThread");
        countThead.start();
        TimeUnit.SECONDS.sleep(1);
        countThead.interrupt();

        Runner two = new Runner();
        countThead = new Thread(two, "CountThread");
        countThead.start();
        TimeUnit.SECONDS.sleep(1);
        two.cancel();
    }

    private static class Runner implements Runnable {

        private long i;
        private volatile boolean on = true;

        @Override
        public void run() {
            while (on && !Thread.currentThread().isInterrupted()) {
                i ++;
            }
            System.out.println("Count i= " + i);
        }

        public void cancel() {
            on = false;
        }
    }
}
