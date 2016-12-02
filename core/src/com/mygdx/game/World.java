package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import java.util.Random;

public class World {
    private QuickAttacker quickAttacker;
    private BlackBlock blackBlock;
    Random rand = new Random();
    int[] numBlock = new int[4];
    int[] sword = new int[6];
    int[] defense = new int[2];
    boolean[] player1;
    boolean[] player2; 
    int timePlayer1;
    int timePlayer2;
    int attacker = 0;
    int gameStage = 1;
    
    public World(QuickAttacker quickAttacker){
        this.quickAttacker = quickAttacker;
        blackBlock = new BlackBlock(quickAttacker);
        do {
            numBlock = getRandom(numBlock);
        } while(checkArray(numBlock) == false);
        player1 = setButton(numBlock);
        player2 = setButton(numBlock);
        do {
            sword = getRandom(sword);
        } while(checkArray(sword) == false);
        do {
            defense = getRandom(defense);
        } while(checkArray(defense) == false);
    }
    
    public void render(){
        int time1 = player1();
        int time2 = player2();
        if(time1!=0 && time2!=0)
            compare(time1, time2); 
    }
    
    public int player1(){
        if(!checkPass(player1)){
            timePlayer1 += 1;
            if(Gdx.input.isKeyPressed(Input.Keys.SPACE)){
                player1[0]=true;
            }
            if(Gdx.input.isKeyPressed(Input.Keys.SPACE)){
                player1[1]=true;
            } 
            if(Gdx.input.isKeyPressed(Input.Keys.SPACE)){
                player1[2]=true;
            } 
            if(Gdx.input.isKeyPressed(Input.Keys.SPACE)){
                player1[3]=true;
            }
            if(Gdx.input.isKeyPressed(Input.Keys.Q)){
                player1[4]=true;
            }
            if(Gdx.input.isKeyPressed(Input.Keys.W)){
                player1[5]=true;
            } 
            if(Gdx.input.isKeyPressed(Input.Keys.E)){
                player1[6]=true;
            } 
            if(Gdx.input.isKeyPressed(Input.Keys.R)){
                player1[7]=true;
            }
            if(Gdx.input.isKeyPressed(Input.Keys.A)){
                player1[8]=true;
            }
            if(Gdx.input.isKeyPressed(Input.Keys.S)){
                player1[9]=true;
            } 
            if(Gdx.input.isKeyPressed(Input.Keys.D)){
                player1[10]=true;
            } 
            if(Gdx.input.isKeyPressed(Input.Keys.F)){
                player1[11]=true;
            }
            if(Gdx.input.isKeyPressed(Input.Keys.Z)){
                player1[12]=true;
            }
            if(Gdx.input.isKeyPressed(Input.Keys.X)){
                player1[13]=true;
            } 
            if(Gdx.input.isKeyPressed(Input.Keys.C)){
                player1[14]=true;
            } 
            if(Gdx.input.isKeyPressed(Input.Keys.V)){
                player1[15]=true;
            }
        }
        else {
            timePlayer1 += 0;
            return timePlayer1;
        }
        return 0;
    }
    
     public int player2(){ 
        if(!checkPass(player2)){
            timePlayer2 += 1;
            if(Gdx.input.isKeyPressed(Input.Keys.ENTER)){
                player2[0]=true;
            }
            if(Gdx.input.isKeyPressed(Input.Keys.ENTER)){
                player2[1]=true;
            } 
            if(Gdx.input.isKeyPressed(Input.Keys.ENTER)){
                player2[2]=true;
            } 
            if(Gdx.input.isKeyPressed(Input.Keys.ENTER)){
                player2[3]=true;
            }
            if(Gdx.input.isKeyPressed(Input.Keys.Q)){
                player2[4]=true;
            }
            if(Gdx.input.isKeyPressed(Input.Keys.W)){
                player2[5]=true;
            } 
            if(Gdx.input.isKeyPressed(Input.Keys.E)){
                player2[6]=true;
            } 
            if(Gdx.input.isKeyPressed(Input.Keys.R)){
                player2[7]=true;
            }
            if(Gdx.input.isKeyPressed(Input.Keys.A)){
                player2[8]=true;
            }
            if(Gdx.input.isKeyPressed(Input.Keys.S)){
                player2[9]=true;
            } 
            if(Gdx.input.isKeyPressed(Input.Keys.D)){
                player2[10]=true;
            } 
            if(Gdx.input.isKeyPressed(Input.Keys.F)){
                player2[11]=true;
            }
            if(Gdx.input.isKeyPressed(Input.Keys.Z)){
                player2[12]=true;
            }
            if(Gdx.input.isKeyPressed(Input.Keys.X)){
                player2[13]=true;
            } 
            if(Gdx.input.isKeyPressed(Input.Keys.C)){
                player2[14]=true;
            } 
            if(Gdx.input.isKeyPressed(Input.Keys.V)){
                player2[15]=true;
            }
        }
        else{
            timePlayer2 += 0;
            return timePlayer2;
        }
        return 0;
    }
     
    public void compare(int time1, int time2) {
        if (time1<time2) {
            System.out.println("Player1 Win!!!");
            attacker = 1;
            gameStage = 2;
            System.out.println(gameStage);
            for(int i = 0; i<sword.length; i++){
                System.out.println(sword[i]);
            }
        } else if (time2<time1) {
            System.out.println("Player2 Win!!!");
            attacker = 2;
            gameStage = 2;
            System.out.println(gameStage);
        } else if (time1==time2) {
            System.out.println("Draw");
            gameStage = 2;
            System.out.println(gameStage);
        }
        timePlayer1 =0;
        timePlayer2 =0;
    }
    
    public boolean checkPass(boolean[] arr){
        for(int i=0 ; i<arr.length; i++){
            if(arr[i]==false)
                return false;
        }
        return true;
    }
    
    public boolean[] setButton(int[] pos){
        boolean[] bool = new boolean[16];
        for(int j=0; j<bool.length; j++) {
                bool[j] = true;
        }
        for(int i=0; i<pos.length ; i++){
            for(int j=0; j<bool.length; j++) {
                if(pos[i]==j)
                    bool[j] = false;
            }
        }
        return bool;
    }
    
    public int[] getRandom(int[] arr){
        for(int i=0; i<arr.length ; i++){
            arr[i] = rand.nextInt(15)+0;
        }
        return arr;
    }
    
    public boolean checkArray(int[] arr){
        for(int i=0; i<arr.length-1 ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[i] == arr[j]){
                    return false;
                }
            }
        }
        return true;
    }
    
    public int[] getPositionXBlock(){
        return blackBlock.getPositionXBlock(numBlock);
    }
    
    public int[] getPositionYBlock(){
        return blackBlock.getPositionYBlock(numBlock);
    }
    
    public int[] getPositionSwordX(){
        return blackBlock.getPositionXBlock(sword);
    }
    
    public int[] getPositionSwordY(){
        return blackBlock.getPositionYBlock(sword);
    }
    
    public boolean[] getPlayer1(){
        return player1;
    }
    
    public boolean[] getPlayer2(){
        return player2;
    }
    
    public int getGameStage() {
        return gameStage;
    }
}
