package com.rapskj;

import javax.swing.*;
import java.awt.*;


public class UI {

    JFrame window;
    JPanel titlePanel, startPanel, mainText, choiceButtonP, creditPanel;
    JLabel titleLabel;
    JTextArea creditText,mainTextA;
    JButton startButton, creditButton, goBackButton, ch1, ch2, ch3, ch4;
    Font normalText= new Font("Calibri", Font.PLAIN, 30);
    Font titleFont = new Font("Calibri", Font.PLAIN, 90);


    public void createUI(Game.ChoiceHandler cHandler){

        //Okno
        window = new JFrame("Sorrow Euphoria"); //Vytvareni okna
        window.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("pixil-frame-0.png")));
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Uzivatel muze zavrit window
        window.getContentPane().setBackground(Color.BLACK); //Nastaveni pozadi
        window.setLayout(null); //Zakazani defaultniho layoutu
        window.setLocationRelativeTo(null); //window se vzdy otevre uprostred obrazovky


        //Title Panel

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

        // Title label
        titleLabel = new JLabel("Sorrow Euphoria"); //Vytvareni nadpisu
        titleLabel.setForeground(Color.white);
        titleLabel.setFont(titleFont);
        titlePanel.add(titleLabel); //Pridam Label do Panelu

        // Start Panel
        startPanel = new JPanel();
        startPanel.setBounds(300,400,200,100);
        startPanel.setBackground(Color.BLACK);

        // Start Button
        startButton = new JButton("Start");
        startButton.setBackground(Color.BLACK);
        startButton.setForeground(Color.WHITE);
        startButton.setBorder(null);
        startButton.setFocusPainted(false);
        startButton.setFont(normalText);
        startButton.addActionListener(cHandler);
        startButton.setActionCommand("Start");
        startPanel.add(startButton);

        //Credit Panel
        creditPanel = new JPanel();
        creditPanel.setBounds(10,10,900,200);
        creditPanel.setBackground(Color.BLACK);
        window.add(creditPanel);

        //Credits text
        creditText = new JTextArea("Author: Josef Praks/rapskj \nFor: FIS ZS 2021/22 \nSource Code: github.com/rapskj/TextRPG");
        creditText.setBounds(10,10,900,200);
        creditText.setBackground(Color.black);
        creditText.setForeground(Color.white);
        creditText.setFont(normalText);
        creditText.setLineWrap(true);
        creditText.setEditable(false); //zabraneni uprave
        creditText.setWrapStyleWord(true); //wrap lines
        creditPanel.add(creditText);


        // Credit Button
        creditButton = new JButton("Credits");
        creditButton.setBackground(Color.black);
        creditButton.setForeground(Color.white);
        creditButton.setBorder(null);
        creditButton.setFocusPainted(false);
        creditButton.setFont(normalText);
        creditButton.addActionListener(cHandler);
        creditButton.setActionCommand("Credits");
        startPanel.add(creditButton);



        //Back Button
        goBackButton = new JButton("Back");
        goBackButton.setBackground(Color.white);
        goBackButton.setForeground(Color.black);
        goBackButton.setBorder(null);
        goBackButton.setFocusPainted(false);
        goBackButton.setFont(normalText);
        goBackButton.addActionListener(cHandler);
        goBackButton.setActionCommand("Back");
        creditPanel.add(goBackButton);

        /*
        titlePanel.setVisible(false);
        startPanel.setVisible(false);
        creditText.setVisible(false);

         */
        //Main text panel
        mainText = new JPanel();
        mainText.setBounds(100,100,600,250);
        mainText.setBackground(Color.BLACK);
        window.add(mainText);
        //Main text
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
        window.add(choiceButtonP);

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

        window.add(titlePanel);
        window.add(startPanel);
        window.add(creditPanel);


        window.setVisible(true); //Zobrazeni okna

        }

    }



