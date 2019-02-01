package com.lambton.magicalcardgame;

import java.util.Scanner;
import java.lang.*;
public class MCardGame {
    public static void main(String args[]){
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Magical Card Game\nSelect a card")
        String selc=sc.nextLine();
        System.out.println("Select the column position of your")*/
        String[][] cardMatrix={{"A","4","3"},{"K","7","2"},{"5","9","8"}};
        MagicalCardGameModel magicalCardGameModel=new MagicalCardGameModel();
        MagicalCardGameCalculator cal= new MagicalCardGameCalculator();
        magicalCardGameModel.setCardList(cardMatrix);
    }
}
