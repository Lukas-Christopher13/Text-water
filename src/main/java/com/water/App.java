package com.water;

import com.water.blocks.Block;
import com.water.blocks.BlockGrid;
import com.water.blocks.WaterBlock;
import com.water.LoadGrid;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       BlockGrid teste = new BlockGrid();
       Block sdf = new WaterBlock();
       sdf.setGrid(teste);

       LoadGrid loadGrid = new LoadGrid(teste);
       loadGrid.reader("/water/teste.txt");
       teste.setBlockPosition();
    

       System.out.print("\033[H\033[2J");


       while(true){
        teste.printScreen();
        try{
            Thread.sleep(1000);
        }catch(InterruptedException ex) {}
        System.out.print("\033[H\033[2J");
       }
    }
}
