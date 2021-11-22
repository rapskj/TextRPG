package com.rapskj.ui;


import com.rapskj.Game;

import com.rapskj.entity.Player;

public class Story {

    Game game;
    UI ui;
    Visible vm;
    Player player = new Player();
    int northC = 0;
    int westC = 0;
    int eastC = 0;
    int aggro = 0;

    public Story(Game g, UI uI, Visible vM) {

        game = g;
        ui = uI;
        vm = vM;

    }

    public void defaultSetup(){
        player.joy = 10;
    }

    public void selectPos(String nextPos){
        switch (nextPos){
            case"takeJoy": takeJoy(); break;
            case"refuseJoy":refuseJoy(); break;
            case"fightStranger": fightStranger(); break;
            case"quitGame":System.exit(0); break;
            case"townExit":townExit(); break;
            case"east": east(); break;
            case"north":north();break;
            case"west":west(); break;
            case"tavernMeet":tavernMeet(); break;
            case"red":red(); break;
            case"goBack":goBack(); break;
            case"tavernAgain":tavernAgain(); break;
            case"blue":blue(); break;
            case"northAgain": northAgain(); break;
            case"killKing": killKing(); break;
            case"talkKing": talkKing(); break;
            case"fightKing": fightKing(); break;
            case"eastAgain": eastAgain(); break;

        }
    }

    public void tavernMeet(){
        ui.mainTextA.setText("[Stranger]: Hey, fella. Do you want some joy?");
        ui.ch1.setText("Take");
        ui.ch2.setText("Refuse");
        ui.ch3.setText("Fight");
        ui.ch4.setVisible(false);
        ui.sts.setVisible(false);

        game.nextPos1 = "takeJoy";
        game.nextPos2 = "refuseJoy";
        game.nextPos3 = "fightStranger";
        game.nextPos4 = "";
    }

    public void tavernAgain(){
        ui.mainTextA.setText("[Stranger]: Hey, you didn't finish your quest. Get your ass back there.");
        ui.ch1.setText("Back");
        ui.ch2.setVisible(false);
        ui.ch3.setVisible(false);
        ui.ch4.setVisible(false);
        ui.sts.setVisible(false);

        game.nextPos1 = "goBack";
        game.nextPos2 = "";
        game.nextPos3 = "";
        game.nextPos4 = "";
    }

    public void takeJoy(){
        ui.mainTextA.setText("[Stranger]: That's what I like to see. I'll give you a quest, fetch me another two joys. Don't take any other pills.");
        ui.ch1.setText("Exit.");
        ui.ch2.setVisible(false);
        ui.ch3.setVisible(false);
        ui.ch4.setVisible(false);
        ui.sts.setVisible(false);

        game.nextPos1 = "townExit";
        game.nextPos2 = "";
        game.nextPos3 = "";
        game.nextPos4 = "";
    }

    public void refuseJoy(){
        ui.mainTextA.setText("[Stranger]: Really? That's a shame. In that case, your quest ends right here. \n You received fatal damage. Game over.");
        ui.ch1.setText("Exit");
        ui.ch2.setVisible(false);
        ui.ch3.setVisible(false);
        ui.ch4.setVisible(false);
        ui.sts.setVisible(false);

        game.nextPos1 = "quitGame";
        game.nextPos2 = "";
        game.nextPos3 = "";
        game.nextPos4 = "";

    }
    public void fightStranger(){
        aggro++;
        ui.mainTextA.setText("[Stranger]: Hey, pal. Why are you attacking me? I'll pretend this didn't happen, but don't do it again.");
        ui.ch1.setText("Leave");
        ui.ch2.setVisible(false);
        ui.ch3.setVisible(false);
        ui.ch4.setVisible(false);
        ui.sts.setVisible(false);

        game.nextPos1 = "townExit";
        game.nextPos2 = "";
        game.nextPos3 = "";
        game.nextPos4 = "";
    }
    public void townExit(){
        ui.mainTextA.setText("Finally you got out. Your main goal is to obtain joy.\nHowever, if you pick up anything else, your game will be over.\nHead north to pick up the first pill.\nIf you go south, you will go back to the tavern.");
        ui.ch1.setVisible(true);
        ui.ch2.setVisible(true);
        ui.ch3.setVisible(true);
        ui.ch4.setVisible(true);

        ui.ch1.setText("North");
        ui.ch2.setText("East");
        ui.ch3.setText("South");
        ui.ch4.setText("West");

        game.nextPos1 = "north";
        game.nextPos2 = "east";
        game.nextPos3 = "tavernAgain";
        game.nextPos4 = "west";



    }

    public void goBack(){
        ui.mainTextA.setText("Here you are, once again. You might want to check your inventory to see how many pills you got and how many remain.");
        ui.ch1.setVisible(true);
        ui.ch2.setVisible(true);
        ui.ch3.setVisible(true);
        ui.ch4.setVisible(true);
        ui.sts.setVisible(true);

        ui.ch1.setText("North");
        ui.ch2.setText("East");
        ui.ch3.setText("South");
        ui.ch4.setText("West");

        if (northC == 0){
            game.nextPos1 = "north";
        }
        else {
            game.nextPos1 = "northAgain";
        }

        if (eastC == 0){
            game.nextPos2 = "east";
        }
        else {
            game.nextPos2 = "eastAgain";
        }

        if (westC == 0){
            game.nextPos4 = "west";
        }
        else{
            game.nextPos4 = "westAgain";
        }

        game.nextPos3 = "tavernAgain";
    }

    public void north(){
        northC++;
        ui.mainTextA.setText("You entered a magical forest. A fairy queen stands before you and gives you a choice. You either take red pill of eternal happiness or blue pill of eternal sorrow\n[Fairy Queen]: Choose carefully, adventurer. Do not forget your quest. Now, which one will you choose?");
        ui.ch3.setVisible(false);
        ui.ch4.setVisible(false);
        ui.sts.setVisible(false);

        ui.ch1.setText("Red");
        ui.ch2.setText("Blue");


        game.nextPos1 = "red";
        game.nextPos2 = "blue";
        game.nextPos3 = "";
        game.nextPos4 = "";
    }

    public void red(){
        ui.mainTextA.setText("[Fairy Queen]: You picked correct pill. Congratulations, you may continue your quest.");
        ui.ch1.setText("Go back");
        ui.ch2.setVisible(false);
        ui.ch3.setVisible(false);
        ui.ch4.setVisible(false);
        ui.sts.setVisible(false);

        game.nextPos1 = "goBack";
        game.nextPos2 = "";
        game.nextPos3 = "";
        game.nextPos4 = "";
    }

    public void blue(){
        ui.mainTextA.setText("[Fairy Queen]: You picked the wrong pill. Unfortunately, you failed.\nYou received fatal damage. Game over.");
        ui.ch1.setText(":(");
        ui.ch2.setVisible(false);
        ui.ch3.setVisible(false);
        ui.ch4.setVisible(false);
        ui.sts.setVisible(false);

        game.nextPos1 = "quitGame";
        game.nextPos2 = "";
        game.nextPos3 = "";
        game.nextPos4 = "";
    }

    public void northAgain(){
        ui.mainTextA.setText("[Fairy Queen]: There is nothing left to say, adventurer. Go back.");
        ui.ch2.setVisible(false);
        ui.ch3.setVisible(false);
        ui.ch4.setVisible(false);
        ui.sts.setVisible(false);

        ui.ch1.setText("Back");

        game.nextPos1 = "goBack";
        game.nextPos2 = "";
        game.nextPos3 = "";
        game.nextPos4 = "";
    }


    public void east(){
        eastC++;
        ui.mainTextA.setText("After many hours of climbing up the mountain, you reached a Dwarven city of Khaadgard. You quickly sought an audience from King Elrokk.\n[Elrokk]: Well, well, well. The famous adventurer, trying to steal all the joy from this world. I will not go down without a fight!");
        ui.ch1.setText("Talk");
        ui.ch2.setText("Fight");
        ui.ch3.setVisible(false);
        ui.ch4.setVisible(false);
        ui.sts.setVisible(false);

        game.nextPos1 = "talkKing";
        game.nextPos2 = "fightKing";
        game.nextPos3 = "";
        game.nextPos4 = "";
    }

    public void eastAgain(){
        ui.mainTextA.setText("You did it. Everyone is dead, you just wiped the whole kingdom in mere seconds.\nYou monster.");
        ui.ch1.setText("Back");
        ui.ch2.setVisible(false);
        ui.ch3.setVisible(false);
        ui.ch4.setVisible(false);
        ui.sts.setVisible(false);

        game.nextPos1 = "goBack";
        game.nextPos2 = "";
        game.nextPos3 = "";
        game.nextPos4 = "";
    }
    public void talkKing(){
        ui.mainTextA.setText("Did you really think you could talk to a dwarf? They are stubborn. You need to kill him.");
        ui.ch1.setVisible(true);
        ui.ch2.setVisible(true);
        ui.ch3.setVisible(true);
        ui.ch4.setVisible(true);
        ui.sts.setVisible(false);
        ui.ch1.setText("Kill");
        ui.ch2.setText("Kill");
        ui.ch3.setText("Kill");
        ui.ch4.setText("Kill");

        game.nextPos1 = "killKing";
        game.nextPos2 = "killKing";
        game.nextPos3 = "killKing";
        game.nextPos4 = "killKing";
    }

    public void fightKing(){
        ui.mainTextA.setText("You only have one chance, kill him now.");
        ui.ch1.setVisible(true);
        ui.ch2.setVisible(true);
        ui.ch3.setVisible(true);
        ui.ch4.setVisible(true);
        ui.sts.setVisible(false);
        ui.ch1.setText("Kill");
        ui.ch2.setText("Kill");
        ui.ch3.setText("Kill");
        ui.ch4.setText("Kill");

        game.nextPos1 = "killKing";
        game.nextPos2 = "killKing";
        game.nextPos3 = "killKing";
        game.nextPos4 = "killKing";
    }

    public void killKing(){
        ui.mainTextA.setText("You did it. You killed him. You quickly grabbed the Dwarven joy and rushed back.");
        ui.ch2.setVisible(false);
        ui.ch3.setVisible(false);
        ui.ch4.setVisible(false);
        ui.sts.setVisible(false);

        ui.ch1.setText("Back");

        game.nextPos1 = "goBack";
        game.nextPos2 = "";
        game.nextPos3 = "";
        game.nextPos4 = "";
    }

    public void west(){
        westC++;
        ui.mainTextA.setText("test");
    }

}
