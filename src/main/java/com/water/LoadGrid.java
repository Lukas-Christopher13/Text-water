package com.water;

import com.water.blocks.BlockGrid;
import com.water.blocks.BlockLine;

import com.water.blocks.Block;
import com.water.blocks.AirBlock;
import com.water.blocks.SolidBlock;
import com.water.blocks.WaterBlock;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class LoadGrid {
    public static final int lineSize = 80;

    private BlockGrid grid;
    
    public LoadGrid(BlockGrid grid){
        this.grid = grid;
    }

    public void reader(String path){
        try{
            tryReadAndPassLineToLoad(path);
        }catch(FileNotFoundException ex){ 
            System.out.println("O arquivo não encontrado!");
        }catch(IOException ex){
            System.out.println("Erro de entrada e saida!");
        }

    }

    private void tryReadAndPassLineToLoad(String pathString) throws IOException{
        File path = new File("teste.txt");

        FileInputStream fileInputStream = new FileInputStream(path);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader buffer = new BufferedReader(inputStreamReader);

        String line = "";
        //talvez deva colocar um contador para localizar alinha na grid
        while(line != null){
            line = buffer.readLine();
            if(line == null){
                buffer.close();
                break;
            }
            loadLine(line);
        }
        buffer.close();
        
    }

    private void loadLine(String bufferLine){
        char[] charLine = new char[lineSize];
        charLine = bufferLine.toCharArray();

        BlockLine line = new BlockLine();

        for(int i = 0; i < charLine.length; i++){
            Block block = blockSelector(charLine[i]);
            line.addBlock(block);
        }
        grid.addLine(line);
    }

    private Block blockSelector(char blockSkin){
        if(blockSkin == '#'){
            return (new SolidBlock());
        }else if(blockSkin == '^' || blockSkin == '\\'){
            return (new WaterBlock());
        }else{
            return (new AirBlock());
        }
    }

}
