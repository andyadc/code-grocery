package com.idea.study.thread;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author andaicheng
 * @date 2016/6/19
 */
public class ThreadPoolTest {

    public static void main(String[] args) {
//        withPool();
        withoutPool();
    }

    private static void withPool() {
        final long l1 = System.currentTimeMillis();
        final List<Integer> list = new LinkedList<>();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(100, 100, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
        final Random random = new Random();

        for (int i = 0; i < 20000; i ++) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    list.add(random.nextInt());
                }
            });
        }
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println((System.currentTimeMillis() - l1) + " ms");
        System.out.println(list.size());
    }

    private static void withoutPool() {
        final long l1 = System.currentTimeMillis();
        final List<Integer> list = new LinkedList<>();
        final Random random = new Random();

        for (int i = 0; i < 20000; i ++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    list.add(random.nextInt());
                }
            });
            thread.start();
            try {
                thread.join();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println((System.currentTimeMillis() - l1) + " ms");
        System.out.println(list.size());
    }

}
