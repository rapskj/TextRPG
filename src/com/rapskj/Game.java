package com.rapskj;
import com.rapskj.ui.Story;
import com.rapskj.ui.UI;
import com.rapskj.ui.Visible;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {
    ChoiceHandler cHandler = new ChoiceHandler();
    UI ui = new UI();
    Visible vm = new Visible(ui);
    Story story = new Story(this,ui,vm);


    public static void main(String[] args) {
        new Game();
    }

    //Funkce pro hru
    public Game(){

        ui.createUI(cHandler);
        story.defaultSetup();
        vm.showTitle();

    }

    public class ChoiceHandler implements ActionListener {
        public void actionPerformed(ActionEvent event){
            String yourChoice = event.getActionCommand();

            switch(yourChoice){
                case "Start": vm.cutscene(); story.tavernMeet(); break;
                case "Credits": vm.showCredits(); break;
                case "Back": vm.goBack(); break;
                case "Quit": System.exit(0); break;
                case "Status": break;
                case "c1": break;
                case "c2": break;
                case "c3": break;
                case "c4": break;
            }
        }
    }



}
