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
        grafica menu = new grafica();
        ranque ranque = new ranque();
        ranque.setGrafica(menu);
        atributos atributos = new atributos();
        atributos.setGrafica(menu);
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
///------------------------otilisador
        menu.menu_inicial();
        while (Nome == null) {
            Nome = teclado.next().toString();
            if (Nome == null) {
                menu.erro_Nome();
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
                menu.erro_Nome_catch();
                teclado.next();
            }
        } while (N_Participantes < 3 || N_Participantes > 150);
        //--------------------------------------------------------pista
        menu.menu_pista();
        do {
            try {
                Comprimento_pista = teclado.nextInt();
                if (Comprimento_pista < 100) {
                    menu.erro_Metros();
                }
            } catch (InputMismatchException e) {
                menu.erro_Metros_catch();
                teclado.next();
            }
        } while (Comprimento_pista < 100);
        percurso.setComprimento_pista(Comprimento_pista);//adisiona o Comprimento pista
        ///-----------------------enisialisacao dos objetos
        Thread thread[] = new Thread[N_Participantes];
        //---------------------------apostar
        menu.menu_caracteristicas();
        for (int i = 0; i < N_Participantes; i++) {
            thread[i] = new Thread(new caracol(percurso, (i), ranque, atributos,menu), "" + (i));
        }
        //------------------------------
        Opcoes = teclado.next().toString();
        if (Opcoes.equals("s")||Opcoes.equals("S")) {
            menu.menu_caracteristicas_sim();
            Opcoes = teclado.next().toString();
            if (Opcoes.equals("s")||Opcoes.equals("S")) {
                menu.fim();
                atributos.listar_inicial();
                menu.menu_patrocinar();
            }else {
                menu.fim();
                menu.menu_patrocinar();
            }
                do {
                    try {
                        Aposta = teclado.nextInt();
                        if (Aposta <0 || Aposta > N_Participantes){
                            menu.erro_Numero_Caracol();
                        } else {
                            break;
                        }
                    } catch (InputMismatchException e) {
                        menu.erro_Numero_Caracol_catch(N_Participantes);
                        teclado.next();
                    }
                } while (true);
                menu.fim();

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
        if (Aposta >= 0) {
            if (ranque.listar_1() == Aposta) {
                menu.aposta_ganho(Aposta, Nome);
            } else {
                menu.aposta_perdeu(Aposta, Nome);

            }
        }
    }
}
