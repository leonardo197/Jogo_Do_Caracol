package main;

import java.util.Random;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
class caracol extends Thread {
    private final Lock queueLock = new ReentrantLock();
    //---------var
    private int numero_caracol,velocidade,tempo_descanso,unidades_descanso,tempo_de_movimento,distancia_percorrida=0,total_movimentos,descanso,distancia_pista;
    //private int;
    private Random gerador = new Random();
    private pista Comprimento_pista =new pista();
    private ranque ranque=new ranque();

    //------------get/set
    public void setNumero_caracol(int numero_caracol) {
        this.numero_caracol = numero_caracol;
    }
    public int getTempo_descanso() {
        return tempo_descanso;
    }
    public int getTempo_movimento() {
        return tempo_de_movimento;
    }
    public int getUnidades_descanso() {
        return unidades_descanso;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public int getNumero_caracol() {
        return numero_caracol;
    }
    public int getDescanso() {
        return descanso;
    }
    public int getTempo_de_movimento() {
        return tempo_de_movimento;
    }


    public caracol(pista Comprimento_pista, int numero_caracol, ranque ranque)
    {
        this.numero_caracol=numero_caracol;
        this.velocidade=gerador.nextInt(5)+1;
        this.tempo_descanso=gerador.nextInt(5)+1;
        this.tempo_de_movimento=gerador.nextInt(250)+50;
        this.unidades_descanso=gerador.nextInt(7)+10;
        this.distancia_pista=Comprimento_pista.getComprimento_pista();
    }
    //------------------------cod


    public void movimento() {
        queueLock.lock();
        this.distancia_percorrida +=gerador.nextInt(getVelocidade()+1);
        this.total_movimentos++;
        queueLock.unlock();

    }
    public void Descansar(int descanso) {
        try {
        new Thread().sleep(descanso);
        }
        catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
    public void gorda_posiçao() {
        ranque.adicionar(numero_caracol);
    }

    public void correr() {
        while (this.distancia_pista>this.distancia_percorrida) {
            queueLock.lock();
            movimento();
            queueLock.unlock();
            if (this.total_movimentos%this.unidades_descanso==0){
                Descansar(gerador.nextInt(tempo_descanso)+1);
            }
            Descansar(gerador.nextInt(getTempo_movimento()));
            System.out.println(this.distancia_percorrida+"m caracol "+this.numero_caracol+ " total "+this.distancia_pista);
        }
        gorda_posiçao();
        ranque.listar();
    }






    public void run() {
        System.out.println("caracol numero "+Thread.currentThread().getName() + " esta pronto para começar");
        correr();
    }

}
