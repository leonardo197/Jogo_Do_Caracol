package main;
import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class ranque {
    private int numero_caracol;
    private int[] ranque = new int[50];
    private int posicao = 0;
    private final Lock queueLock = new ReentrantLock();

    public void ranque(){

    }
    public void adicionar(int numero_caracol) {
        queueLock.lock();
        for (int i = 0; i < ranque.length; i++) {
            if (ranque[i] != 0) {
                posicao += 1;
            }
        }
        this.ranque[posicao] = numero_caracol;
        queueLock.unlock();
    }
    public void listar() {
        queueLock.lock();
            for (int s = 0; s < posicao; s++) {
                System.out.println(s);
            }
        queueLock.unlock();
    }
}
