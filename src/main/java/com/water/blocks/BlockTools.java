package com.water.blocks;

public class BlockTools {

    public static Block createBlock(char blockSkin){
        if(blockSkin == '#'){
            return (new SolidBlock());
        }else if(blockSkin == '^' || blockSkin == '\\'){
            return (new WaterBlock());
        }else{
            return (new AirBlock());
        }
    }

}
    

