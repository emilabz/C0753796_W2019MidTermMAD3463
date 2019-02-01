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
        System.out.println("list:"+magicalCardGameModel.getCardList());
        System.out.println("Welcome to Magical Card Game\nSelect a card");
        String selc=sc.nextLine();

        System.out.println("Select the column position of your card");
        magicalCardGameModel.setFirstShuffleColPos(sc.nextLine());
        System.out.println("pos sel:"+magicalCardGameModel.getFirstShuffleColPos());
        String[][] temp1=mc.getFirstShuffleResult(magicalCardGameModel);
        magicalCardGameModel.setFirstShuffle(temp1);
        //magicalCardGameModel.setFirstShuffle(mc.getFirstShuffleResult(magicalCardGameModel));
        System.out.println("output for first shuffle:\n"+magicalCardGameModel.getFirstShuffle());
//----------------------------------------------------------------------------------------------------------
        System.out.println("Now select the column position of your card");
        magicalCardGameModel.setSecShuffleColPos(sc.nextLine());
        magicalCardGameModel.setSecShuffle(mc.getSecShuffleResult(magicalCardGameModel));
        String[][] temp2= magicalCardGameModel.getSecShuffle();
        System.out.println("output for first shuffle:\n");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
                System.out.println(temp2[i][j]+" ");
            
        }

        magicalCardGameModel.setGuessedCard(mc.getFinalResult(magicalCardGameModel));
        System.out.println("Selected card is "+magicalCardGameModel.getGuessedCard());
    }
}
