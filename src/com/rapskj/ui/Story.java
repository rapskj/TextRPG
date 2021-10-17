package com.rapskj.ui;


import com.rapskj.Game;

import com.rapskj.entity.Player;

public class Story {

    Game game;
    UI ui;
    Visible vm;
    Player player = new Player();

    public Story(Game g, UI uI, Visible vM) {

        game = g;
        ui = uI;
        vm = vM;

    }

    public void defaultSetup(){
        player.joy = 10;
    }


    public void tavernMeet(){
        ui.mainTextA.setText("Hey, fella. Do you want some joy?");
    }
}
