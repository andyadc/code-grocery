package com.idea.study.thread;

import java.util.concurrent.Exchanger;

/**
 * @author andaicheng
 * @date 2016/6/19
 */
public class ExchangeThreadTest {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();

        ExchangeThread thread1 = new ExchangeThread("abc", exchanger, 2);
        ExchangeThread thread2 = new ExchangeThread("123", exchanger, 3);

        thread1.start();
        thread2.start();
    }


}

