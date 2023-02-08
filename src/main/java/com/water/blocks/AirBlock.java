package com.water.blocks;

import com.water.blocks.blockEvent.BlockReference;
import com.water.blocks.blockEvent.BlockEvent;
import com.water.blocks.blockEvent.Gravity;

public class AirBlock implements Block{

    private static BlockGrid grid;

    private BlockReference positionOf;
    private char skin = ' ';
    private int x;
    private int y;

    public void setGridAdress(Block blockAdress){
        positionOf.block = blockAdress;
    }
    

    public void setGrid(BlockGrid grid){
        this.grid = grid;
    }

    public void startEvent(){}

    public void drawnBlock(){
        System.out.printf("%c",skin);
    }

    public void setXy(int x, int y){
        this.x = x;
        this.y = y;
    }

    
    
}
