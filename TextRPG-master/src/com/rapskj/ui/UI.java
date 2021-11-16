package com.rapskj.ui;

import com.rapskj.Game;

import javax.swing.*;
import java.awt.*;


public class UI {

    JFrame window;
    JPanel titlePanel, startPanel, mainText, choiceButtonP, creditPanel, statusPanel;
    JLabel titleLabel;
    JTextArea creditText,mainTextA;
    JButton startButton, creditButton, goBackButton, quitButton, ch1, ch2, ch3, ch4, sts;
    Font normalText= new Font("Calibri", Font.PLAIN, 26);
    Font titleFont = new Font("Calibri", Font.PLAIN, 90);

    GraphicsDevice gDevice;
    int curScreenWidth, curScreenHeight;


    ImageIcon logo = new ImageIcon(".//res//pixil-frame-0.png");



    public void createUI(Game.ChoiceHandler cHandler){


        GraphicsEnvironment gEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();
        gDevice = gEnv.getDefaultScreenDevice(); //Sledovani monitoru

        curScreenWidth = 800;
        curScreenHeight = 600;



        //Okno
        window = new JFrame("Sorrow Euphoria"); //Vytvareni okna
        window.setIconImage(logo.getImage());
        //window.setSize(1920,1080);
        window.setSize(curScreenWidth,curScreenHeight);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Uzivatel muze zavrit window
        window.getContentPane().setBackground(Color.BLACK); //Nastaveni pozadi
        window.setLayout(null); //Zakazani defaultniho layoutu
        window.setLocationRelativeTo(null); //window se vzdy otevre uprostred obrazovky


        //Title Panel

        titlePanel = new JPanel(); //Vytvareni panelu pro nadpis
        window.add(titlePanel);
        int tnp_x = (int)Math.round(curScreenWidth*0.125);
        int tnp_y = (int)Math.round(curScreenHeight*0.166);
        int tnp_w = (int)Math.round(curScreenWidth*0.75);
        int tnp_h = (int)Math.round(curScreenHeight*0.25);
        titlePanel.setBounds(tnp_x,tnp_y,tnp_w,tnp_h);

        //titlePanel.setBounds(100,100,600,500);

        // 100/800; 100/600; 600/800; 500/600
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
        int snp_x = (int) Math.round(curScreenWidth*0.375);
        int snp_y = (int) Math.round(curScreenHeight*0.666);
        int snp_w = (int) Math.round(curScreenWidth*0.25);
        int snp_h = (int) Math.round(curScreenHeight*0.166);

        window.add(startPanel);
        startPanel.setBounds(snp_x,snp_y,snp_w,snp_h);
        //startPanel.setBounds(300,400,200,100);
        startPanel.setBackground(Color.BLACK);
        startPanel.setLayout(new GridLayout(3,1));


        // Start Button
        startButton = new JButton("Start");
        startButton.setBackground(Color.BLACK);
        startButton.setForeground(Color.WHITE);
        startButton.setFocusPainted(false);
        startButton.setFont(normalText);
        startButton.addActionListener(cHandler);
        startButton.setActionCommand("Start");
        startPanel.add(startButton);

        /*
        titlePanel.setVisible(false);
        startPanel.setVisible(false);
        creditText.setVisible(false);

         */
        //Main text panel
        mainText = new JPanel();
        int mt_x = (int) Math.round(curScreenWidth*0.125);
        int mt_y = (int) Math.round(curScreenHeight*0.166);
        int mt_w = (int) Math.round(curScreenWidth*0.75);
        int mt_h = (int) Math.round(curScreenHeight*0.4166);
        window.add(mainText);
        mainText.setBounds(mt_x,mt_y,mt_w,mt_h);
        //mainText.setBounds(100,100,600,250);
        mainText.setBackground(Color.black);

        //Main text

        mainTextA = new JTextArea();
        int mn_x = (int) Math.round(curScreenWidth*0.125);
        int mn_y = (int) Math.round(curScreenHeight*0.166);
        int mn_w = (int) Math.round(curScreenWidth*0.75);
        int mn_h = (int) Math.round(curScreenHeight*0.4166);
        mainTextA.setBounds(mn_x,mn_y,mn_w,mn_h);
        //mainTextA.setBounds(100,100,600,250);
        mainTextA.setBackground(Color.BLACK);
        mainTextA.setForeground(Color.WHITE);
        mainTextA.setFont(normalText);
        mainTextA.setLineWrap(true);
        mainTextA.setWrapStyleWord(true); //wrap lines
        mainTextA.setEditable(false); //zabraneni uprave
        mainText.add(mainTextA);


        choiceButtonP = new JPanel();
        int chp_x = (int) Math.round(curScreenWidth*0.3125);
        int chp_y = (int) Math.round(curScreenHeight*0.5833);
        int chp_w = (int) Math.round(curScreenWidth*0.375);
        int chp_h = (int) Math.round(curScreenHeight*0.25);
        window.add(choiceButtonP);
        choiceButtonP.setBounds(chp_x,chp_y,chp_w,chp_h);
        //choiceButtonP.setBounds(250,350,300,150);
        choiceButtonP.setBackground(Color.BLACK);
        choiceButtonP.setLayout(new GridLayout(3,3));

        ch1 = new JButton("Choice 1");
        ch1.setBackground(Color.BLACK);
        ch1.setForeground(Color.WHITE);

        ch1.setFocusPainted(false);
        ch1.setFont(normalText);
        ch1.addActionListener(cHandler);
        ch1.setActionCommand("c1");
        choiceButtonP.add(ch1);

        ch2 = new JButton("Choice 2");
        ch2.setBackground(Color.BLACK);
        ch2.setForeground(Color.WHITE);

        ch2.setFocusPainted(false);
        ch2.setFont(normalText);
        ch2.addActionListener(cHandler);
        ch2.setActionCommand("c2");
        choiceButtonP.add(ch2);

        ch3 = new JButton("Choice 3");
        ch3.setBackground(Color.BLACK);
        ch3.setForeground(Color.WHITE);

        ch3.setFocusPainted(false);
        ch3.setFont(normalText);
        ch3.addActionListener(cHandler);
        ch3.setActionCommand("c3");
        choiceButtonP.add(ch3);

        ch4 = new JButton("Choice 4");
        ch4.setBackground(Color.BLACK);
        ch4.setForeground(Color.WHITE);

        ch4.setFocusPainted(false);
        ch4.setFont(normalText);
        ch4.addActionListener(cHandler);
        ch4.setActionCommand("c4");
        choiceButtonP.add(ch4);

        sts = new JButton("Status");
        sts.setBackground(Color.black);
        sts.setForeground(Color.white);
        sts.setFocusPainted(false);
        sts.setFont(normalText);
        sts.setActionCommand("Status");
        choiceButtonP.add(sts);

        statusPanel = new JPanel();
        statusPanel.setBounds(550,350,200,100);
        statusPanel.setBackground(Color.black);
        statusPanel.setLayout(new GridLayout(5,1));
        window.add(statusPanel);



        //Credit Panel
        creditPanel = new JPanel();
        int cr_x = (int) Math.round(curScreenWidth*0.0125);
        int cr_y = (int) Math.round(curScreenHeight*0.0166);
        int cr_w = (int) Math.round(curScreenWidth*1.125);
        int cr_h = (int) Math.round(curScreenHeight*0.333);
        window.add(creditPanel);
        creditPanel.setBounds(cr_x,cr_y,cr_w,cr_h);
        //creditPanel.setBounds(10,10,900,200);
        creditPanel.setBackground(Color.BLACK);
        //creditPanel.setLayout(new GridLayout(1,1));

        //Credits text
        creditText = new JTextArea("Author: Josef Praks/rapskj \nFor: FIS ZS 2021/22 \nSource Code: github.com/rapskj/TextRPG");
        creditText.setBounds(10,10,900,200);
        creditText.setBackground(Color.BLACK);
        creditText.setForeground(Color.white);
        creditText.setFont(normalText);
        creditText.setLineWrap(true);
        creditText.setEditable(false); //zabraneni uprave
        creditText.setWrapStyleWord(true); //wrap lines
        creditPanel.add(creditText);

        //Back Button
        goBackButton = new JButton("Back");
        goBackButton.setBackground(Color.black);
        goBackButton.setForeground(Color.white);
        goBackButton.setFocusPainted(false);
        goBackButton.setFont(normalText);
        goBackButton.addActionListener(cHandler);
        goBackButton.setActionCommand("Back");
        creditPanel.add(goBackButton);




        // Credit Button
        creditButton = new JButton("Credits");
        creditButton.setBackground(Color.black);
        creditButton.setForeground(Color.white);
        creditButton.setFocusPainted(false);
        creditButton.setFont(normalText);
        creditButton.addActionListener(cHandler);
        creditButton.setActionCommand("Credits");
        startPanel.add(creditButton);

        quitButton = new JButton("Quit");
        quitButton.setBackground(Color.black);
        quitButton.setForeground(Color.white);
        quitButton.setFocusPainted(false);
        quitButton.setFont(normalText);
        quitButton.addActionListener(cHandler);
        quitButton.setActionCommand("Quit");
        startPanel.add(quitButton);



        window.setVisible(true); //Zobrazeni okna


        //setFull();
        }



        /*public void setFull(){
            gDevice.setFullScreenWindow(window);

        }


         */
    }



