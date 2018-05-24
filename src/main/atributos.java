package main;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class atributos {

    private int[] velocidade= new int[50];
    private int[] tempo_descanso= new int[50];
    private int[] numero_caracol= new int[50];
    private int[] unidades_descanso= new int[50];
    private int[] tempo_de_movimento= new int[50];
    private final Lock queueLock = new ReentrantLock();
    private int cont=0;
    private grafica grafica=new grafica();

    public atributos(){

}
    public void adicionar(int numero_caracol, int velocidade, int tempo_descanso, int unidades_descanso, int tempo_de_movimento) {
        queueLock.lock();

        this.velocidade[numero_caracol] = velocidade;
        this.tempo_descanso[numero_caracol] = tempo_descanso;
        this.unidades_descanso[numero_caracol] = unidades_descanso;
        this.numero_caracol[numero_caracol] = numero_caracol;
        this.tempo_de_movimento[numero_caracol] = tempo_de_movimento;
        cont+=1;

        queueLock.unlock();
    }
    public void listar() {
        queueLock.lock();
        grafica.titolo();
        for (int i = 0; i < cont; i++) {
            grafica.características_caracois(numero_caracol[i],velocidade[i],tempo_descanso[i],unidades_descanso[i],tempo_de_movimento[i]);
        }
        queueLock.unlock();

    }
}
