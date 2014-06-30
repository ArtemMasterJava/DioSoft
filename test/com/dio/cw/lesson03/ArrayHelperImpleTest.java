package com.dio.cw.lesson03;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayHelperImpleTest {
//    int[] A={1,5,4,23,65,32,78};
//    int[] B={3,5,24,4,1,2,34,45,32,5};
//    int[] testArray = {1, 5, 4, 23, 65, 32, 78, 5, 4, 1, 32, 5};
    private ArrayHelperImple testClass;

    @Before
    public void setup(){
        testClass = new ArrayHelperImple();
    }
    @Test
    public void testLeftUnion_LeftArrayIsEmpty() throws Exception {
        //initialize variable inputs
        int[] leftArray = new int[0];
        int[] rightArray={3,5,24,4,1,2,34,45,32,5};
        int[] expectedValue = new int[0];
        //initialize mocks

        //initialize class to test
       ClassHelper testClass = new ArrayHelperImple();
        //Invoke method on class to test
        int[] returnedValue = testClass.leftUnion(leftArray, rightArray);
        //Assert return value
        assertArrayEquals(expectedValue, returnedValue);

        //verify mock expectation
    }
    @Test
    public void testLeftUnion_RightArrayIsEmpty() throws Exception {
        //initialize variable inputs
        int[] leftArray = new int[]{1,5,4,23,65,32,78};
        int[] rightArray = new int[0];
        int[] expectedValue = {1,5,4,23,65,32,78};
        //initialize mocks

        //initialize class to test
        //ClassHelper testClass = new ArrayHelperImple();
        //Invoke method on class to test
        int[] returnedValue = testClass.leftUnion(leftArray, rightArray);
        //Assert return value
        assertArrayEquals(expectedValue, returnedValue);

        //verify mock expectation test
    }
}