package com.rapskj.ui;



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
        ui.goBackButton.setVisible(false);
        ui.creditPanel.setVisible(false);


    }

    public void cutscene(){

        //ukazat zbytek hry
        ui.choiceButtonP.setVisible(true);
        ui.mainText.setVisible(true);


        //schovat uvodni obrazovku
        ui.titlePanel.setVisible(false);
        ui.startButton.setVisible(false);
        ui.creditButton.setVisible(false);
        ui.goBackButton.setVisible(false);
        ui.quitButton.setVisible(false);



    }

    public void showCredits(){
        ui.titlePanel.setVisible(false);
        ui.choiceButtonP.setVisible(false);
        ui.startButton.setVisible(false);
        ui.quitButton.setVisible(false);

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
        ui.quitButton.setVisible(true);

        ui.mainText.setVisible(false);
        ui.choiceButtonP.setVisible(false);
        ui.creditText.setVisible(false);



    }
}
