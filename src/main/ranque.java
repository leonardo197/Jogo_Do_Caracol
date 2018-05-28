package main;
import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class ranque {
    int [] ranque = new int[50];
    int count = 0;
    public void adicionar(int nome){
        if(count < (ranque.length-1)) {
            ranque[count++] = nome;

        }
    }
    public void listar(){
        for (int i = 0; i < count; i++) {
            System.out.println(ranque[i]);
        }
    }
}
