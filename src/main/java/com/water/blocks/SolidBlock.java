package com.water.blocks;

public class SolidBlock extends Block{

    public SolidBlock(int colum, int row){
        super(colum ,row);
        super.skin = '#';
    }

    public void drawnBlock(){
        System.out.printf("%c",skin);
    }

}
