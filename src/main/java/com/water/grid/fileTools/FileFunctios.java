package com.water.grid.fileTools;

import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.util.ArrayList;;

public class FileFunctios {

    public static BufferedReader openFile(String StringPath) throws IOException {
        File path = new File(StringPath);

        FileInputStream fileInputStream = new FileInputStream(path);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        return bufferedReader;
    }

    public static ArrayList<String> readAllLinesFromBuffer(BufferedReader bufferedReader) throws IOException{
        String line = "";
        ArrayList<String> fileLines = new ArrayList<>();
        
        while(line != null){
            line = bufferedReader.readLine();
            if(line == null){
                bufferedReader.close();
                break;
            }
            fileLines.add(line);
        }
        bufferedReader.close();
        return fileLines;
    }
}
