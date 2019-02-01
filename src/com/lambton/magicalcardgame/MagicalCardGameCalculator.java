package com.lambton.magicalcardgame;
import java.lang.*;

public class MagicalCardGameCalculator implements MagicalCardGameInterface{
    int i;
    public String[][] getFirstShuffleResult(MagicalCardGameModel magicalCardGameModel){
        String[][] a=magicalCardGameModel.getCardList();
        String[][] b={{"0","0","0"},{"0","0","0"},{"0","0","0"}};
        System.out.println("inside fun1");
        //if(magicalCardGameModel.getFirstShuffleColPos()=="C1"){
        if(magicalCardGameModel.getFirstShuffleColPos().equals("C1")){
            for(i=0;i<3;i++){
                b[0][i]=a[i][1];
                b[1][i]=a[i][0];
                b[2][i]=a[i][2];
            }
        }
        //else if(magicalCardGameModel.getFirstShuffleColPos()=="C2"){
        else if(magicalCardGameModel.getFirstShuffleColPos().equals("C2")){
            //System.out.println("inside else");
            for(i=0;i<3;i++){
                //System.out.println("before"+b[0][i]);
//                b[0][i].concat(a[i][0]);
//               b[1][i].concat(a[i][1]);
//               b[2][i].concat(a[i][2]);
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
        String[][] a=magicalCardGameModel.getFirstShuffle();
        String[][] b={{"0","0","0"},{"0","0","0"},{"0","0","0"}};
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
        String[][] a=magicalCardGameModel.getSecShuffle();
        return a[1][1];
    }
}
