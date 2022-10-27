package com.company;

import static org.junit.jupiter.api.Assertions.*;

class pondVolumeCalculatorTests {

    @org.junit.jupiter.api.Test
    void volumeUnitTest1()
    {
        int[] columnHeightArray = {3,1,1,3};

        assertEquals(4, pondVolumeCalculator.getFinalVolume(columnHeightArray, 0, 3));
    }

    @org.junit.jupiter.api.Test
    void volumeUnitTest2()
    {
        int[] columnHeightArray = {4,0,0,4};

        assertEquals(8, pondVolumeCalculator.getFinalVolume(columnHeightArray, 0, 3));
    }

    @org.junit.jupiter.api.Test
    void volumeUnitTest3()
    {
        int[] columnHeightArray = {4,2,1,0,4};

        assertEquals(9, pondVolumeCalculator.getFinalVolume(columnHeightArray, 0, 4));
    }

    @org.junit.jupiter.api.Test
    void volumeUnitTest4()
    {
        int[] columnHeightArray = {2,0,1};

        assertEquals(1, pondVolumeCalculator.getFinalVolume(columnHeightArray, 0, 2));
    }

    @org.junit.jupiter.api.Test
    void volumeUnitTest5()
    {
        int[] columnHeightArray = {3,0,1,2};

        assertEquals(3, pondVolumeCalculator.getFinalVolume(columnHeightArray, 0, 3));
    }
}