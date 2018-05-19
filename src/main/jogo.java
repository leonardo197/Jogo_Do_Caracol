package main;

import java.util.Scanner;

public class jogo {

    public static void main(String[] args) {
        //variavel
        int id,id_menu,N_Participantes=0,Comprimento_pista=0,Aposta=0;
        String Nome=null,Opcoes;
        Scanner teclado = new Scanner(System.in);
        //varivel como obegeto
        pista percurso=new pista();

        //menu

        System.out.println("                 Menu inicial");
        System.out.println();
        while (Nome==null) {
            System.out.print("1________________Nome: ");
            Nome = teclado.next().toString();
        }


       do {
            System.out.print("2________________Numero de participantes: ");
            N_Participantes = teclado.nextInt();
        }while (N_Participantes<3);

       do {
    System.out.print("3________________Comprimento da pista: ");
    Comprimento_pista = teclado.nextInt();
      }while (Comprimento_pista<100);
        percurso.setComprimento_pista(Comprimento_pista);//adisiona o Comprimento pista

       do {
           System.out.print("4________________Ver características dos caracois? sim[s] nao[n] ");
           Opcoes = teclado.next().toString();
           if (Opcoes.equals("s"))
           {
               características();
           }
       }while (Opcoes=="s"||Opcoes=="n");


       do {
           System.out.print("5________________Apostar Em coal dos "+N_Participantes+ " caracois: ");
           Aposta = teclado.nextInt();
           System.out.println();
       }while (Aposta<0);



        Thread thread[] = new Thread[N_Participantes];
        caracol caracols[]=new caracol[N_Participantes];

        for (int i = 0; i < N_Participantes; i++) {
            thread[i] = new Thread(new caracol(percurso,i),
                    "" + i);
        }
        for (int i = 0; i < N_Participantes; i++) {
            thread[i].start();
        }
        /*for (int i = 0; i < N_Participantes; i++) {
            thread[i].join();
        }*/





    }
    public static int menu ()
    {
        Scanner teclado = new Scanner(System.in);
        int m;
        System.out.println("       Menu Conpelementar");
        System.out.println("1_______________Reinisiar");
        System.out.println("2________________Pausar");
        System.out.println("3______________Terminar");
        System.out.println();
        System.out.print("Opeçao:  ");
        m = teclado.nextInt();
        return m;
    }
    public static void características ()
    {
        Scanner teclado = new Scanner(System.in);
        int m;
        System.out.println("                 Características");
        System.out.println();
        System.out.println("1________________Velocidade");
        System.out.println("2________________Pausa para descanso");
        System.out.println("3________________Unidades de corrida ate o descanso");
        System.out.println();
        System.out.print("Opeçao:  ");
        m = teclado.nextInt();

    }
}
