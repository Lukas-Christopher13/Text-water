package com.water.blocks;

import com.water.grid.Grid;

public abstract class Block {

    protected char skin;

    public static Grid grid;
    protected int colum;
    protected int row;

    public Block(int colum, int row){
        this.colum = colum;
        this.row = row;
    }
    
    @Override
    public boolean equals(Object object){
        if(object == this){
            return true;
        }
        if(!(object instanceof Block)){
            return false;
        }
        Block block = (Block)object;
    
        if(this.skin != block.skin){
            return false;
        }
        return true;
    }

    public void setColum(int colum) {
        this.colum = colum;
    }

    public void setRow(int row) {
        this.row = row;
    }

    abstract public void drawnBlock();
}
