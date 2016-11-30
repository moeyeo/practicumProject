/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;

import com.badlogic.gdx.Gdx;
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
    
    public World(QuickAttacker quickAttacker){
        this.quickAttacker = quickAttacker;
        pos = getRandom();
        blackBlock = new BlackBlock(quickAttacker);
        
    }
    
    public int[] getRandom(){
        int[] arr = new int[4];
        for(int i=0; i<4 ; i++){
            arr[i] = rand.nextInt(16)+1;
            }
        arr = checkArray(arr);
        return arr;
    }
    
    public int[] checkArray(int[] arr){
        for(int i=0; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[i] == arr[j]){
                    arr[i] = rand.nextInt(16)+1;
                    checkArray(arr);
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
