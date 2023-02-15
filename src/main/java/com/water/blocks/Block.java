package com.water.blocks;

public abstract class Block {

    protected char skin;
    
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

    public char getSkin(){
        return skin;
    }

    abstract public void drawnBlock();
}
