package com.idea.study.concurrencyutils;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author andaicheng
 * @date 2016/7/7
 */
public class BlockingQueueTest {

    private static final int queueSize = 3;
    private static final int produceSpeed = 2000;
    private static final int consumeSpeed = 200;
    private static final BlockingQueue<String> QUEUE = new ArrayBlockingQueue<>(queueSize);

    public static void main(String[] args) {
        Producer producer = new Producer();
        Consumer consumer = new Consumer();
        producer.start();
        consumer.start();
    }

    static class Producer extends Thread {

        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println("老板准备炸油条了，架子上还能放：" + (queueSize - QUEUE.size()) + "根油条");
                    QUEUE.put("一根油条");
                    System.out.println("老板炸好了1根油条，架子上还能放：" + (queueSize - QUEUE.size()) + "根油条");
                    Thread.sleep(produceSpeed);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Consumer extends Thread {

        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println("A 准备买油条了，架子上还剩" + QUEUE.size() + "根油条");
                    QUEUE.take();
                    System.out.println("A 买到1根油条，架子上还剩" + QUEUE.size() + "根油条");
                    Thread.sleep(consumeSpeed);

                    System.out.println("B 准备买油条了，架子上还剩" + QUEUE.size() + "根油条");
                    QUEUE.take();
                    System.out.println("B 买到1根油条，架子上还剩" + QUEUE.size() + "根油条");
                    Thread.sleep(consumeSpeed);

                    System.out.println("C 准备买油条了，架子上还剩" + QUEUE.size() + "根油条");
                    QUEUE.take();
                    System.out.println("C 买到1根油条，架子上还剩" + QUEUE.size() + "根油条");
                    Thread.sleep(consumeSpeed);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
