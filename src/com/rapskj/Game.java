package com.rapskj;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {
    ChoiceHandler cHandler = new ChoiceHandler();
    UI ui = new UI();
    Visible vm = new Visible(ui);


    public static void main(String[] args) {

        new Game();
    }

    //Funkce pro hru
    public Game(){

        ui.createUI(cHandler);
        vm.showTitle();
    }

    public class ChoiceHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            String yourChoice = event.getActionCommand();

            switch(yourChoice){
                case "Start": vm.cutscene(); break;
                case "c1": break;
                case "c2": break;
                case "c3": break;
                case "c4": break;
            }
        }
    }



}
