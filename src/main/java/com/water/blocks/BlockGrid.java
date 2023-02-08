package com.water.blocks;

import java.util.ArrayList; 

public class BlockGrid {
    private final int gridHieght = 20;
    private final int gridWidgth = 80;

    private ArrayList<BlockLine> grid;
    
    public BlockGrid(){
        grid = new ArrayList<>();
    }

    public void addBlock(char blockSkin, int row, int colunm){
        if(blockSkin == '#'){
            setBlock(new SolidBlock(), row, colunm);
        }else if(blockSkin == '/' || blockSkin == '\\'){
            setBlock(new WaterBlock(), row, colunm);
        }else{
            setBlock(new AirBlock(), row, colunm);
        }
    }

    private void setBlock(Block block, int row, int colunm){
        BlockLine gridRow = grid.get(row);
        gridRow.setBlock(block, colunm);   
    }

    public void addLine(BlockLine blockLine){
        grid.add(blockLine);

    }

    public void printScreen(){
        for(int i = 0; i < grid.size(); i++){
            for(int j = 0; j < grid.get(0).lineSize(); j++){
                grid.get(i).getBlock(j).drawnBlock();
            }
            System.out.println();
        }
    }

    public void setBlockPosition(){
        Block block;
        for(int i = 0; i < grid.size(); i++){
            for(int j = 0; j < grid.get(0).lineSize(); j++){
                block = grid.get(i).getBlock(j);

                block.setXy(i,j);
                block.setGridAdress(block);                
            }
        }
    }

    // refazer essa gravidade ta mt complicado

    public Block getGridBlock(int x, int y){
        return grid.get(x).getBlock(y);
    }


}
