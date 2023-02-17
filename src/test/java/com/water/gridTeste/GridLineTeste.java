package com.water.gridTeste;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.water.grid.GridLine;
import com.water.blocks.SolidBlock;
import com.water.blocks.WaterBlock;
import com.water.blocks.AirBlock;

import com.water.grid.GridLineFactory;

public class GridLineTeste {

    private final String skinLine = "#^ ";
    private GridLine gridLineFactorie;

    @Test
    public void GridLineLoadBlocksFactoreTeste(){
        gridLineFactorie = GridLineFactory.loadLineWithText(skinLine, 0);
        assertTrue((gridLineFactorie.array.get(0) instanceof SolidBlock));
        assertTrue((gridLineFactorie.array.get(1) instanceof WaterBlock));
        assertTrue((gridLineFactorie.array.get(2) instanceof AirBlock));
    }
}
