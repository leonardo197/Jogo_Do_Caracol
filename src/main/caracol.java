package main;

import java.util.Random;

import static java.lang.Thread.*;

class caracol implements Runnable {

    //---------var
    private int numero_caracol,velocidade,tempo_descanso,unidades_descanso,tempo_de_movimento,distancia_percorrida=0,total_movimentos,descanso;
    private Random gerador = new Random();
    private pista Comprimento_pista =new pista();

    //------------get/set
    public int getNumero_caracol() {
        return numero_caracol;
    }
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


    public caracol(pista Comprimento_pista, int numero_caracol )
    {
        this.numero_caracol=numero_caracol;
        this.velocidade=gerador.nextInt(5)+1;
        this.tempo_descanso=gerador.nextInt(5)+1;
        this.tempo_de_movimento=gerador.nextInt(55)+2;
        this.unidades_descanso=gerador.nextInt(5)+10;
    }
    //------------------------cod


    public void movimento() {
        this.distancia_percorrida +=gerador.nextInt(getVelocidade());
        this.total_movimentos++;
        Descansar(gerador.nextInt(getTempo_movimento()));

    }
    public void Descansar(int descanso) {
        try {
        new Thread().sleep(descanso);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void testador_de_vitoria(int descanso) {

    }

    public void correr() {
        System.out.println(this.distancia_percorrida+"m caracol "+this.numero_caracol+ " total "+Comprimento_pista.getComprimento_pista());
        while (Comprimento_pista.getComprimento_pista()<this.distancia_percorrida) {
            movimento();
            System.out.println(this.distancia_percorrida+"m "+this.numero_caracol);
        }
    }






    public void run() {
        System.out.println("caracol numero "+Thread.currentThread().getName() + " esta pronto para começar");
        correr();
    }

}
