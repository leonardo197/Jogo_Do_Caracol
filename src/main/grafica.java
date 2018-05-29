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
    public void menu_patrocinar(){
        System.out.println("                                   ╔════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("                                   ║                                                                       ║ ");
        System.out.println("                                   ║      A Grande Corrida Precisa De Saber Qual Dos                       ║ ");
        System.out.println("                                   ║      Nossos Grandes Caracois Pretende Patrocin                        ║ ");
        System.out.println("                                   ║                                                                       ║ ");
        System.out.print("                                   ║            Número Do Caracol : ");
    }
    public void titolo(){
        System.out.println("                                   ╔════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("                                   ║                                                                       ║ ");
        System.out.println("                                   ║      A Grande Corrida Tem O Prazer De Apresentar                      ║ ");
        System.out.println("                                   ║      Os Nossos Grandes Caracois                                       ║ ");
        fim();
        System.out.println();
        System.out.println("                                   ╔═════════════╦═══════════════════╦═════════════════╦════════════════╗");
        System.out.println("                                   ║ Velocidade ║     Tempo De    ║ Quantos Metros║  Tempo Por   ║");
        System.out.println("                                   ║            ║     Descanso    ║ Um Movimento  ║   movimento  ║");
        System.out.println("                                   ╚═════════════╩═══════════════════╩═════════════════╩════════════════╝");
    }
    public void titolo_final(){
        System.out.println("                                   ╔════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("                                   ║                                                                       ║ ");
        System.out.println("                                   ║      A Grande Corrida Tem O Prazer De Apresentar                      ║ ");
        System.out.println("                                   ║      Os Resultado De Todos Os Grandes Caracois                        ║ ");
        fim();
        System.out.println();
        System.out.println("                                   ╔═════════════╦═══════════════════╦═════════════════╦════════════════╦════════════════╦════════════════╦════════════════╗");
        System.out.println("                                   ║ Velocidade ║     Tempo De    ║ Quantos Metros║  Tempo Por   ║   Total De   ║  Distanasia   ║   Posição    ║");
        System.out.println("                                   ║            ║     Descanso    ║ Um Movimento  ║  movimento   ║   Movimentos ║  Percorrida   ║              ║      ");
        System.out.println("                                   ╚═════════════╩═══════════════════╩═════════════════╩════════════════╩════════════════╩════════════════╩════════════════╝");
    }
    public void fim(){
        System.out.println("                                   ║                                                                       ║ ");
        System.out.println("                                   ╚════════════════════════════════════════════════════════════════════════════════╝");
        System.out.println();
    }

    public void características_caracois(int numero_caracol,int velocidade,int tempo_descanso,int unidades_descanso,int tempo_de_movimento)
    {
        System.out.println("                                   ╔═════════════╦═══════════════════╦════════════════╦═════════════════╗");
        System.out.println(" O Grande Caracol De Numero "+numero_caracol+"           "+velocidade+"              "+tempo_descanso+"              "+unidades_descanso+"           "+tempo_de_movimento+"       ");
        System.out.println("                                   ╚═════════════╩═══════════════════╩════════════════╩═════════════════╝");
    }
    public void podio_3(int i1,int i2, int i3){
        System.out.println("                                   ╔════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("                                   ║                                                                       ║ ");
        System.out.println("                                   ║      A Grande Corrida Tem O Prazer De Apresentar                      ║ ");
        System.out.println("                                   ║      Os Grandes Vencedores                                            ║ ");
        fim();
        System.out.println();
        System.out.println();
        System.out.println("                                                     "+i1);
        System.out.println();
        System.out.println("                                                ╔══════════════╗   ");
        System.out.println("                                                ║      1º     ║    "+i2);
        System.out.println("                                                ║    Lugar    ║   ");
        System.out.println("                                                ║             ╠══════════════╗   ");
        System.out.println("                                                ║             ║      2º     ║    "+i3);
        System.out.println("                                                ║             ║    Lugar    ║");
        System.out.println("                                                ║             ║             ╠══════════════╗   ");
        System.out.println("                                                ║             ║             ║      3º     ║ ");
        System.out.println("                                                ║             ║             ║    Lugar    ║");
        System.out.println("                                                ║             ║             ║             ║ ");
        System.out.println("                                                ╚══════════════╩═══════════════╩═══════════════╝");
        System.out.println();
        System.out.println();
    }

    public void características_caracois_final(int numero_caracol,int velocidade,int tempo_descanso,int unidades_descanso,int tempo_de_movimento,int total_movimentos,int distancia_percorrida,int ranque)
    {
        System.out.println("                                   ╔═════════════╦═══════════════════╦════════════════╦════════════════╦════════════════╦════════════════╦═════════════════╗");
        System.out.println(" O Grande Caracol De Numero "+numero_caracol+"           "+velocidade+"              "+tempo_descanso+"              "+unidades_descanso+"           "+tempo_de_movimento+"              "+
                                                         total_movimentos+"             "+distancia_percorrida+"             "+ranque+"º" );
        System.out.println("                                   ╚═════════════╩═══════════════════╩════════════════╩════════════════╩════════════════╩════════════════╩═════════════════╝");
    }
}
