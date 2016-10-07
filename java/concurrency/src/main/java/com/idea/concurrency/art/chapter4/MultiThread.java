package com.idea.concurrency.art.chapter4;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.concurrent.locks.Lock;

/**
 * @author andaicheng
 * @date 2016/6/4
 */
public class MultiThread {

    /**
     * 一个普通的Java程序包含哪些线程
     */
    public static void main(String[] args) {
         ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        for (ThreadInfo threadInfo : threadInfos) {
            System.out.println("[" + threadInfo.getThreadId() + "]" + threadInfo.getThreadName());
        }
    }
}
