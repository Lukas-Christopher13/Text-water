package com.water.blocks;

import com.water.blocks.blockEvent.BlockReference;

import javax.swing.text.Position;

import com.water.blocks.blockEvent.BlockEvent;
import com.water.blocks.blockEvent.Gravity;

public class WaterBlock implements Block{

    private static BlockGrid grid;

    private BlockReference positionOf;
    private BlockEvent event;
    private char skin = '^';
    private int x;
    private int y;

    public void setGridAdress(Block blockAdress){
        positionOf.block = blockAdress;
    }
    
    public void setGrid(BlockGrid grid){
        this.grid = grid;
    }

    public void startEvent(){
        this.event = new Gravity();
        event.gravity();

    }

    public void setXy(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setPositionOfDownBlcock(){
        positionOf = new BlockReference();
        positionOf.block = grid.getGridBlock(x, y);
        positionOf.downBlock = grid.getGridBlock(x, y-1);
        positionOf.upBlock = grid.getGridBlock(x, y+1);
        
    }
    
    public void drawnBlock(){
        System.out.printf("%c",skin);
    }
}
