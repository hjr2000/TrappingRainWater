package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class rightHandPillarFinderTests {

    @Test
    void getRightPillarUnitTest1() {
        int[] columnHeightArray = {3,0,1,2,1};
        int leftPillarIndex = 0;
        int rightHandPillarIndexExpected = 3;

        // Expected result
        assertEquals(rightHandPillarIndexExpected, rightHandPillarFinder.getRightHandPillarIndex(columnHeightArray, leftPillarIndex));
    }

    @Test
    void getRightPillarUnitTest2() {
        int[] columnHeightArray = {3,0,1,0,2};
        int leftPillarIndex = 0;
        int rightHandPillarIndexExpected = 4;

        // Expected result
        assertEquals(rightHandPillarIndexExpected, rightHandPillarFinder.getRightHandPillarIndex(columnHeightArray, leftPillarIndex));
    }

    @Test
    void getRightPillarUnitTest3() {
        int[] columnHeightArray = {1,0};
        int leftPillarIndex = 0;
        int rightHandPillarIndexExpected = -99;

        // Expected result
        assertEquals(rightHandPillarIndexExpected, rightHandPillarFinder.getRightHandPillarIndex(columnHeightArray, leftPillarIndex));
    }

    @Test
    void getRightPillarUnitTest4() {
        int[] columnHeightArray = {3,0,3,4,1};
        int leftPillarIndex = 0;
        int rightHandPillarIndexExpected = 2;

        // Expected result
        assertEquals(rightHandPillarIndexExpected, rightHandPillarFinder.getRightHandPillarIndex(columnHeightArray, leftPillarIndex));
    }

    @Test
    void getRightPillarUnitTest5() {
        int[] columnHeightArray = {2,0,1};
        int leftPillarIndex = 0;
        int rightHandPillarIndexExpected = 2;

        // Expected result
        assertEquals(rightHandPillarIndexExpected, rightHandPillarFinder.getRightHandPillarIndex(columnHeightArray, leftPillarIndex));
    }

}