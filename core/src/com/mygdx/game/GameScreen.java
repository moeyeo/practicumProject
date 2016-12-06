/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen extends ScreenAdapter {
    public SpriteBatch batch;
    private QuickAttacker quickAttacker;
    private Texture bg;
    private Texture blackBlock;
    private Texture redBlock_s;
    private Texture blueBlock_s;
    private Texture redBlock_d;
    private Texture blueBlock_d;
    private Texture redTable;
    private Texture blueTable;
    private World world;
    float delta;
    int[] x = new int[4];
    int[] y = new int[4];
    int[] swordX = new int[6];
    int[] swordY = new int[6];
    int[] defenseX = new int[2];
    int[] defenseY = new int[2];
    int gameStage;
    int scorePalyer1;
    int scorePlayer2;
    BitmapFont font;
    
    public GameScreen(QuickAttacker quickAttacker) {
        this.quickAttacker = quickAttacker;
        bg = new Texture("bg-center.gif");
        blackBlock = new Texture("blackblock.png");
        redBlock_s = new Texture("redblock-s.png");
        blueBlock_s = new Texture("blueblock-s.png");
        redBlock_d = new Texture("redblock-d.png");
        blueBlock_d = new Texture("blueblock-d.png");
        redTable = new Texture("redtable.png");
        blueTable = new Texture("bluetable.png");
        world = new World(quickAttacker);
        x = world.getPositionXBlock();
        y = world.getPositionYBlock();
        swordX = world.getPositionSwordX();
        swordY = world.getPositionSwordY();
        defenseX = world.getPositionDefenseX();
        defenseY = world.getPositionDefenseY();
        font = new BitmapFont();
    }
    
    @Override
    public void render (float delta) {
        x = world.getPositionXBlock();
        y = world.getPositionYBlock();
        swordX = world.getPositionSwordX();
        swordY = world.getPositionSwordY();
        defenseX = world.getPositionDefenseX();
        defenseY = world.getPositionDefenseY();
        world.render();
        gameStage = world.getGameStage();
        SpriteBatch batch = quickAttacker.batch;
        if(gameStage==0) {
            batch.begin();
            batch.draw(bg, 0, 0);
            font.draw(batch,""+world.getScorePlayer2(),150, 580);
            font.draw(batch,""+world.getScorePlayer1(),1130, 580);
            batch.end();
            //gameStage=1;
        }
        if(gameStage==1) {    
            batch.begin();
            batch.draw(bg, 0, 0);
            font.draw(batch,""+world.getScorePlayer1(),150, 580);
            font.draw(batch,""+world.getScorePlayer2(),1130, 580);
            for(int i = 0; i<x.length; i++){
                batch.draw(blackBlock, x[i], y[i]);
            }
            batch.end();
        }
        if(gameStage==2) {    
            batch.begin();
            batch.draw(bg, 0, 0);
            batch.draw(blueTable, 328, 25);
            font.draw(batch,""+world.getScorePlayer1(),150, 580);
            font.draw(batch,""+world.getScorePlayer2(),1130, 580);
            for(int i = 0; i<swordX.length; i++){
                batch.draw(blueBlock_s, swordX[i], swordY[i]);
            }
            for(int i = 0; i<defenseX.length; i++){
                batch.draw(redBlock_d, defenseX[i], defenseY[i]);
            }
            batch.end();
        }
        if(gameStage==3) {    
            batch.begin();
            batch.draw(bg, 0, 0);
            batch.draw(redTable, 328, 25);
            font.draw(batch,""+world.getScorePlayer1(),150, 580);
            font.draw(batch,""+world.getScorePlayer2(),1130, 580);
            for(int i = 0; i<swordX.length; i++){
                batch.draw(redBlock_s, swordX[i], swordY[i]);
            }
            for(int i = 0; i<defenseX.length; i++){
                batch.draw(blueBlock_d, defenseX[i], defenseY[i]);
            }
            batch.end();
        }
    }
}
