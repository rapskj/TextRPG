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
        ui.goBackButton.setVisible(false);
        ui.choiceButtonP.setVisible(false);
        ui.creditText.setVisible(false);

    }

    public void cutscene(){

        //schovat uvodni obrazovku
        ui.titlePanel.setVisible(false);
        ui.startButton.setVisible(false);
        ui.creditButton.setVisible(false);
        ui.goBackButton.setVisible(false);
        //ukazat zbytek hry
        ui.mainText.setVisible(true);
        ui.choiceButtonP.setVisible(true);

    }

    public void showCredits(){
        ui.titlePanel.setVisible(false);
        ui.choiceButtonP.setVisible(false);
        ui.startButton.setVisible(false);

        ui.creditPanel.setVisible(true);
        ui.creditText.setVisible(true);
        ui.goBackButton.setVisible(true);

        ui.creditButton.setVisible(false);


    }

    public void goBack(){
        ui.creditPanel.setVisible(false);
        ui.creditText.setVisible(false);
        ui.creditButton.setVisible(false);

        ui.titlePanel.setVisible(true);
        ui.startPanel.setVisible(true);
        ui.startButton.setVisible(true);
        ui.creditButton.setVisible(true);

        ui.mainText.setVisible(false);
        ui.choiceButtonP.setVisible(false);
        ui.creditText.setVisible(false);
    }
}
