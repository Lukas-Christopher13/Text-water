package com.water.grid;

import java.util.ArrayList; 

import com.water.blocks.Block;

public class Grid {

    private ArrayList<GridLine> grid;

    public Grid(){
        grid = new ArrayList<>();
    }
    
    public void printScreen(){
        for(int i = 0; i < grid.size(); i++){
            for(int j = 0; j < grid.get(0).lineSize(); j++){
                grid.get(i).getBlock(j).drawnBlock();
            }
            System.out.println();
        }
    }

    public void addLine(GridLine blockLine){
        grid.add(blockLine);
    }

    public Block getGridBlock(int row, int colun){
        return grid.get(row).getBlock(colun);
    }

}
