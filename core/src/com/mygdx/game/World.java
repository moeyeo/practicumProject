/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import java.util.Random;

public class World {
    private QuickAttacker quickAttacker;
    private BlackBlock blackBlock;
    Random rand = new Random();
    int[] numBlock = new int[4];
    boolean[] player1;
    boolean[] player2; 
    float timePlayer1;
    float timePlayer2;
    
    public World(QuickAttacker quickAttacker){
        this.quickAttacker = quickAttacker;
        blackBlock = new BlackBlock(quickAttacker);
        do {
            numBlock = getRandom();
        } while(checkArray(numBlock)==false);
 
        player1 = setButton(numBlock);
        player2 = setButton(numBlock);
    }
    
    public float player1(){
        if(checkPass(player1) == false){
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
        else
            timePlayer1 +=0;
        return timePlayer1;
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
    
    public int[] getRandom(){
        int[] arr = new int[4];
        for(int i=0; i<4 ; i++){
            arr[i] = rand.nextInt(15)+4;
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
    
    public boolean[] getPlayer1(){
        return player1;
    }
    
    public boolean[] getPlayer2(){
        return player2;
    }
}
