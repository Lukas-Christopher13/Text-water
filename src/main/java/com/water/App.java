package com.water;

import com.water.grid.Grid;

public class App 
{
    public static void main( String[] args )
    {
      
       Grid grid = new Grid("teste.txt");

       while(true){
        
        Grid.printScreen();
        try{
            Thread.sleep(200);
        }catch(InterruptedException ex) {}
        System.out.print("\033[H\033[2J");


       }
    }
}
