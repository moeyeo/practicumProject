/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen extends ScreenAdapter {
    public SpriteBatch batch;
    private QuickAttacker quickAttacker;
    private Texture bg;
    private World world;
    
    public GameScreen(QuickAttacker quickAttacker) {
        this.quickAttacker = quickAttacker;
        bg = new Texture("bg.gif");
        world = new World(quickAttacker);
    }
    
    @Override
    public void render (float delta) {
        SpriteBatch batch = quickAttacker.batch;
        batch.begin();
        batch.draw(bg, 0, 0);
        batch.end();
    }
	
}
