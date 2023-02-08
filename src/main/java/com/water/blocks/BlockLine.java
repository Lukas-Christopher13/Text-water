package com.water.blocks;

import java.util.ArrayList;

public class BlockLine {
    public static final int gridHieght = 20;
    public static final int gridWidgth = 80;

    private ArrayList<Block> blockLine;

    public BlockLine(){
        blockLine = new ArrayList<>();
    }

    public void setBlock(Block block, int index){
        blockLine.set(index, block);
    }

    public void addBlock(Block block){
        blockLine.add(block);
    }

    public int lineSize(){
        return blockLine.size();
    }

    public Block getBlock(int index){
        return blockLine.get(index);
    }


    
}
