package main;

import javafx.stage.Screen;


public class grafica {
    char Linguagem;

    public void grafica() {

    }

    public void setLinguagem(char linguagem) {
        this.Linguagem = linguagem;
    }

    //public int numero_caracol,velocidade,tempo_descanso,unidades_descanso,tempo_de_movimento,descanso,distancia_pista,N_Participantes=0,Comprimento_pista,n_letraras;
    //------------------------------------normal
    //----------------------menu
    public void Linguagem() {
        System.out.println("");
        System.out.println("                                                  Linguagem                               Language          ");
        System.out.println("                                                  Português                                English          ");
        System.out.println("                                                      P                                       E          ");
        System.out.println();
        System.out.print("                                       Qual Q Língua(Which Language)?: ");
    }

    public void menu_inicial() {
        if (this.Linguagem == 'P') {
            System.out.println("                                   ╔════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("                                   ║                 Bem Vindo A Grande Corrida De Caracóis                ║ ");
            System.out.println("                                   ║                                                                       ║ ");
            System.out.println("                                   ║                A Grande Corrida Precisa De Alguns Dados              ║ ");
            System.out.println("                                   ║                     Se Pretender Começar Aqui Vamos.                  ║ ");
            System.out.println("                                   ║                                                                       ║ ");
            System.out.println("                                   ║               A Grande Corrida Precisa De Saber O Seu Nome            ║ ");
            System.out.println("                                   ║                                                                       ║ ");
            System.out.print("                                   ║               O Seu Nome senhor(a): ");
        } else {
            System.out.println("                                   ╔════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("                                   ║                 Welcome The Great Race Of Snails                      ║ ");
            System.out.println("                                   ║                                                                       ║ ");
            System.out.println("                                   ║                There's Great Race Needs Some Data                     ║ ");
            System.out.println("                                   ║                     If You Want To Start Here.                        ║ ");
            System.out.println("                                   ║                                                                       ║ ");
            System.out.println("                                   ║               The Great Race Needs To Know Your Name                  ║ ");
            System.out.println("                                   ║                                                                       ║ ");
            System.out.print("                                   ║               Your Name Mr.(Ms): ");
        }
    }

    public void menu_participantes() {
        if (this.Linguagem == 'P') {
            System.out.println("                                   ║                                                                       ║ ");
            System.out.println("                                   ║      A Grande Corrida Precisa De Saber O Numero de participantes      ║ ");
            System.out.println("                                   ║                                                                       ║ ");
            System.out.print("                                   ║               O Numero de participantes : ");
        } else {

            System.out.println("                                   ║                                                                       ║ ");
            System.out.println("                                   ║      The Great Race Needs To Know The Number Of Participants      ║ ");
            System.out.println("                                   ║                                                                       ║ ");
            System.out.print("                                   ║               O Number of participants : ");
        }
    }

    public void menu_pista() {
        if (this.Linguagem == 'P') {
            System.out.println("                                   ║                                                                       ║ ");
            System.out.println("                                   ║      A Grande Corrida Precisa De Saber O Quantos Metros Deseja          ║ ");
            System.out.println("                                   ║                       Os Grandes Caracois Metros                      ║ ");
            System.out.println("                                   ║                                                                       ║ ");
            System.out.print("                                   ║               O Numero De Metros : ");
        } else {
            System.out.println("                                   ║                                                                       ║ ");
            System.out.println("                                   ║      The Great Race Needs To Know How Many Meters Do You Want          ║ ");
            System.out.println("                                   ║                       The Big Snails Meters                      ║ ");
            System.out.println("                                   ║                                                                       ║ ");
            System.out.print("                                   ║               The number of meters : ");
        }
    }

    public void menu_características() {
        if (this.Linguagem == 'P') {
            System.out.println("                                   ║                                                                       ║ ");
            System.out.println("                                   ║      A Grande Corrida Precisa De Saber Se Pretende                    ║ ");
            System.out.println("                                   ║             Patrocinar Nos Grandes Caracois                           ║ ");
            System.out.println("                                   ║                                                                       ║ ");
            System.out.print("                                   ║               Sim[s] Nao[n] : ");
        } else {
            System.out.println("                                   ║                                                                       ║ ");
            System.out.println("                                   ║                The Great Race Needs To Know                           ║ ");
            System.out.println("                                   ║                  Sponsor In Great Snails                              ║ ");
            System.out.println("                                   ║                                                                       ║ ");
            System.out.print("                                   ║               Yes [s] No [n] : ");
        }
    }

    public void menu_características_sim() {
        if (this.Linguagem == 'P') {
            System.out.println("                                   ║                                                                       ║ ");
            System.out.println("                                   ║      A Grande Corrida Precisa De Saber Se Gostaria                    ║ ");
            System.out.println("                                   ║      De Ter Informações Sobre Os Grandes Caracois                     ║ ");
            System.out.println("                                   ║                                                                       ║ ");
            System.out.print("                                   ║               Sim[s] Nao[n] : ");
        } else {
            System.out.println("                                   ║                                                                       ║ ");
            System.out.println("                                   ║      The Great Race Needs To Know If You Would Like                   ║ ");
            System.out.println("                                   ║      To Have Information About Big Snails                             ║ ");
            System.out.println("                                   ║                                                                       ║ ");
            System.out.print("                                   ║               Yes [s] No [n] : ");
        }
    }

    public void menu_patrocinar() {
        if (this.Linguagem == 'P') {
            System.out.println("                                   ╔════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("                                   ║                                                                       ║ ");
            System.out.println("                                   ║      A Grande Corrida Precisa De Saber Qual Dos                       ║ ");
            System.out.println("                                   ║      Nossos Grandes Caracois Pretende Patrocin                        ║ ");
            System.out.println("                                   ║                                                                       ║ ");
            System.out.print("                                   ║            Número Do Caracol : ");
        } else {
            System.out.println("                                   ╔════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("                                   ║                                                                       ║ ");
            System.out.println("                                   ║      To Have Information About Big Snails                             ║ ");
            System.out.println("                                   ║      Our Great Snails Want to Sponsor                                 ║ ");
            System.out.println("                                   ║                                                                       ║ ");
            System.out.print("                                   ║            Snail Number : ");
        }
    }
    //----------------------------atributos

    public void titolo() {
        if (this.Linguagem == 'P') {
            System.out.println("                                   ╔════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("                                   ║                                                                       ║ ");
            System.out.println("                                   ║      A Grande Corrida Tem O Prazer De Apresentar                      ║ ");
            System.out.println("                                   ║      Os Nossos Grandes Caracois                                       ║ ");
            fim();
            System.out.println();
            System.out.println("                                   ╔═════════════╦═══════════════════╦═════════════════╦════════════════╗");
            System.out.println("                                   ║ Velocidade ║     Tempo De    ║ Quantos Metros║  Tempo Por   ║");
            System.out.println("                                   ║            ║     Descanso    ║ Para Descansar║   movimento  ║");
            System.out.println("                                   ╚═════════════╩═══════════════════╩═════════════════╩════════════════╝");
        } else {
            System.out.println("                                   ╔════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("                                   ║                                                                       ║ ");
            System.out.println("                                   ║      The Great Race Is Pleased To Present                             ║ ");
            System.out.println("                                   ║      Our Big Snails                                                   ║ ");
            fim();
            System.out.println();
            System.out.println("                                   ╔═════════════╦═══════════════════╦═════════════════╦════════════════╗");
            System.out.println("                                   ║  Velocity  ║     Time to     ║How Many Meters║   Time By    ║");
            System.out.println("                                   ║            ║     Rest        ║  To Relax     ║   movement   ║");
            System.out.println("                                   ╚═════════════╩═══════════════════╩═════════════════╩════════════════╝");

        }
    }

    public void titolo_final() {
        if (this.Linguagem == 'P') {
            System.out.println("                                   ╔════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("                                   ║                                                                       ║ ");
            System.out.println("                                   ║      A Grande Corrida Tem O Prazer De Apresentar                      ║ ");
            System.out.println("                                   ║      Os Resultado De Todos Os Grandes Caracois                        ║ ");
            fim();
            System.out.println();
            System.out.println("                                   ╔═════════════╦═══════════════════╦═════════════════╦════════════════╦════════════════╦════════════════╦════════════════╦════════════════╦════════════════╗");
            System.out.println("                                   ║ Velocidade ║     Tempo De    ║ Quantos Metros║  Tempo Por   ║   Total De   ║  Distanasia   ║  Média Do    ║    Tempo     ║   Posição    ║    ");
            System.out.println("                                   ║            ║     Descanso    ║ Para Descansar║  movimento   ║   Movimentos ║  Percorrida   ║   Avanço     ║              ║              ║      ");
            System.out.println("                                   ╚═════════════╩═══════════════════╩═════════════════╩════════════════╩════════════════╩════════════════╩════════════════╩════════════════╩════════════════╝");
        } else {
            System.out.println("                                   ╔════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("                                   ║                                                                       ║ ");
            System.out.println("                                   ║      The Great Race Is Pleased To Present                             ║ ");
            System.out.println("                                   ║      The Result Of All The Big Snails                                 ║ ");
            fim();
            System.out.println();
            System.out.println("                                   ╔═════════════╦═══════════════════╦═════════════════╦════════════════╦════════════════╦════════════════╦════════════════╦════════════════╦════════════════╗");
            System.out.println("                                   ║  velocity  ║     Time To     ║How many meters║   Time By    ║   Total Of   ║  Dysthanasi  ║   Average    ║     Time     ║   Position    ║    ");
            System.out.println("                                   ║            ║       Rest      ║   to relax    ║  Movements   ║   Movements  ║   Traveled   ║   Advance    ║              ║               ║      ");
            System.out.println("                                   ╚═════════════╩═══════════════════╩═════════════════╩════════════════╩════════════════╩════════════════╩════════════════╩════════════════╩════════════════╝");

        }
    }

    public void fim() {

        System.out.println("                                   ║                                                                       ║ ");
        System.out.println("                                   ╚════════════════════════════════════════════════════════════════════════════════╝");
        System.out.println();
    }

    public void características_caracois(int numero_caracol, int velocidade, int tempo_descanso, int unidades_descanso, int tempo_de_movimento) {
        if (this.Linguagem == 'P') {
            System.out.println("                                   ╔═════════════╦═══════════════════╦════════════════╦═════════════════╗");
            System.out.println(" O Grande Caracol De Numero " + numero_caracol + "           " + velocidade + "              " + tempo_descanso + "              " + unidades_descanso + "           " + tempo_de_movimento + "       ");
            System.out.println("                                   ╚═════════════╩═══════════════════╩════════════════╩═════════════════╝");
        } else {
            System.out.println("                                   ╔═════════════╦═══════════════════╦════════════════╦═════════════════╗");
            System.out.println(" The Big Number Snail       " + numero_caracol + "           " + velocidade + "              " + tempo_descanso + "              " + unidades_descanso + "           " + tempo_de_movimento + "       ");
            System.out.println("                                   ╚═════════════╩═══════════════════╩════════════════╩═════════════════╝");
        }
    }
//-------------------------------podio

    public void podio_3(int i1, int i2, int i3) {
        if (this.Linguagem == 'P') {
            System.out.println("                                   ╔════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("                                   ║                                                                       ║ ");
            System.out.println("                                   ║      A Grande Corrida Tem O Prazer De Apresentar                      ║ ");
            System.out.println("                                   ║      Os Grandes Vencedores                                            ║ ");
            fim();
            System.out.println();
            System.out.println();
            System.out.println("                                                     " + i1);
            System.out.println();
            System.out.println("                                                ╔══════════════╗   ");
            System.out.println("                                                ║      1º     ║    " + i2);
            System.out.println("                                                ║    Lugar    ║   ");
            System.out.println("                                                ║             ╠══════════════╗   ");
            System.out.println("                                                ║             ║      2º     ║    " + i3);
            System.out.println("                                                ║             ║    Lugar    ║");
            System.out.println("                                                ║             ║             ╠══════════════╗   ");
            System.out.println("                                                ║             ║             ║      3º     ║ ");
            System.out.println("                                                ║             ║             ║    Lugar    ║");
            System.out.println("                                                ║             ║             ║             ║ ");
            System.out.println("                                                ╚══════════════╩═══════════════╩══════════════╝");
            System.out.println();
            System.out.println();
        } else {
            System.out.println("                                   ╔════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("                                   ║                                                                       ║ ");
            System.out.println("                                   ║      The Great Race Is Pleased To Present                             ║ ");
            System.out.println("                                   ║      The Great Winners                                                ║ ");
            fim();
            System.out.println();
            System.out.println();
            System.out.println("                                                     " + i1);
            System.out.println();
            System.out.println("                                                ╔══════════════╗   ");
            System.out.println("                                                ║      1º     ║    " + i2);
            System.out.println("                                                ║    Place    ║   ");
            System.out.println("                                                ║             ╠══════════════╗   ");
            System.out.println("                                                ║             ║      2º     ║    " + i3);
            System.out.println("                                                ║             ║    Place    ║");
            System.out.println("                                                ║             ║             ╠══════════════╗   ");
            System.out.println("                                                ║             ║             ║      3º     ║ ");
            System.out.println("                                                ║             ║             ║    Place    ║");
            System.out.println("                                                ║             ║             ║             ║ ");
            System.out.println("                                                ╚══════════════╩═══════════════╩══════════════╝");
            System.out.println();
            System.out.println();
        }
    }// The Big Number Snail       "

    public void características_caracois_final(int numero_caracol, int velocidade, int tempo_descanso, int unidades_descanso, int tempo_de_movimento, int total_movimentos, int distancia_percorrida, int ranque, long tenpo) {
        if (Linguagem == 'P') {
            System.out.println("                                   ╔═════════════╦═══════════════════╦════════════════╦════════════════╦════════════════╦════════════════╦════════════════╦════════════════╦═════════════════╗");
            System.out.println(" O Grande Caracol De Numero " + numero_caracol + "           " + velocidade + "              " + tempo_descanso + "              " + unidades_descanso + "           " + tempo_de_movimento + "              " +
                    total_movimentos + "             " + distancia_percorrida + "             " + (distancia_percorrida / total_movimentos) + "               " + tenpo + "             " + ranque + "º");
            System.out.println("                                   ╚═════════════╩═══════════════════╩════════════════╩════════════════╩════════════════╩════════════════╩════════════════╩════════════════╩═════════════════╝");
        } else {
            System.out.println("                                   ╔═════════════╦═══════════════════╦════════════════╦════════════════╦════════════════╦════════════════╦════════════════╦════════════════╦═════════════════╗");
            System.out.println(" The Big Number Snail       " + numero_caracol + "           " + velocidade + "              " + tempo_descanso + "              " + unidades_descanso + "           " + tempo_de_movimento + "              " +
                    total_movimentos + "             " + distancia_percorrida + "             " + (distancia_percorrida / total_movimentos) + "               " + tenpo + "             " + ranque + "º");
            System.out.println("                                   ╚═════════════╩═══════════════════╩════════════════╩════════════════╩════════════════╩════════════════╩════════════════╩════════════════╩═════════════════╝");

        }
    }

    //----------------------------aposta
    public void aposta_ganho(int n, String nome) {
        if (Linguagem == 'P') {
            System.out.println("                                   ╔════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("                                   ║                                                                       ║ ");
            System.out.println("                                   ║      A Grande Corrida Tem O Prazer De Dizer Senhor(a): " + nome);
            System.out.println("                                   ║      Realizou Sabiamente O Seu Patrocínio No Grande Caracol: " + n);
            fim();
        } else {
            System.out.println("                                   ╔════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("                                   ║                                                                       ║ ");
            System.out.println("                                   ║      The Great Race Has The Pleasure Of Saying Sir(Mrs): " + nome);
            System.out.println("                                   ║      Wisely Performed Your Sponsorship On The Great Snail: " + n);
            fim();
        }
    }

    public void aposta_perdeu(int n, String nome) {
        if (Linguagem == 'P') {
            System.out.println("                                   ╔════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("                                   ║                                                                       ║ ");
            System.out.println("                                   ║      A Grande Corrida Lamento De Dizer Senhor(a): " + nome);
            System.out.println("                                   ║     Que Não Realizou Sabiamente O Seu Patrocínio No Grande Caracol: " + n);
            fim();
        } else {
            System.out.println("                                   ╔════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("                                   ║                                                                       ║ ");
            System.out.println("                                   ║      The Great Race I am sorry to say Sir(Mrs): " + nome);
            System.out.println("                                   ║     Who Did Not Wisely Perform Your Sponsorship On The Great Snail: " + n);
            fim();
        }
    }

    ///-------------erros
    public void erro_Linguagem() {
            System.out.println();
            System.out.print("                                       Qual Q Língua(Which Language)?: ");
    }
    public void erro_Numero() {
        if (Linguagem == 'P') {
            System.out.println();
            System.out.print("                                   ║               O Numero de participantes: ");
        }else {
            System.out.println();
            System.out.print("                                   ║               O Number of participants: ");
        }
    }
    public void erro_Nome_catch() {
        if (Linguagem == 'P') {
            System.out.println("                                   ║                                                                       ║ ");
            System.out.println("                                   ║             A Grande Corrida Precisa De Um Inteiro Entre 3 E 150      ║       ");
            System.out.print("                                   ║               O Numero de participantes: ");
        }else {
            System.out.println("                                   ║                                                                       ║ ");
            System.out.println("                                   ║             The Great Race Needs an Integer Between 3 and 150         ║       ");
            System.out.print("                                   ║               O Number of participants: ");
        }
    }
    public void erro_Nome() {
        if (Linguagem == 'P') {
            System.out.print("                                   ║               O Seu Nome senhor(a): ");
        }else {
            System.out.print("                                   ║               Your Name Mr.(Mrs.): ");
        }
    }
    public void erro_Metros() {
        if (Linguagem == 'P') {
            System.out.print("                                   ║               O Numero De Metros: ");
        }else {
            System.out.print("                                   ║               The number of meters: ");
        }
    }
    public void erro_Metros_catch() {
        if (Linguagem == 'P') {
            System.out.println("                                   ║                                                                       ║ ");
            System.out.println("                                   ║             A Grande Corrida Precisa De Um Inteiro Maior Que 100      ║       ");
            System.out.print("                                   ║               O Numero De Metros : ");
        }else {
            System.out.println("                                   ║                                                                       ║ ");
            System.out.println("                                   ║             The Great Race Needs an Integer Greater Than 100          ║       ");
            System.out.print("                                   ║               The number of meters : ");
        }
    }
    public void erro_Numero_Caracol() {
        if (Linguagem == 'P') {
            System.out.print("                                   ║            Número Do Caracol: ");
        }else {
            System.out.print("                                   ║            Snail Number: ");
        }
    }
    public void erro_Numero_Caracol_catch(int N_Participantes) {
        if (Linguagem == 'P') {
            System.out.println("                                   ║                                                                       ║ ");
            System.out.println("                                   ║             A Grande Corrida Precisa De Um Inteiro Maior Entre 0 e " + N_Participantes);
            System.out.print("                                   ║               Número Do Caracol : ");
        }else {
            System.out.println("                                   ║                                                                       ║ ");
            System.out.println("                                   ║             The Great Race Needs a Larger Integer Between 0 and" + N_Participantes);
            System.out.print("                                   ║               Snail Number: ");
        }
    }

}
