package main;

import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class pista {
    private int Comprimento_pista ;

    public int getComprimento_pista() {
        return this.Comprimento_pista;
    }

    public void setComprimento_pista(int comprimento_pista) {
        if ( comprimento_pista>99 ) {
            this.Comprimento_pista = comprimento_pista;
        }
}
    public void pista(int Comprimento_pista)
    {
        this.Comprimento_pista=Comprimento_pista;
    }
    //private final Lock queueLock = new ReentrantLock();
}
/*public void  correr(){
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
*/