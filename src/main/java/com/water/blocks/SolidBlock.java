package com.water.blocks;

public class SolidBlock extends Block{

    public SolidBlock(){
        super.skin = '#';
    }

    public void drawnBlock(){
        System.out.printf("%c",skin);
    }

}
