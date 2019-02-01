package com.lambton.magicalcardgame;
import java.util.Scanner;
import java.lang.*;

public class MagicalCardGameCalculator implements MagicalCardGameInterface{
    int i;
    public String[][] getFirstShuffleResult(MagicalCardGameModel magicalCardGameModel){
        String[][] a=magicalCardGameModel.getCardList();
        String[][] b=null;
        if(magicalCardGameModel.getFirstShuffleColPos()=="C1"){
            for(i=0;i<3;i++){
                b[0][i]=a[i][1];
                b[1][i]=a[i][0];
                b[2][i]=a[i][2];
            }
        }
        else if(magicalCardGameModel.getFirstShuffleColPos()=="C2"){
            for(i=0;i<3;i++){
                b[0][i]=a[i][0];
                b[1][i]=a[i][1];
                b[2][i]=a[i][2];
            }
        }
        else{
            for(i=0;i<3;i++){
                b[0][i]=a[i][1];
                b[1][i]=a[i][2];
                b[2][i]=a[i][0];
            }
        }
        return b;
    }
    public String[][] getSecShuffleResult(MagicalCardGameModel magicalCardGameModel){
        String[][] a=magicalCardGameModel.getCardList();
        String[][] b=null;
        if(magicalCardGameModel.getSecShuffleColPos()=="C1"){
            for(i=0;i<3;i++){
                b[0][i]=a[i][1];
                b[1][i]=a[i][0];
                b[2][i]=a[i][2];
            }
        }
        else if(magicalCardGameModel.getSecShuffleColPos()=="C2"){
            for(i=0;i<3;i++){
                b[0][i]=a[i][0];
                b[1][i]=a[i][1];
                b[2][i]=a[i][2];
            }
        }
        else{
            for(i=0;i<3;i++){
                b[0][i]=a[i][1];
                b[1][i]=a[i][2];
                b[2][i]=a[i][0];
            }
        }
        return b;
    }
    public String getFinalResult(MagicalCardGameModel magicalCardGameModel){

    }
}
