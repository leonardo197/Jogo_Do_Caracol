package main;

public class ranque {
    grafica grafica= new grafica();
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
    public void listar_3(){
        grafica.podio_3(ranque[0],ranque[1],ranque[2]);
    }
    public int procurar_ranque(int numero){
        int p=0;
        for (int i = 0; i < 50; i++) {
            if (ranque[i]==numero){
                p= ranque[i];
                break;
            }
        }
        return p;

    }

}
