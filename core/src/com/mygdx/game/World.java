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
    int[] pos = new int[4];
    boolean[] player1; //= new boolean[16];
    boolean[] player2; //= new boolean[16];
    float timePlayer1;
    float timePlayer2;
    
    public World(QuickAttacker quickAttacker){
        this.quickAttacker = quickAttacker;
        pos = getRandom();
        player1 = setButton(pos);
        player2 = setButton(pos);
        blackBlock = new BlackBlock(quickAttacker);
        for(int i=0; i<16; i++){
            System.out.println(player1[i]);
        }
    }
    
    public float player1(float delta){
        timePlayer1=0;
        timePlayer1 += delta;
         if(Gdx.input.isKeyPressed(Input.Keys.Q))
         ; 
        return timePlayer1;
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
            arr[i] = rand.nextInt(15)+0;
        }
        arr = checkArray(arr);
        return arr;
    }
    
    public int[] checkArray(int[] arr){
        for(int i=0; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[i] == arr[j]){
                    arr[i] = rand.nextInt(15)+0;
                    arr = checkArray(arr);
                }
                else
                    return arr;
            }
        }
        return arr;
    }
    
    public int[] getPositionXBlock(){
        return blackBlock.getPositionXBlock(pos);
    }
    
    public int[] getPositionYBlock(){
        return blackBlock.getPositionYBlock(pos);
    }
}
