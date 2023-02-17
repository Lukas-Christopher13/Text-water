package com.water.event;

import com.water.blocks.Block;

public class Events {

    private Block block;
    private OtherBlocks otherBlocks;

    public void gravity(Block block){
        this.block = block;
    }
    
}
