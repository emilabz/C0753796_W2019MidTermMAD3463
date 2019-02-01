package com.lambton.magicalcardgame;
import java.util.Scanner;
import java.lang.*;

public class MagicalCardGameCalculator implements MagicalCardGameInterface{
    int i,j;
    public String[][] getFirstShuffleResult(MagicalCardGameModel magicalCardGameModel){
        String[][] a=magicalCardGameModel.getCardList();
        String[][] b=null;
        if(magicalCardGameModel.getFirstShuffleColPos()=="C1"){
            for(i=0;i<3;i++){
                b[0][i]=a[i][1];
                b[1][i]=a[i][0];
                b[2][i]=a[i][2];
            }
            magicalCardGameModel.
        }
        else if(magicalCardGameModel.getFirstShuffleColPos()=="C2"){

        }
        else{

        }

    }
    public String[][] getSecShuffleResult(MagicalCardGameModel magicalCardGameModel){

    }

}
