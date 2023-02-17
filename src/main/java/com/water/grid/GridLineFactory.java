package com.water.grid;

import com.water.blocks.BlockTools;
import com.water.blocks.Block;

public class GridLineFactory {

    private static GridLine gridLine;
    private static char[] blockSkins;

    public static GridLine loadLineWithText(String skinLine, int colum) { 
        gridLine = new GridLine();
        blockSkins = skinLine.toCharArray();

        int row = 0;

        for(char blockSkin : blockSkins){
            Block block = BlockTools.createBlock(blockSkin, colum, row);
            gridLine.array.add(block);
            row++;
        }
        return gridLine;
    }
}
