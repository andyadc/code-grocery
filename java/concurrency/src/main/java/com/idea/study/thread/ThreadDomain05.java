package com.idea.study.thread;

/**
 * @author andaicheng
 * @date 2016/6/18
 */
public class ThreadDomain05 {
    private int num = 0;
    public synchronized void addNum(String name){
        try {
            if ("a".equals(name)) {
                num = 100;
                System.out.println("a set over.");
                Thread.sleep(2000);
            } else {
                num = 200;
                System.out.println("b set over");
            }
            System.out.println(name + " num = " + num);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
