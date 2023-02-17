package com.water.blocks;

public class BlockTools {

    public static Block createBlock(char blockSkin, int colum, int row){
        if(blockSkin == '#'){
            return (new SolidBlock(colum, row));
        }else if(blockSkin == '^' || blockSkin == '\\'){
            return (new WaterBlock(colum, row));
        }else{
            return (new AirBlock(colum, row));
        }
    }

}
    

