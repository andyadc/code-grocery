package com.idea.study.thread;

/**
 * @author andaicheng
 * @date 2016/6/18
 */
public class MyThreadTest {

    public static void main(String[] args) throws InterruptedException {

        //MyThread00 thread00 = new MyThread00();
        //System.out.println(thread00.isAlive());
        //thread00.setDaemon(true);
        //thread00.start();
        //thread00.interrupt();
        //thread00.join();

        //Thread thread01 = new Thread(new MyThread01());
        //thread01.run();


        /*for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "在运行->" + i);
        }*/

//        MyThread03 thread03 = new MyThread03();
//        thread03.setName("a thread");
//        thread03.start();

        //MyThread04 thread04 = new MyThread04();
        //thread04.start();

//        ThreadDomain05 td = new ThreadDomain05();
//        MyThread05_1 thread05_1 = new MyThread05_1(td);
//        MyThread05_2 thread05_2 = new MyThread05_2(td);
//        thread05_1.start();
//        thread05_2.start();

//        ThreadDomain06 td = new ThreadDomain06();
//        MyThread06_1 thread06_1 = new MyThread06_1(td);
//        MyThread06_2 thread06_2 = new MyThread06_2(td);
//        thread06_1.setName("A");
//        thread06_2.setName("B");
//        thread06_1.start();
//        thread06_2.start();

//        MyThread07 thread07 = new MyThread07();
//        thread07.start();

//        DeadLock lock = new DeadLock();
//        MyThreadDead01 myThreadDead01 = new MyThreadDead01(lock);
//        MyThreadDead02 myThreadDead02 = new MyThreadDead02(lock);
//        myThreadDead01.start();
//        myThreadDead02.start();

//        ThreadDomain08 td = new ThreadDomain08();
//        MyThread08 myThread08 = new MyThread08(td);
//        myThread08.start();
//        Thread.sleep(5000);
//        td.signal();

        //final ThreadDomain09 td = new ThreadDomain09();
        final ThreadDomain10 td10 = new ThreadDomain10();
        Runnable readRunnable = new Runnable() {
            @Override
            public void run() {
                td10.write();
            }
        };

        Thread t1 = new Thread(readRunnable);
        Thread t2 = new Thread(readRunnable);
        t1.start();
        t2.start();
    }
}
