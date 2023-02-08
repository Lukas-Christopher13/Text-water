package com.water;

public class Screen {
    private final int screenHeight = 20;
    private final int screenWidth = 80;

    private char[][] screen = new char[screenHeight][screenWidth];

    public Screen(){
        System.out.print("\033[H\033[2J");
        for(int i = 0; i < screenHeight; i++){
            for(int j = 0; j < screenWidth; j++){
                if(j == 0 || j == screenWidth-1){
                    screen[i][j] = '|';
                }else{
                    screen[i][j] = ' ';
                } 
            }
        }
        for(int j = 0; j < screenWidth; j++){
            screen[screenHeight-1][j] = '_';
        } 
    }

    public void printScreen(){
        for(int i = 0; i < screenHeight; i++){
            for(int j = 0; j < screenWidth; j++){
                System.out.printf("%c",screen[i][j]);
            }
            System.out.println();
        }
    }

    public void screenLoop(){
        while(true){
            printScreen();
            
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ex) {}
            System.out.print("\033[H\033[2J");
        }

    }

    public void makeScreen(){
        

    }

    
    
}
