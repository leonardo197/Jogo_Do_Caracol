package main;

import javafx.stage.Screen;


import javax.swing.*;
import java.awt.*;

public class grafica {
    public void grafica(){}

    public void retangulo(int x_i,int y_i,int x_f,int y_f)
    {
       // char escCode = 0x1;
       // screen.putString();
        JFrame janela = new JFrame();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(300,300);
        janela.setVisible(true);


     for (int i = y_i+1; i < y_f-1; i++){
         char escCode = 0x1B;
         int row = 10; int column = 10;
         System.out.print(String.format("%c[%d;%df",escCode,row,column));

     }

    }
}
