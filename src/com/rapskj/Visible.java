package com.rapskj;

public class Visible {
    UI ui;
    public Visible(UI userI){
        ui = userI;
    }
    public void showTitle(){
        //ukazat uvodni obrazovku
        ui.titlePanel.setVisible(true);
        ui.startPanel.setVisible(true);

        //Schovat zbytek hry

        ui.mainText.setVisible(false);
        ui.choiceButtonP.setVisible(false);
    }

    public void cutscene(){

        //schovat uvodni obrazovku
        ui.titlePanel.setVisible(false);
        ui.startButton.setVisible(false);
        //ukazat zbytek hry
        ui.mainText.setVisible(true);
        ui.choiceButtonP.setVisible(true);
    }
}
