package com.water.grid;

import java.util.ArrayList; 

import com.water.blocks.Block;
import com.water.grid.LoadGrid;

public class Grid {

    public static ArrayList<GridLine> array;
    public static ArrayList<Block> endLine;
    public static int columSize;
    public static int rowSize;

    public Grid(String filePath){
        array = new ArrayList<>();

        LoadGrid.withUserFile(filePath);

        columSize = array.size();
        rowSize = array.get(0).array.size();
    }

    //train
    public static void printScreen(){
        for(int colum = 0; colum < array.size(); colum++){
            for(int row = 0; row < array.get(0).array.size(); row++){
                getGridBlock(colum, row).drawnBlock();
            }
            System.out.println();
        }
    }
 
    public static void setBlock(Block block, int colum, int row){
        array.get(colum).array.set(row, block);
    }

    public static void addLine(GridLine blockLine){
        array.add(blockLine);
    }

    public static Block getGridBlock(int colum, int row){
        return array.get(colum).array.get(row);
    }
}
