package com.water.blocks;

import java.util.Set;

public interface Block {
    public void drawnBlock();
    public void setXy(int x, int y);
    public void startEvent();
    //public void setPositionOfDownBlcock(Block block);
    public void setGrid(BlockGrid grid);
    public void setGridAdress(Block blockAdress);

}
