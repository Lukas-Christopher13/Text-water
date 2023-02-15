package com.water.grid;

import com.water.grid.fileTools.FileFunctios;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.ArrayList;

public class LoadGrid {
    private Grid grid;
    
    public LoadGrid(Grid grid){
        this.grid = grid;
    }

    public void LoadGridWithUserFile(String path){
        try{
            //remover a string do path
            tryLoadGridWithTexTFile("teste.txt");
        }catch(FileNotFoundException ex){ 
            System.out.println("O arquivo não encontrado!");
        }catch(IOException ex){
            System.out.println("Erro de entrada e saida!");
        }
    }

    private void tryLoadGridWithTexTFile(String path) throws IOException{
        ArrayList<String> fileSkinLines = FileFunctios.readAllLinesFromBuffer(FileFunctios.openFile(path));
        
        for(String skinLine : fileSkinLines){
            GridLine blockLine = GridLine.GridLineLoadBlocksFactore(skinLine);
            grid.addLine(blockLine);
        }        
    }
}