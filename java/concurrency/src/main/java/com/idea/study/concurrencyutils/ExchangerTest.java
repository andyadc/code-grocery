package com.idea.study.concurrencyutils;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author andaicheng
 * @date 2016/6/30
 */
public class ExchangerTest {

    private static final Exchanger<String> EXCHANGER = new Exchanger<>();
    private static ExecutorService threadPool = Executors.newFixedThreadPool(2);

    public static void main(String[] args) {
        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    String a = "银行流水1";
                    EXCHANGER.exchange(a);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    String b = "银行流水2";
                    String a = EXCHANGER.exchange(b);
                    System.out.println("A和B数据是否一致：" + a.equals(b) + ",A录入的是：" + a + ",B录入是：" + b);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        threadPool.shutdown();
    }
}
