package com.water.gridTeste.fileToolsTeste;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.water.grid.fileTools.FileFunctios;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.IOException;

public class TesteFileFunctions {
    @Test
    public void OpenFileAndReadAllLinesFromBufferTeste() throws IOException{
        String fileTextPath = "src/test/java/com/water/gridTeste/fileToolsTeste/texteForTeste.txt";
        BufferedReader bufferedReader = FileFunctios.openFile(fileTextPath);

        String expectedLinesFromFileTexte[] = {"One file","for","testing"};
        ArrayList<String> fileLines =  FileFunctios.readAllLinesFromBuffer(bufferedReader);

        for(int i = 0; i < expectedLinesFromFileTexte.length; i++){
            assertEquals(expectedLinesFromFileTexte[i], fileLines.get(i));
        }
    }
}
