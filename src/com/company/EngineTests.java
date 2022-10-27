package com.company;

import static org.junit.jupiter.api.Assertions.*;

class EngineTests
{
    @org.junit.jupiter.api.Test
    void engineUnitTest1()
    {
        int[] columnHeightArray = {0,0};

        int pondVolumeExpected = 0;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }

    @org.junit.jupiter.api.Test
    void engineUnitTest2()
    {
        int[] columnHeightArray = {0};

        int pondVolumeExpected = 0;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }

    @org.junit.jupiter.api.Test
    void engineUnitTest3()
    {
        int[] columnHeightArray = {1};

        int pondVolumeExpected = 0;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }

    @org.junit.jupiter.api.Test
    void engineUnitTest4()
    {
        int[] columnHeightArray = {1,0};

        int pondVolumeExpected = 0;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }

    @org.junit.jupiter.api.Test
    void engineUnitTest5()
    {
        int[] columnHeightArray = {1,1};

        int pondVolumeExpected = 0;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }

    @org.junit.jupiter.api.Test
    void engineUnitTest6()
    {
        int[] columnHeightArray = {0,1,0,1};

        int pondVolumeExpected = 1;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }

    @org.junit.jupiter.api.Test
    void engineUnitTest7()
    {
        int[] columnHeightArray = {0,1};

        int pondVolumeExpected = 0;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }

    @org.junit.jupiter.api.Test
    void engineUnitTest8()
    {
        int[] columnHeightArray = {1,1,0};

        int pondVolumeExpected = 0;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }

    @org.junit.jupiter.api.Test
    void engineUnitTest9()
    {
        int[] columnHeightArray = {1,1,0,1};

        int pondVolumeExpected = 1;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }

    @org.junit.jupiter.api.Test
    void engineUnitTest10()
    {
        int[] columnHeightArray = {1,1,0,1,1};

        int pondVolumeExpected = 1;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }

    @org.junit.jupiter.api.Test
    void engineUnitTest11()
    {
        int[] columnHeightArray = {1,1,0,1,0};

        int pondVolumeExpected = 1;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }

    @org.junit.jupiter.api.Test
    void engineUnitTest12()
    {
        int[] columnHeightArray = {1,1,0,0,0};

        int pondVolumeExpected = 0;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }

    @org.junit.jupiter.api.Test
    void engineUnitTest13()
    {
        int[] columnHeightArray = {1,1,0,0,1};

        int pondVolumeExpected = 2;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }

    @org.junit.jupiter.api.Test
    void engineUnitTest14_a()
    {
        int[] columnHeightArray = {1,0,2,0,1};

        int pondVolumeExpected = 2;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }

    @org.junit.jupiter.api.Test
    void engineUnitTest14_b()
    {
        int[] columnHeightArray = {1,0,2,0,2};

        int pondVolumeExpected = 3;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }

    @org.junit.jupiter.api.Test
    void engineUnitTest14_c()
    {
        int[] columnHeightArray = {2,0,1};

        int pondVolumeExpected = 1;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }


    @org.junit.jupiter.api.Test
    void engineUnitTest15()
    {
        int[] columnHeightArray = {0,1,0,2,1,0,1,3,2,1,2,1};

        int pondVolumeExpected = 6;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }
    @org.junit.jupiter.api.Test
    void engineUnitTest16()
    {
        int[] columnHeightArray = {0,2,1,2};

        int pondVolumeExpected = 1;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }

    @org.junit.jupiter.api.Test
    void engineUnitTest17()
    {
        int[] columnHeightArray = {0,2,0,1};

        int pondVolumeExpected = 1;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }

    @org.junit.jupiter.api.Test
    void engineUnitTest18()
    {
        int[] columnHeightArray = {2,1,0,1};

        int pondVolumeExpected = 1;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }

    @org.junit.jupiter.api.Test
    void engineUnitTest19()
    {
        int[] columnHeightArray = {2,1,0,2};

        int pondVolumeExpected = 3;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }

    @org.junit.jupiter.api.Test
    void engineUnitTest20()
    {
        int[] columnHeightArray = {3,0,1,2};

        int pondVolumeExpected = 3;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }

    @org.junit.jupiter.api.Test
    void engineUnitTest21()
    {
        int[] columnHeightArray = {3,0,1,2,3};

        int pondVolumeExpected = 6;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }

    @org.junit.jupiter.api.Test
    void engineUnitTest22()
    {
        int[] columnHeightArray = {3,2,1,0};

        int pondVolumeExpected = 0;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }

    @org.junit.jupiter.api.Test
    void engineUnitTest23()
    {
        int[] columnHeightArray = {3,2,1,0,1};

        int pondVolumeExpected = 1 ;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }

    @org.junit.jupiter.api.Test
    void engineUnitTest24()
    {
        int[] columnHeightArray = {0};

        int pondVolumeExpected = 0 ;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }

    @org.junit.jupiter.api.Test
    void engineUnitTest25()
    {
        int[] columnHeightArray = {1};

        int pondVolumeExpected = 0 ;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }

    @org.junit.jupiter.api.Test
    void engineUnitTest26()
    {
        int[] columnHeightArray = {0,1};

        int pondVolumeExpected = 0 ;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }

    @org.junit.jupiter.api.Test
    void engineUnitTest27()
    {
        int[] columnHeightArray = {1,0};

        int pondVolumeExpected = 0 ;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }

    @org.junit.jupiter.api.Test
    void engineUnitTest28()
    {
        int[] columnHeightArray = {0,1,0};

        int pondVolumeExpected = 0 ;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }

    @org.junit.jupiter.api.Test
    void engineUnitTest29()
    {
        int[] columnHeightArray = {2,1,0};

        int pondVolumeExpected = 0 ;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }

    @org.junit.jupiter.api.Test
    void engineUnitTest30()
    {
        int[] columnHeightArray = {1,2,0};

        int pondVolumeExpected = 0 ;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }

    @org.junit.jupiter.api.Test
    void engineUnitTest31()
    {
        int[] columnHeightArray = {1,0,1};

        int pondVolumeExpected = 1;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }

    @org.junit.jupiter.api.Test
    void engineUnitTest32()
    {
        int[] columnHeightArray = {0,0,1,1,1};

        int pondVolumeExpected = 0;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }

    @org.junit.jupiter.api.Test
    void engineUnitTest33()
    {
        int[] columnHeightArray = {0,0,1,1,0,1};

        int pondVolumeExpected = 1;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }

    @org.junit.jupiter.api.Test
    void engineUnitTest34()
    {
        int[] columnHeightArray = {2,1,2,6,9,7,5,5,7};

        int pondVolumeExpected = 5;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }

    @org.junit.jupiter.api.Test
    void engineUnitTest35()
    {
        int[] columnHeightArray = {2,1,2,6,9,7,5,5};

        int pondVolumeExpected = 1;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }

    @org.junit.jupiter.api.Test
    void engineUnitTest36()
    {
        int[] columnHeightArray = {2,1,2,6,5,6};

        int pondVolumeExpected = 2;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }

    @org.junit.jupiter.api.Test
    void engineUnitTest37()
    {
        int[] columnHeightArray = {6,5,6,2,1,2,};

        int pondVolumeExpected = 2;
        assertEquals(pondVolumeExpected, Engine.pondVolumeEngine(columnHeightArray));
    }

}