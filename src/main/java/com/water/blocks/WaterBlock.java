package com.water.blocks;

public class WaterBlock extends Block{

    public WaterBlock(){
        super.skin = '^';
    }

    public void drawnBlock(){
        System.out.printf("%c",skin);
    }
}
