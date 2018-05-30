package main;

public class ranque {
    grafica grafica = new grafica();
    int[] ranque = new int[150];
    int count = 0;

    public int adicionar(int nome) {
        if (count < (ranque.length - 1)) {
            ranque[count++] = nome;
        }
        return count;
    }

    public void listar() {
        for (int i = 0; i < count; i++) {
            System.out.println(ranque[i]);
        }
    }

    public void listar_3() {
        grafica.podio_3(ranque[0], ranque[1], ranque[2]);
    }

    public int listar_1() {
        return ranque[0];
    }

    public int procurar_ranque(int numero) {
        int p = 0;
        for (int i = 0; i < count; i++) {
            if (ranque[i] == numero) {
                p = ranque[i];
                break;
            }
        }
        return p;
    }

}
