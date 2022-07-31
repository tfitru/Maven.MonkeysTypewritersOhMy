package io.zipcoder;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Make this extend the Copier like `UnsafeCopier`, except use locks to make sure that the actual intro gets printed
 * correctly every time.  Make the run method thread safe.
 */
public class SafeCopier extends Copier{
    public SafeCopier(String toCopy) {
        super(toCopy);
    }

    public synchronized void run() {
        Lock lock = new ReentrantLock();
        lock.lock();
        try {
            Thread.sleep(100);
            while (stringIterator.hasNext()) {
                copied += stringIterator.next() + " ";
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println("SAFE");
            System.out.println(copied);
        }
        }


    }
