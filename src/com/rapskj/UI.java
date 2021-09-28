package com.rapskj;

import javax.swing.*;
import java.awt.*;


public class UI {

    JFrame okno;
    JPanel titlePanel, startPanel, mainText, choiceButtonP;
    JLabel titleLabel;
    JTextArea mainTextA;
    JButton startButton, ch1, ch2, ch3, ch4;
    Font normalText= new Font("Calibri", Font.PLAIN, 30);
    Font titleFont = new Font("Calibri", Font.PLAIN, 90);


    public void createUI(Game.ChoiceHandler cHandler){
        okno = new JFrame(); //Vytvareni okna
        okno.setSize(800,600);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Uzivatel muze zavrit okno
        okno.getContentPane().setBackground(Color.BLACK); //Nastaveni pozadi
        okno.setLayout(null); //Zakazani defaultniho layoutu
        okno.setLocationRelativeTo(null); //okno se vzdy otevre uprostred obrazovky

        titlePanel = new JPanel(); //Vytvareni panelu pro nadpis
        titlePanel.setBounds(100,100,600,150);
        /*
        Generace panelu ve kterem bude popis hry.
        x: osa x
        y: osa y
        width: sirka
        height: vyska
        */
        titlePanel.setBackground(Color.BLACK);
        titleLabel = new JLabel("Sorrow Euphoria"); //Vytvareni nadpisu
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
        startButton.setFocusPainted(false);
        startButton.setFont(normalText);
        startButton.addActionListener(cHandler);
        startButton.setActionCommand("Start");
        startPanel.add(startButton);

        okno.add(titlePanel);
        okno.add(startPanel);

        titlePanel.setVisible(false);
        startPanel.setVisible(false);
        mainText = new JPanel();
        mainText.setBounds(100,100,600,250);
        mainText.setBackground(Color.BLACK);
        okno.add(mainText);

        mainTextA = new JTextArea("How long has it been?");
        mainTextA.setBounds(100,100,600,250);
        mainTextA.setBackground(Color.BLACK);
        mainTextA.setForeground(Color.WHITE);
        mainTextA.setFont(normalText);
        mainTextA.setLineWrap(true);
        mainTextA.setEditable(false); //zabraneni uprave
        mainTextA.setWrapStyleWord(true); //wrap lines
        mainText.add(mainTextA);

        choiceButtonP = new JPanel();
        choiceButtonP.setBounds(250,350,300,150);
        choiceButtonP.setBackground(Color.BLACK);
        okno.add(choiceButtonP);

        ch1 = new JButton("Choice 1");
        ch1.setBackground(Color.BLACK);
        ch1.setForeground(Color.WHITE);
        ch1.setBorder(null);
        ch1.setFocusPainted(false);
        ch1.setFont(normalText);
        ch1.addActionListener(cHandler);
        ch1.setActionCommand("c1");
        choiceButtonP.add(ch1);

        ch2 = new JButton("Choice 2");
        ch2.setBackground(Color.BLACK);
        ch2.setForeground(Color.WHITE);
        ch2.setBorder(null);
        ch2.setFocusPainted(false);
        ch2.setFont(normalText);
        ch2.addActionListener(cHandler);
        ch2.setActionCommand("c2");
        choiceButtonP.add(ch2);

        ch3 = new JButton("Choice 3");
        ch3.setBackground(Color.BLACK);
        ch3.setForeground(Color.WHITE);
        ch3.setBorder(null);
        ch3.setFocusPainted(false);
        ch3.setFont(normalText);
        ch3.addActionListener(cHandler);
        ch3.setActionCommand("c3");
        choiceButtonP.add(ch3);

        ch4 = new JButton("Choice 4");
        ch4.setBackground(Color.BLACK);
        ch4.setForeground(Color.WHITE);
        ch4.setBorder(null);
        ch4.setFocusPainted(false);
        ch4.setFont(normalText);
        ch4.addActionListener(cHandler);
        ch4.setActionCommand("c4");
        choiceButtonP.add(ch4);

        okno.setVisible(true); //Zobrazeni okna

        }

    }



