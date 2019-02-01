package com.lambton.magicalcardgame;

import java.util.Scanner;
import java.lang.*;
public class MCardGame {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        MagicalCardGameModel magicalCardGameModel=new MagicalCardGameModel();
        MagicalCardGameCalculator mc=new MagicalCardGameCalculator();

        String[][] cardMatrix={{"A","4","3"},{"K","7","2"},{"5","9","8"}};
        magicalCardGameModel.setCardList(cardMatrix);

        System.out.println("Welcome to Magical Card Game\nSelect a card");
        String selc=sc.nextLine();

        System.out.println("Select the column position of your card");
        magicalCardGameModel.setFirstShuffleColPos(sc.nextLine());
        mc.getFirstShuffleResult(magicalCardGameModel);

        System.out.println("Now select the column position of your card");
        magicalCardGameModel.setSecShuffleColPos(sc.nextLine());
        mc.getSecShuffleResult(magicalCardGameModel);

        
    }
}
