package main;

import javafx.stage.Screen;


public class grafica {
    public void grafica(){}
    public int numero_caracol,velocidade,tempo_descanso,unidades_descanso,tempo_de_movimento,descanso,distancia_pista,N_Participantes=0,Comprimento_pista,n_letraras;

    public void menu_inicial(){
        System.out.println("                                   ╔════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("                                   ║                 Bem Vindo A Grande Corrida De Caracois                ║ ");
        System.out.println("                                   ║                                                                       ║ ");
        System.out.println("                                   ║                Ha Grande Corrida Precisa De Alguns Dados              ║ ");
        System.out.println("                                   ║                     Se Pretender Começar Aqui Vamos.                  ║ ");
        System.out.println("                                   ║                                                                       ║ ");
        System.out.println("                                   ║               A Grande Corrida Precisa De Saber O Seu Nome            ║ ");
        System.out.println("                                   ║                                                                       ║ ");
        System.out.print("                                   ║               O Seu Nome senhor(a): ");
    }
    public void menu_participantes(){
        System.out.println("                                   ║                                                                       ║ ");
        System.out.println("                                   ║      A Grande Corrida Precisa De Saber O Numero de participantes      ║ ");
        System.out.println("                                   ║                                                                       ║ ");
        System.out.print("                                   ║               O Numero de participantes : ");
    }
    public void menu_pista(){
        System.out.println("                                   ║                                                                       ║ ");
        System.out.println("                                   ║      A Grande Corrida Precisa De Saber O Conto Metros Deseja          ║ ");
        System.out.println("                                   ║                       Os Grandes Caracois Metros                      ║ ");
        System.out.println("                                   ║                                                                       ║ ");
        System.out.print("                                   ║               O Numero De Metros : ");
    }

    public void menu_características(){
        System.out.println("                                   ║                                                                       ║ ");
        System.out.println("                                   ║      A Grande Corrida Precisa De Saber Se Pretende                    ║ ");
        System.out.println("                                   ║             Patrocinar Nos Grandes Caracois                           ║ ");
        System.out.println("                                   ║                                                                       ║ ");
        System.out.print("                                   ║               Sim[s] Nao[n] : ");
    }

    public void menu_características_sim(){
        System.out.println("                                   ║                                                                       ║ ");
        System.out.println("                                   ║      A Grande Corrida Precisa De Saber Se Gostaria                    ║ ");
        System.out.println("                                   ║      De Ter Informações Sobre Os Grandes Caracois                     ║ ");
        System.out.println("                                   ║                                                                       ║ ");
        System.out.print("                                   ║               Sim[s] Nao[n] : ");
    }

    public void titolo(){
        System.out.println("                                   ╔════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("                                   ║                                                                       ║ ");
        System.out.println("                                   ║      A Grande Corrida Tem O Prazer De Apresentar                      ║ ");
        System.out.println("                                   ║      Os Nossos Grandes Caracois                                       ║ ");
        fim();
        System.out.println();
        System.out.println("                                   ╔═════════════╦═══════════════════╦═════════════════╦════════════════╗");
        System.out.println("                                   ║ Velocidade ║   Tempo Para    ║ contos metros ║  tempo para  ║");
        System.out.println("                                   ║  Descanso  ║ para o descanso ║ um movimento  ║ um movimento ║");
        System.out.println("                                   ╚═════════════╩═══════════════════╩═════════════════╩════════════════╝");


    }
    public void fim(){
        System.out.println("                                   ║                                                                       ║ ");
        System.out.println("                                   ╚════════════════════════════════════════════════════════════════════════════════╝");
    }

    public void características_caracois(int numero_caracol,int velocidade,int tempo_descanso,int unidades_descanso,int tempo_de_movimento)
    {
        System.out.println("                                   ╔═════════════╦═══════════════════╦════════════════╦═════════════════╗");
        System.out.println(" O Grande Caracol De Numero "+numero_caracol+"      ║     "+velocidade+"      ║        "+tempo_descanso+"        ║      "+unidades_descanso+"      ║     "+tempo_de_movimento+"       ║");
        System.out.println("                                   ╚═════════════╩═══════════════════╩════════════════╩═════════════════╝");


    }
}
