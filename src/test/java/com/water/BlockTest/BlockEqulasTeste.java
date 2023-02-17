package com.water.BlockTest;

import com.water.blocks.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class BlockEqulasTeste {
    Block waterBlock;
    Block solidBlock;
    Block otherSolidBlock;
    String diferentInstance;

    @Before
    public void initData(){
        waterBlock = new WaterBlock(0,0);
        solidBlock = new SolidBlock(0,0);
        otherSolidBlock = new SolidBlock(0,0);
        diferentInstance = "not same";
    }

    @Test
    public void testEqualsWhenAreTheSameObject(){
        assertTrue(waterBlock.equals(waterBlock));
    }

    @Test
    public void testEqualsWhenAreDiferentInstance(){
        assertFalse(waterBlock.equals(diferentInstance));
    }
   
    @Test
    public void testEqualsWhenNotEquals(){
        assertFalse(waterBlock.equals(solidBlock));
    }

    @Test
    public void testEqualsWhenAreEquals(){
        assertTrue(solidBlock.equals(otherSolidBlock));
    }
}
