package com.water.grid;

import java.util.ArrayList;

import com.water.blocks.Block;
import com.water.blocks.BlockTools;

public class GridLine {
    private ArrayList<Block> blockLine;

    public GridLine(){
        blockLine = new ArrayList<>();
    }

    public static GridLine GridLineLoadBlocksFactore(String skinLine) { 
        GridLine gridLine = new GridLine();
        char[] blockSkins = skinLine.toCharArray();

        for(char blockSkin : blockSkins){
            Block block = BlockTools.createBlock(blockSkin);
            gridLine.addBlock(block);
        }
        return gridLine;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((blockLine == null) ? 0 : blockLine.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GridLine other = (GridLine) obj;
        if (blockLine == null) {
            if (other.blockLine != null)
                return false;
        } else if (!blockLine.equals(other.blockLine))
            return false;
        return true;
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
