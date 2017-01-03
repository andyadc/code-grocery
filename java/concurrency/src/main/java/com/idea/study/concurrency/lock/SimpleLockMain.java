package com.idea.study.concurrency.lock;

/**
 * @author andaicheng
 */
public class SimpleLockMain {

    public static void main(String[] args) throws InterruptedException {
        final SimpleLock lock = new SimpleLock();
        lock.lock();

        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    lock.lock();
                    System.out.println(Thread.currentThread().getName() + " acquired the lock!");
                    lock.unlock();
                }
            }).start();
            Thread.sleep(100);
        }

        System.out.println("main thread unlock!");
        lock.unlock();
    }


}
