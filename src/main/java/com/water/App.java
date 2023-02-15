package com.water;

import com.water.blocks.Block;
import com.water.blocks.WaterBlock;
import com.water.grid.Grid;
import com.water.grid.LoadGrid;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Grid teste = new Grid();
       Block sdf = new WaterBlock();

       LoadGrid loadGrid = new LoadGrid(teste);
       loadGrid.LoadGridWithUserFile("/water/teste.txt");
    

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
