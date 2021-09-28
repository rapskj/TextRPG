package com.rapskj;
import javax.swing.*;
import java.awt.*;

public class Game {

    JFrame okno;
    JPanel titlePanel, startPanel;
    JLabel titleLabel;
    Font titleFont = new Font("Calibri", Font.PLAIN, 70);
    JButton startButton;
    Font normalText = new Font("Calibri", Font.PLAIN,40);

    public static void main(String[] args) {

        new Game();
    }

    //Funkce pro hru
    public Game(){

        okno = new JFrame(); //Inicializace JFrame
        okno.setSize(800,600);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Uzivatel muze zavrit okno
        okno.getContentPane().setBackground(Color.BLACK); //Nastaveni pozadi
        okno.setLayout(null); //Zakazani defaultniho layoutu
        okno.setLocationRelativeTo(null); //okno se vzdy otevre uprostred obrazovky


        titlePanel = new JPanel(); //Inicializace JPanel
        titlePanel.setBounds(100,100,600,150);
        /*
        Generace panelu ve kterem bude popis hry.
        x: osa x
        y: osa y
        width: sirka
        height: vyska
        */
        titlePanel.setBackground(Color.BLACK);
        titleLabel = new JLabel("Sorrow Euphoria"); //Inicializace JLabel
        titleLabel.setForeground(Color.white);
        titleLabel.setFont(titleFont);
        titlePanel.add(titleLabel); //Pridam Label do Panelu

        startPanel = new JPanel();
        startPanel.setBounds(300,400,200,100);
        startPanel.setBackground(Color.BLACK);


        startButton = new JButton("Start");
        startButton.setBackground(Color.BLACK);
        startButton.setForeground(Color.WHITE);
        startButton.setBorder(null);
        startButton.setFont(normalText);
        startPanel.add(startButton);

        okno.add(titlePanel);
        okno.add(startPanel);




        okno.setVisible(true); //Zobrazeni okna


    }
}
