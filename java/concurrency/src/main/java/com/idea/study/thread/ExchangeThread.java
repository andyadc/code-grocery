package com.idea.study.thread;

import java.util.concurrent.Exchanger;

/**
 * @author andaicheng
 * @date 2016/6/19
 */
public class ExchangeThread extends Thread{
    private String str;
    private Exchanger<String> exchanger;
    private int sleepSecond;

    public ExchangeThread(String str, Exchanger<String> exchanger, int sleepSecond) {
        this.str = str;
        this.exchanger = exchanger;
        this.sleepSecond = sleepSecond;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.getName() + "启动, 原数据为" + str + ", 时间为" + System.currentTimeMillis());
            Thread.sleep(sleepSecond * 1000);
            str = exchanger.exchange(str);
            System.out.println(this.getName() + "交换了数据, 交换后的数据为" + str + ", 时间为" + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
