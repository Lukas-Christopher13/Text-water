package com.water.blocks;

public class AirBlock extends Block{

    public AirBlock(int colum, int row){
        super(colum ,row);
        super.skin = ' ';
    }

    public void drawnBlock(){
        System.out.printf("%c",skin);
    }
}
