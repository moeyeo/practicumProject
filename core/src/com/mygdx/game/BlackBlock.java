/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class BlackBlock {
    private QuickAttacker quickAttacker;
    private Texture blackBlock;
    private SpriteBatch batch;
    int[] pos = new int[4];
    int[] x = new int[4];
    int[] y = new int[4];
    
    public BlackBlock(QuickAttacker q){
        this.quickAttacker = q;
        batch = quickAttacker.batch;
        blackBlock = new Texture("blackBlock.png");
    }
    
    public int[] getPositionXBlock(int[] pos){
        this.pos = pos;
        for(int i=0; i<4 ; i++){
            switch (pos[i]) {
                case 1:
                    x[i]=110;
                    y[i]=398;
                    break;
                case 2:
                    x[i]=259;
                    y[i]=398;
                    break;
                case 3:
                    x[i]=410;
                    y[i]=398;
                    break;
                case 4:
                    x[i]=561;
                    y[i]=398;
                    break;
                case 5:
                    x[i]=110;
                    y[i]=294;
                    break;
                case 6:
                    x[i]=259;
                    y[i]=294;
                    break;
                case 7:
                    x[i]=410;
                    y[i]=294;
                    break;
                case 8:
                    x[i]=561;
                    y[i]=294;
                    break;
                case 9:
                    x[i]=110;
                    y[i]=187;
                    break;
                case 10:
                    x[i]=259;
                    y[i]=187;
                    break;
                case 11:
                    x[i]=410;
                    y[i]=187;
                    break;
                case 12:
                    x[i]=561;
                    y[i]=187;
                    break;
                case 13:
                    x[i]=110;
                    y[i]=85;
                    break;
                case 14:
                    x[i]=259;
                    y[i]=85;
                    break;
                case 15:
                    x[i]=410;
                    y[i]=85;
                    break;
                case 16:
                    x[i]=561;
                    y[i]=85;
                    break;
            }
        }
        return x;
    }
    
    public int[] getPositionYBlock(int[] pos){
        this.pos = pos;
        for(int i=0; i<4 ; i++){
            switch (pos[i]) {
                case 0:
                    x[i]=110;
                    y[i]=398;
                    break;
                case 1:
                    x[i]=259;
                    y[i]=398;
                    break;
                case 2:
                    x[i]=410;
                    y[i]=398;
                    break;
                case 3:
                    x[i]=561;
                    y[i]=398;
                    break;
                case 4:
                    x[i]=110;
                    y[i]=294;
                    break;
                case 5:
                    x[i]=259;
                    y[i]=294;
                    break;
                case 6:
                    x[i]=410;
                    y[i]=294;
                    break;
                case 7:
                    x[i]=561;
                    y[i]=294;
                    break;
                case 8:
                    x[i]=110;
                    y[i]=187;
                    break;
                case 9:
                    x[i]=259;
                    y[i]=187;
                    break;
                case 10:
                    x[i]=410;
                    y[i]=187;
                    break;
                case 11:
                    x[i]=561;
                    y[i]=187;
                    break;
                case 12:
                    x[i]=110;
                    y[i]=85;
                    break;
                case 13:
                    x[i]=259;
                    y[i]=85;
                    break;
                case 14:
                    x[i]=410;
                    y[i]=85;
                    break;
                case 15:
                    x[i]=561;
                    y[i]=85;
                    break;
            }
        }
        return y;
    }
}
