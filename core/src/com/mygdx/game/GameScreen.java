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
    private World world;
    float delta;
    int[] x = new int[4];
    int[] y = new int[4];
    int[] pos = new int[]{1,2,3,4};
    
    public GameScreen(QuickAttacker quickAttacker) {
        this.quickAttacker = quickAttacker;
        bg = new Texture("bg.gif");
        blackBlock = new Texture("blackBlock.png");
        world = new World(quickAttacker);
        x = world.getPositionXBlock();
        y = world.getPositionYBlock();
    }
    
    @Override
    public void render (float delta) {
        float a = world.player1();
            System.out.println(a);
        SpriteBatch batch = quickAttacker.batch;
        batch.begin();
        batch.draw(bg, 0, 0);
        batch.draw(blackBlock, x[0], y[0]);
        batch.draw(blackBlock, x[1], y[1]);
        batch.draw(blackBlock, x[2], y[2]);
        batch.draw(blackBlock, x[3], y[3]);
        batch.end();
    }
}
