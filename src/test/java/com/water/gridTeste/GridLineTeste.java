package com.water.gridTeste;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.water.grid.GridLine;
import com.water.blocks.SolidBlock;
import com.water.blocks.WaterBlock;
import com.water.blocks.AirBlock;

public class GridLineTeste {

    private final String skinLine = "#^ ";
    private GridLine gridLineFactorie;
    private GridLine expectedGridLine;

    @Before
    public void initFunction(){
        this.expectedGridLine = new GridLine();
        expectedGridLine.addBlock(new SolidBlock());
        expectedGridLine.addBlock(new WaterBlock());
        expectedGridLine.addBlock(new AirBlock());
    }

    @Test
    public void GridLineLoadBlocksFactoreTeste(){
        this.gridLineFactorie = GridLine.GridLineLoadBlocksFactore(skinLine);
        assertTrue(expectedGridLine.equals(gridLineFactorie));
    }
}
