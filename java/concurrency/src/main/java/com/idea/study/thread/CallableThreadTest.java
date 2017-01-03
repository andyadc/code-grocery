package com.idea.study.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * @author andaicheng
 * @date 2016/6/21
 */
public class CallableThreadTest {

    public static void main(String[] args) throws Exception {
        ExecutorService es = Executors.newCachedThreadPool();
        CallableThread callableThread = new CallableThread();
        FutureTask<String> futureTask = new FutureTask<String>(callableThread);
        es.submit(futureTask);
        es.shutdown();

        Thread.sleep(5000);
        System.out.println("主线程等待5秒, 当前时间为" + System.currentTimeMillis());
        String ret = futureTask.get();
        System.out.println("Future已拿到数据, str = " + ret + ", 当前时间为" + System.currentTimeMillis());
    }
}
