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
    private final int Y0 = 375;
    private final int Y1 = 271;
    private final int Y2 = 164;
    private final int Y3 = 62;
    private final int X0 = 367;
    private final int X1 = 515;
    private final int X2 = 666;
    private final int X3 = 817;
    
    public BlackBlock(QuickAttacker q){
        this.quickAttacker = q;
        batch = quickAttacker.batch;
        blackBlock = new Texture("blackBlock.png");
    }
    
    public int[] getPositionXBlock(int[] pos){
        int a = pos.length;
        int[] x = new int[a];
        for(int i=0; i<a ; i++){
            switch (pos[i]) {
                case 0:
                    x[i]=X0;
                    break;
                case 1:
                    x[i]=X1;
                    break;
                case 2:
                    x[i]=X2;
                    break;
                case 3:
                    x[i]=X3;
                    break;
                case 4:
                    x[i]=X0;
                    break;
                case 5:
                    x[i]=X1;
                    break;
                case 6:
                    x[i]=X2;
                    break;
                case 7:
                    x[i]=X3;
                    break;
                case 8:
                    x[i]=X0;
                    break;
                case 9:
                    x[i]=X1;
                    break;
                case 10:
                    x[i]=X2;
                    break;
                case 11:
                    x[i]=X3;
                    break;
                case 12:
                    x[i]=X0;
                    break;
                case 13:
                    x[i]=X1;
                    break;
                case 14:
                    x[i]=X2;
                    break;
                case 15:
                    x[i]=X3;
                    break;
            }
        }
        return x;
    }
    
    public int[] getPositionYBlock(int[] pos){
        int a = pos.length;
        int[] y = new int[a];
        for(int i=0; i<a ; i++){
            switch (pos[i]) {
                case 0:
                    y[i]=Y0;
                    break;
                case 1:
                    y[i]=Y0;
                    break;
                case 2:
                    y[i]=Y0;
                    break;
                case 3:
                    y[i]=Y0;
                    break;
                case 4:
                    y[i]=Y1;
                    break;
                case 5:
                    y[i]=Y1;
                    break;
                case 6:
                    y[i]=Y1;
                    break;
                case 7:
                    y[i]=Y1;
                    break;
                case 8:
                    y[i]=Y2;
                    break;
                case 9:
                    y[i]=Y2;
                    break;
                case 10:
                    y[i]=Y2;
                    break;
                case 11:
                    y[i]=Y2;
                    break;
                case 12:
                    y[i]=Y3;
                    break;
                case 13:
                    y[i]=Y3;
                    break;
                case 14:
                    y[i]=Y3;
                    break;
                case 15:
                    y[i]=Y3;
                    break;
            }
        }
        return y;
    }
}
