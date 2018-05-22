package main;

import java.util.Scanner;



public class jogo {

    public static void main(String[] args) {



         int id,id_menu,N_Participantes=0,Comprimento_pista=0,Aposta=0;
          String Nome=null,Opcoes;
          Scanner teclado = new Scanner(System.in);
        //varivel como obegeto
          pista percurso=new pista();
         ranque ranque=new ranque();
        grafica menu= new grafica();
         //menu


        menu.menu_inicial();
        while (Nome==null) {
            Nome = teclado.next().toString();
            if (Nome==null){
                System.out.print("                                   ║               O Seu Nome senhor(a): ");
            }
        }

        //--------------------------------------------------------participantes
        menu.menu_participantes();
        do {
           N_Participantes = teclado.nextInt();
           if (N_Participantes<3||N_Participantes>100){
               System.out.print("                                   ║               O Numero de participantes : ");
           }
        }while (N_Participantes<3||N_Participantes>100);
       //--------------------------------------------------------pista
        menu.menu_pista();
        do{
         Comprimento_pista = teclado.nextInt();
    if (Comprimento_pista<100){
        System.out.print("                                   ║               O Numero De Metros : ");
    }
      }while (Comprimento_pista<100);
        percurso.setComprimento_pista(Comprimento_pista);//adisiona o Comprimento pista


        ///-----------------------enisialisacao dos objetos
        Thread thread[] = new Thread[N_Participantes];
        caracol caracols[]=new caracol[N_Participantes];

        //---------------------------apostar
        menu.menu_características();

        Opcoes = teclado.next().toString();
        if (Opcoes.equals("s"))
        {
            menu.menu_características_sim();
            Opcoes = teclado.next().toString();
            if (Opcoes.equals("s"))
            {//int numero_caracol,int velocidade,int tempo_descanso,int unidades_descanso,int tempo_de_movimento,int descanso
              //menu.características_caracois(caracols[N_Participantes].getNumero_caracol);
            }
        }




        for (int i = 0; i < N_Participantes; i++) {
            thread[i] = new Thread(new caracol(percurso,i,ranque),"" + i);//------****como por o arry de  objetos nas Threads
        }

        for (int i = 0; i < N_Participantes; i++) {
            thread[i].start();
        }
        ranque.listar();
        for (int i = 0; i < N_Participantes; i++) {
            try {
                thread[i].join();
            }catch (InterruptedException ex){}
        }
        ranque.listar();





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


    }
}
