package com.water.blocks;

public class AirBlock extends Block{

    public AirBlock(){
        super.skin = ' ';
    }

    public void drawnBlock(){
        System.out.printf("%c",skin);
    }
}
