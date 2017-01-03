package com.idea.study.concurrency.lock;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * @author andaicheng
 */
public class SimpleLock extends AbstractQueuedSynchronizer {

    private static final long serialVersionUID = 5501558026451453452L;

    protected SimpleLock() {
    }

    public void lock() {
        acquire(1);
    }

    public void tryLock(){
        tryAcquire(1);
    }

    public void unlock(){
        release(1);
    }

    @Override
    protected boolean tryAcquire(int arg) {
        if (compareAndSetState(0, 1)) {
            setExclusiveOwnerThread(Thread.currentThread());
            return true;
        }
        return false;
    }

    @Override
    protected boolean tryRelease(int arg) {
        setExclusiveOwnerThread(null);
        setState(0);
        return true;
    }

    @Override
    protected boolean isHeldExclusively() {
        return isHeldExclusively();
    }
}
