package main;

import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class pista {

private final Lock queueLock = new ReentrantLock();
public void  correr(){
        queueLock.lock();
        try {
        Long duration = (long) (Math.random() * 10000);
        System.out.println(Thread.currentThread().getName()
                + ": Fila de impressão: imprimindo um trabalho durante " + (duration / 1000)
                + " segundos :: Tempo - " + new Date());
        Thread.sleep(duration);
    } catch (InterruptedException e) {
        e.printStackTrace();
    } finally {
        System.out.println(Thread.currentThread().getName()
                + ": O documento foi impresso");
        queueLock.unlock();
    }
}
}