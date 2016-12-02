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
    private Texture blackBlock;
    private Texture redBlock;
    private Texture blueBlock;
    private World world;
    float delta;
    int[] x = new int[4];
    int[] y = new int[4];
    int[] swordX = new int[6];
    int[] swordY = new int[6];
    int gameStage;
    
    public GameScreen(QuickAttacker quickAttacker) {
        this.quickAttacker = quickAttacker;
        bg = new Texture("bg.gif");
        blackBlock = new Texture("blackBlock.png");
        redBlock = new Texture("redBlock.png");
        blueBlock = new Texture("blueBlock.png");
        world = new World(quickAttacker);
        x = world.getPositionXBlock();
        y = world.getPositionYBlock();
        swordX = world.getPositionSwordX();
        swordY = world.getPositionSwordY();
    }
    
    @Override
    public void render (float delta) {
        world.render();
        gameStage = world.getGameStage();
        SpriteBatch batch = quickAttacker.batch;
            batch.begin();
            batch.draw(bg, 0, 0);
            for(int i = 0; i<x.length; i++){
                batch.draw(blackBlock, x[i], y[i]);
            }
            batch.end();
    }
}
