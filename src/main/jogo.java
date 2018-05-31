package main;

import java.util.InputMismatchException;
import java.util.Scanner;


public class jogo {

    public static void main(String[] args) {
        int N_Participantes = 0, Comprimento_pista = 0, Aposta = -1;
        String Nome = null, Opcoes;
        char Linguagem = ' ';
        Scanner teclado = new Scanner(System.in);
        //varivel como obegeto
        pista percurso = new pista();
        ranque ranque = new ranque();
        grafica menu = new grafica();
        atributos atributos = new atributos();
        //menu
        menu.Linguagem();
        do {
                Linguagem = teclado.next().charAt(0);
                if ( Linguagem != 'P'&& Linguagem != 'p'&& Linguagem != 'e'&&  Linguagem != 'E') {
                    menu.erro_Linguagem();
                }
                else if(Linguagem == 'P'|| Linguagem == 'p') {
                    if(Linguagem == 'P'|| Linguagem == 'p')
                        Linguagem='P';
                }else {
                    Linguagem='E';
                }
        } while ( Linguagem != 'P'&& Linguagem != 'p'&& Linguagem != 'e'&&  Linguagem != 'E');
        menu.setLinguagem(Linguagem);


        menu.menu_inicial();
        while (Nome == null) {
            Nome = teclado.next().toString();
            if (Nome == null) {
                System.out.print("                                   ║               O Seu Nome senhor(a): ");
            }
        }
        //--------------------------------------------------------participantes
        menu.menu_participantes();
        do {
            try {
                N_Participantes = teclado.nextInt();
                if (N_Participantes < 3 || N_Participantes > 150) {
                    menu.erro_Numero();
                }
            } catch (InputMismatchException e) {
                System.out.println("                                   ║                                                                       ║ ");
                System.out.println("                                   ║             A Grande Corrida Precisa De Um Inteiro Entre 3 E 150      ║       ");
                System.out.print("                                   ║               O Numero de participantes : ");

                teclado.next();
            }
        } while (N_Participantes < 3 || N_Participantes > 150);
        //--------------------------------------------------------pista
        menu.menu_pista();
        do {
            try {
                Comprimento_pista = teclado.nextInt();
                if (Comprimento_pista < 100) {
                    System.out.print("                                   ║               O Numero De Metros : ");
                }
            } catch (InputMismatchException e) {
                System.out.println("                                   ║                                                                       ║ ");
                System.out.println("                                   ║             A Grande Corrida Precisa De Um Inteiro Maior Que 100      ║       ");
                System.out.print("                                   ║               O Numero De Metros : ");

                teclado.next();
            }
        } while (Comprimento_pista < 100);
        percurso.setComprimento_pista(Comprimento_pista);//adisiona o Comprimento pista


        ///-----------------------enisialisacao dos objetos
        Thread thread[] = new Thread[N_Participantes];
        // caracol caracols[] = new caracol[N_Participantes];

        //---------------------------apostar
        menu.menu_características();
        for (int i = 0; i < N_Participantes; i++) {
            thread[i] = new Thread(new caracol(percurso, (i), ranque, atributos), "" + (i));
        }
        //------------------------------
        Opcoes = teclado.next().toString();
        if (Opcoes.equals("s")||Opcoes.equals("S")) {
            menu.menu_características_sim();
            Opcoes = teclado.next().toString();
            if (Opcoes.equals("s")||Opcoes.equals("S")){
                menu.fim();
                atributos.listar_inicial();
                menu.menu_patrocinar();
                do {
                    try {
                        Aposta = teclado.nextInt();
                        if (Aposta <= 0 && Aposta >= N_Participantes) {
                            System.out.print("                                    ║            Número Do Caracol : ");

                        } else {
                            break;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("                                   ║                                                                       ║ ");
                        System.out.println("                                   ║             A Grande Corrida Precisa De Um Inteiro Maior Entre 0 e " + N_Participantes);
                        System.out.print("                                   ║               Número Do Caracol : ");

                        teclado.next();
                    }
                } while (true);
                menu.fim();
            } else {//---------n
                menu.fim();

                menu.menu_patrocinar();
                do {
                    try {
                        Aposta = teclado.nextInt();
                        if (Aposta <= 0 && Aposta >= N_Participantes) {
                            System.out.print("                                   ║            Número Do Caracol : ");

                        } else {
                            break;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("                                   ║                                                                       ║ ");
                        System.out.println("                                   ║             A Grande Corrida Precisa De Um Inteiro Maior Entre 0 e " + N_Participantes);
                        System.out.print("                                   ║               Número Do Caracol : ");

                        teclado.next();
                    }
                } while (true);
                menu.fim();
            }
        } else {
            menu.fim();
        }


        for (int i = 0; i < N_Participantes; i++) {
            thread[i].start();
        }
        ranque.listar();
        for (int i = 0; i < N_Participantes; i++) {
            try {
                thread[i].join();
            } catch (InterruptedException ex) {
            }
        }

        ranque.listar_3();
        atributos.listar_final();
        //ranque.listar();
        if (Aposta >= 0) {
            if (ranque.listar_1() == Aposta) {
                menu.aposta_ganho(Aposta, Nome);
            } else {
                menu.aposta_perdeu(Aposta, Nome);

            }
        }
    }

}
