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

public class World {
    private QuickAttacker quickAttacker;
    private Block block;   
    int gameStage = 0;
    
    public World(QuickAttacker quickAttacker){
        this.quickAttacker = quickAttacker;
        if(Gdx.input.isKeyPressed(Keys.SPACE))
        {
            gameStage = 1;
        }
    }
    
    private void gameStage(){
        if(gameStage==1)
        {
             
        }
    }
}
