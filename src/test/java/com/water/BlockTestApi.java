package com.water;

import com.water.blocks.Block;
import com.water.grid.GridLine;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;

public class BlockTestApi 
{
    public static void assertContainsBlocks(GridLine expected, GridLine acutual){
        //for(int i = 0; i < acutual.lineSize(); i++){    
            boolean teste = expected.equals(acutual);
            assertTrue(teste);
        //}
    }
}