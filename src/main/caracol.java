package main;

import java.util.Random;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class caracol extends Thread {
    private final Lock queueLock = new ReentrantLock();
    //---------var
    private int numero_caracol, velocidade, tempo_descanso, unidades_descanso, tempo_de_movimento, distancia_percorrida = 0, total_movimentos, descanso, distancia_pista, r;
    private long tempoInicial, tempoFinal, tempo;
    //private int;
    private Random gerador = new Random();
    private pista Comprimento_pista = new pista();
    private ranque ranque = new ranque();
    private atributos atributos = new atributos();
    grafica grafica =new grafica();
    //------------get/set
    public int getTempo_movimento() {
        return tempo_de_movimento;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public caracol(pista Comprimento_pista, int numero_caracol, ranque ranque, atributos atributos,grafica menu) {
        this.grafica= menu;
        this.ranque = ranque;
        this.atributos = atributos;
        this.numero_caracol = numero_caracol;
        this.velocidade = gerador.nextInt(10) + 1;
        this.tempo_descanso = gerador.nextInt(250) + 1;
        this.unidades_descanso = gerador.nextInt(7) + 10;
        this.tempo_de_movimento = gerador.nextInt(250) + 350;
        this.distancia_pista = Comprimento_pista.getComprimento_pista();
        atributos.adicionar_inicial(numero_caracol, velocidade, tempo_descanso, unidades_descanso, tempo_de_movimento, descanso);
    }
    //------------------------cod
    public void movimento() {
        this.distancia_percorrida += gerador.nextInt(getVelocidade() + 1);
        this.total_movimentos++;
    }
    public void Descansar(int descanso) {
        try {
            new Thread().sleep(descanso);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
    public void guarda_posicao() {
        synchronized (ranque) {
            this.r = ranque.adicionar(this.numero_caracol);
        }
    }
    public void correr() {
        queueLock.lock();
        while (this.distancia_pista > this.distancia_percorrida) {

            movimento();

            if (this.total_movimentos % this.unidades_descanso == 0) {
                Descansar(gerador.nextInt(tempo_descanso) + 1);
            }
            Descansar(gerador.nextInt(getTempo_movimento()));
           grafica.movimento_caracol(this.distancia_percorrida,this.numero_caracol,this.distancia_pista);
            //System.out.println(this.distancia_percorrida + "m caracol " + this.numero_caracol + " total " + this.distancia_pista);//-----------por na grafica em pt e en
        }

        guarda_posicao();
        int p = this.ranque.procurar_ranque(this.numero_caracol);
        tempoFinal = System.currentTimeMillis();
        tempo = ((tempoFinal - tempoInicial) / 1000);
        atributos.adicionar_final(this.numero_caracol, this.total_movimentos, this.distancia_percorrida, this.r, this.tempo);
        queueLock.unlock();
        //ranque.listar();
    }
    public void run() {
        tempoInicial = System.currentTimeMillis();
        System.out.println("caracol numero " + Thread.currentThread().getName() + " esta pronto para começar");
        correr();
    }
}
