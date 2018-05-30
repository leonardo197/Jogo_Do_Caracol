package main;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class atributos {
    private int index = 150;

    private long[] tenpo = new long[index];
    private int[] ranque = new int[index];
    private int[] descanso = new int[index];
    private int[] velocidade = new int[index];
    private int[] tempo_descanso = new int[index];
    private int[] total_movimentos = new int[index];
    private int[] unidades_descanso = new int[index];
    private int[] tempo_de_movimento = new int[index];
    private int[] distancia_percorrida = new int[index];


    private final Lock queueLock = new ReentrantLock();
    private int cont = 0;
    private grafica grafica = new grafica();

    public atributos() {

    }

    public void adicionar_inicial(int numero_caracol, int velocidade, int tempo_descanso, int unidades_descanso, int tempo_de_movimento, int descanso) {
        queueLock.lock();

        this.descanso[numero_caracol] = descanso;
        this.velocidade[numero_caracol] = velocidade;
        this.tempo_descanso[numero_caracol] = tempo_descanso;
        this.unidades_descanso[numero_caracol] = unidades_descanso;
        this.tempo_de_movimento[numero_caracol] = tempo_de_movimento;
        cont += 1;
        queueLock.unlock();
    }

    public void adicionar_final(int numero_caracol, int total_movimentos, int distancia_percorrida, int ranque, long tenpo) {
        queueLock.lock();

        this.ranque[numero_caracol] = ranque;
        this.total_movimentos[numero_caracol] = total_movimentos;
        this.distancia_percorrida[numero_caracol] = distancia_percorrida;
        this.tenpo[numero_caracol] = tenpo;
        queueLock.unlock();
    }

    public void listar_inicial() {
        queueLock.lock();
        grafica.titolo();
        for (int i = 0; i < cont; i++) {
            grafica.características_caracois(i, velocidade[i], tempo_descanso[i], unidades_descanso[i], tempo_de_movimento[i]);
        }
        queueLock.unlock();
    }

    public void listar_final() {
        queueLock.lock();
        grafica.titolo_final();
        for (int i = 0; i < cont; i++) {
            grafica.características_caracois_final(i, velocidade[i], tempo_descanso[i], unidades_descanso[i], tempo_de_movimento[i], total_movimentos[i], distancia_percorrida[i], ranque[i], tenpo[i]);
        }
        queueLock.unlock();
    }

}
