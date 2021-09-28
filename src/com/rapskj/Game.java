package com.rapskj;
import javax.swing.JFrame; //Import JFrame pro generovani GUI
import java.awt.*;

public class Game {

    JFrame okno;

    public static void main(String[] args) {

        new Game();
    }

    //Funkce pro hru
    public Game(){

        okno = new JFrame(); //Inicializace JFrame
        okno.setSize(800,600);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Uzivatel muze zavrit okno
        okno.getContentPane().setBackground(Color.BLACK); //Nastaveni pozadi
        okno.setLayout(null);


    }
}
