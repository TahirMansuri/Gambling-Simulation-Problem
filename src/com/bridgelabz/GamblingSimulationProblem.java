package com.bridgelabz;

import java.util.Random;

public class GamblingSimulationProblem {

    //CONSTANTS for Gambling Game
    private static final int PER_DAY_STACK = 100;
    private static final int BET = 1;
    private static final int BET_WIN = 1;

    //Winning and Loosing Amount
    private static int winStack = 0;
    private static int looseStack = 0;

    //Random Class Object for Playing Status
    private static Random randStatus = new Random();

    //Method to Show the Status of Gambler
    private static void showGamblerStatus() {
        System.out.println("Per Day Stack : $"+ PER_DAY_STACK);
        System.out.println("Bet Per Game : $"+ BET);
    }

    //Method to Play The Game and Make the Bet
    private static void playGame() {
        //Simulating the Game Until Win or Loose nit Reach 50% of Day Stack
        while(true) {
            int gameStatus = randStatus.nextInt(2) + 1;
            if (gameStatus == BET_WIN) {
                winStack += BET;
                System.out.println("Win the GAME !!! WIN STACK : " + winStack);
            } else {
                looseStack += BET;
                System.out.println("Loose the Game. LOOSE STACK :" + looseStack);
            }
            //Checking for the Winning Stack is 50% of PER DAY STACK
            if(winStack == PER_DAY_STACK / 2) {
                System.out.println("Win Stack is 50% of PER DAY STACK. So, Gambler Resigning for the DAY.");
                break;
            }
            //Checking for the Winning Stack is 50% of PER DAY STACK
            if(looseStack == PER_DAY_STACK / 2) {
                System.out.println("Loose Stack is 50% of PER DAY STACK. So, Gambler is Resigning for the DAY");
                break;
            }
        }
    }

    public static void main(String[] args) {
        //Starting Message for User
        System.out.println("Welcome to Gambling Simulation Problem developed by Tahir Mansuri.");

        //Shows the Initial Status of Gambler
        showGamblerStatus();

        //Starting the Game Play for a day
        playGame();
    }
}
