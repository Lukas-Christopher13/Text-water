package com.water.grid;

import com.water.grid.fileTools.FileFunctios;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.ArrayList;

public class LoadGrid {
    
    public static void withUserFile(String path){
        try{
            //remover a string do path
            tryLoadGridWithTexTFile("teste.txt");
        }catch(FileNotFoundException ex){ 
            System.out.println("O arquivo não encontrado!");
        }catch(IOException ex){
            System.out.println("Erro de entrada e saida!");
        }
    }

    private static void tryLoadGridWithTexTFile(String path) throws IOException{
        ArrayList<String> fileSkinLines = FileFunctios.readAllLinesFromBuffer(FileFunctios.openFile(path));
        
        int colum = 0;
        for(String skinLine : fileSkinLines){
            GridLine blockLine = GridLineFactory.loadLineWithText(skinLine, colum);
            Grid.addLine(blockLine);
            colum++;
        }        
    }    
}