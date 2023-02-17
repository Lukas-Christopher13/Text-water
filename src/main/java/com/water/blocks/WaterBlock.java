package com.water.blocks;


import com.water.event.Event;
import com.water.event.Events;

public class WaterBlock extends Block implements Event{

    public void startEvent(){
        
    }

    public WaterBlock(int colum, int row){
        super(colum ,row);
        super.skin = '^';
    }

    public void drawnBlock(){
        System.out.printf("%c",skin);
    }


}
