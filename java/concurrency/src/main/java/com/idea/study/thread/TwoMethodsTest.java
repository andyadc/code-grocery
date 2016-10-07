package com.idea.study.thread;

/**
 * @author andaicheng
 */
public class TwoMethodsTest {

    public static void main(String[] args) {
        final TwoMethodsService service = new TwoMethodsService();

        new Thread(new Runnable() {
            @Override
            public void run() {
                service.method4();
            }
        }).start();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                service.method2();
//            }
//        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                service.method1();
            }
        }).start();

    }
}
