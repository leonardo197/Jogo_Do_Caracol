package main;
import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class ranque {
    public int numero_caracol;
    int[] ranque = new int[100];
    int posicao=0;
    private final Lock queueLock = new ReentrantLock();

    public void ra
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
            for (int s : ranque) {
                System.out.println(s);
            }
        queueLock.unlock();

    }
}
