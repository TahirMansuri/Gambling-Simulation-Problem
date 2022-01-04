package com.bridgelabz;

import java.util.Random;

public class GamblingSimulationProblem {

    //CONSTANTS for Gambling Game
    private static final int PER_DAY_STACK = 100;
    private static final int BET = 1;
    private static final int BET_WIN = 1;

    //Array Variables for Win or Loose Count
    private static int[] winCountArr = new int[20];
    private static int[] looseCountArr = new int[20];

    //Random Class Object for Playing Status
    private static Random randStatus = new Random();

    //Method to Show the Status of Gambler
    private static void showGamblerStatus() {
        System.out.println("Per Day Stack : $"+ PER_DAY_STACK);
        System.out.println("Bet Per Game : $"+ BET);
    }

    //Method to Play The Game and Make the Bet
    private static void playGame(int i) {
        //Winning and Loosing Amount
        int winStack = 0;
        int looseStack = 0;
        int winCount = 0;
        int looseCount = 0;

        //Simulating the Game Until Win or Loose nit Reach 50% of Day Stack
        while(true) {
            int gameStatus = randStatus.nextInt(2) + 1;
            if (gameStatus == BET_WIN) {
                winCount++;
                winStack += BET;
                System.out.println("Win the GAME !!! WIN STACK : " + winStack);
            } else {
                looseCount++;
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

        //Win and Loose Counter Array Storing Values
        winCountArr[i] = winCount;
        looseCountArr[i] = looseCount;
    }


    //Method to Print the Win and Loose Count for 20 Days
    private static void showWinLooseCount() {
        for(int i= 0; i < 20; i++) {
            System.out.println("Day "+ (i+1) +" Total Win Count :"+ winCountArr[i]);
            System.out.println("Day "+ (i+1) +" Total Loose Count :"+ looseCountArr[i]);
        }
    }
    public static void main(String[] args) {
        //Starting Message for User
        System.out.println("Welcome to Gambling Simulation Problem developed by Tahir Mansuri.");

        //Shows the Initial Status of Gambler
        showGamblerStatus();

        //Starting the Game Play for a day
        for(int i = 0; i < 20; i++) {
            System.out.println("Day " + (i+1) + " Play Start.");
            playGame(i);
            System.out.println("Day " + (i+1) + " Play End.");
        }

        //Methode for Showing 20Days Win Loose Counter
        showWinLooseCount();
    }
}
