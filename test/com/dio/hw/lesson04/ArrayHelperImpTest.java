package com.dio.hw.lesson04;

import com.dio.cw.lesson03.ArrayHelperImple;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Андрей on 30.06.2014.
 */
public class ArrayHelperImpTest extends ArrayHelperImp
{
    //local code review (vtegza): it is preferred to initiate testClass for every test case @ 21.07.14
    private ArrayHelperImp testClass;

    @Before
    public void setup()
    {
        testClass = new ArrayHelperImp();
    }
    // Test function merge --------------------------------------------------------------

    @Test
    public void testMerge_PrimitiveTest ()throws Exception
    {
        int[] firstArray = {1, 5, 4, 23, 65, 32, 78};
        int[] secondArray = {3, 5, 24, 54, 1, 2, 34, 45, 32};
        int[] expectedValue = {1, 5, 4, 23, 65, 32, 78, 3, 24, 54, 2, 34, 45};

        int[] returnedValue = testClass.merge(firstArray, secondArray);
        assertArrayEquals(expectedValue, returnedValue);
    }

    @Test
    public void testMerge_FirstArrayIsEmpty ()throws Exception
    {
        int[] firstArray = new int[0];
        int[] secondArray = {3, 5, 24, 54, 1, 2, 34, 45, 32};
        int[] expectedValue = {3, 5, 24, 54, 1, 2, 34, 45, 32};

        int[] returnedValue = testClass.merge(firstArray, secondArray);
        assertArrayEquals(expectedValue, returnedValue);
    }

    @Test
    public void testMerge_SecondArrayIsEmpty ()throws Exception
    {
        int[] firstArray = {1, 5, 4, 23, 65, 32, 78};
        int[] secondArray = new int[0];
        int[] expectedValue = {1, 5, 4, 23, 65, 32, 78};

        int[] returnedValue = testClass.merge(firstArray, secondArray);
        assertArrayEquals(expectedValue, returnedValue);

    }

    @Test(expected = NullPointerException.class)
    public void testMerge_FirstArrayIsNull ()throws Exception
    {
        int[] firstArray = null;
        int[] secondArray = {3, 5, 24, 54, 1, 2, 34, 45, 32};
        int[] expectedValue = {3, 5, 24, 54, 1, 2, 34, 45, 32};

        int[] returnedValue = testClass.merge(firstArray, secondArray);
        assertArrayEquals(expectedValue, returnedValue);
    }

    @Test(expected = NullPointerException.class)
    public void testMerge_SecondArrayIsNull ()throws Exception
    {
        int[] firstArray = {1, 5, 4, 23, 65, 32, 78};
        int[] secondArray = null;
        int[] expectedValue = {1, 5, 4, 23, 65, 32, 78};

        int[] returnedValue = testClass.merge(firstArray, secondArray);
        assertArrayEquals(expectedValue, returnedValue);
    }

    @Test
    public void testMerge_FirstArrayIsMaxValue ()throws Exception
    {
        int[] firstArray = new int[Integer.MAX_VALUE];
        int[] secondArray = {3, 5, 24, 54, 1, 2, 34, 45, 32};
        int[] expectedValue = {3, 5, 24, 54, 1, 2, 34, 45, 32};

        int[] returnedValue = testClass.merge(firstArray, secondArray);
        assertArrayEquals(expectedValue, returnedValue);
    }

    @Test
    public void testMerge_SecondArrayIsMaxValue ()throws Exception
    {
        int[] firstArray = {1, 5, 4, 23, 65, 32, 78};
        int[] secondArray = new int[Integer.MAX_VALUE];
        int[] expectedValue = {1, 5, 4, 23, 65, 32, 78};

        int[] returnedValue = testClass.merge(firstArray, secondArray);
        assertArrayEquals(expectedValue, returnedValue);
    }

    @Test
    public void testMerge_ArrayWithDuplication ()throws Exception
    {
        int[] firstArray = {1, 5, 4, 23, 65, 32, 78, 78, 23};
        int[] secondArray = {3, 5, 24, 54, 1, 2, 34, 45, 32, 3, 24};
        int[] expectedValue = {1, 5, 4, 23, 65, 32, 78, 3, 24, 54, 2, 34, 45};

        int[] returnedValue = testClass.merge(firstArray, secondArray);
        assertArrayEquals(expectedValue, returnedValue);
    }

    //-----------------------------------------------------------------------------------

    // Test function innerUnion ---------------------------------------------------------

    @Test
    public void testInnerUnion_PrimitiveTest ()throws Exception
    {
        int[] firstArray = {1, 5, 4, 23, 65, 32, 78};
        int[] secondArray = {3,5,24,4,1,2,34,45,32,5};
        int[] expectedValue = {1, 5, 4, 32};

        int[] returnedValue = testClass.innerUnion(firstArray, secondArray);
        assertArrayEquals(expectedValue, returnedValue);
    }

    @Test
    public void testInnerUnion_FirstArrayIsEmpty ()throws Exception
    {
        int[] firstArray = new int[0];
        int[] secondArray = {3,5,24,4,1,2,34,45,32,5};
        int[] expectedValue = new int[0];

        int[] returnedValue = testClass.innerUnion(firstArray, secondArray);
        assertArrayEquals(expectedValue, returnedValue);
    }

    @Test
    public void testInnerUnion_SecondArrayIsEmpty ()throws Exception
    {
        int[] firstArray = {1, 5, 4, 23, 65, 32, 78};
        int[] secondArray = new int[0];
        int[] expectedValue = new int[0];

        int[] returnedValue = testClass.innerUnion(firstArray, secondArray);
        assertArrayEquals(expectedValue, returnedValue);

    }

    @Test(expected = NullPointerException.class)
    public void testInnerUnion_FirstArrayIsNull ()throws Exception
    {
        int[] firstArray = null;
        int[] secondArray = {3,5,24,4,1,2,34,45,32,5};
        int[] expectedValue = null;

        int[] returnedValue = testClass.innerUnion(firstArray, secondArray);
        assertArrayEquals(expectedValue, returnedValue);
    }

    @Test(expected = NullPointerException.class)
    public void testInnerUnion_SecondArrayIsNull ()throws Exception
    {
        int[] firstArray = {1, 5, 4, 23, 65, 32, 78};
        int[] secondArray = null;
        int[] expectedValue = null;

        int[] returnedValue = testClass.innerUnion(firstArray, secondArray);
        assertArrayEquals(expectedValue, returnedValue);
    }

    @Test
    public void testInnerUnion_FirstArrayIsMaxValue ()throws Exception
    {
        int[] firstArray = new int[Integer.MAX_VALUE];
        int[] secondArray = {3,5,24,4,1,2,34,45,32,5};
        int[] expectedValue = new int[0];

        int[] returnedValue = testClass.innerUnion(firstArray, secondArray);
        assertArrayEquals(expectedValue, returnedValue);
    }

    @Test
    public void testInnerUnion_SecondArrayIsMaxValue ()throws Exception
    {
        int[] firstArray = {1, 5, 4, 23, 65, 32, 78};
        int[] secondArray = new int[Integer.MAX_VALUE];
        int[] expectedValue = new int[0];

        int[] returnedValue = testClass.innerUnion(firstArray, secondArray);
        assertArrayEquals(expectedValue, returnedValue);
    }

    @Test
    public void testInnerUnion_ArrayWithDuplication ()throws Exception
    {
        int[] firstArray = {1, 5, 4, 23, 65, 32, 78, 78, 23};
        int[] secondArray = {3,5,24,4,1,2,34,45,32,5,3,5,32};
        int[] expectedValue = {1, 5, 4, 32};

        int[] returnedValue = testClass.innerUnion(firstArray, secondArray);
        assertArrayEquals(expectedValue, returnedValue);
    }

    //-----------------------------------------------------------------------------------

    // Test function outerUnion ---------------------------------------------------------

    @Test
    public void testOuterUnion_PrimitiveTest ()throws Exception
    {
        int[] firstArray = {1, 5, 4, 23, 65, 32, 78};
        int[] secondArray = {3,5,24,4,1,2,34,45,32,5};
        int[] expectedValue = {23,65,78,3,24,2,34,45};

        int[] returnedValue = testClass.merge(firstArray, secondArray);
        assertArrayEquals(expectedValue, returnedValue);
    }

    @Test
    public void testOuterUnion_FirstArrayIsEmpty ()throws Exception
    {
        int[] firstArray = new int[0];
        int[] secondArray = {3,5,24,4,1,2,34,45,32,5};
        int[] expectedValue = {3,5,24,4,1,2,34,45,32,5};

        int[] returnedValue = testClass.merge(firstArray, secondArray);
        assertArrayEquals(expectedValue, returnedValue);
    }

    @Test
    public void testOuterUnion_SecondArrayIsEmpty ()throws Exception
    {
        int[] firstArray = {1, 5, 4, 23, 65, 32, 78};
        int[] secondArray = new int[0];
        int[] expectedValue = {1, 5, 4, 23, 65, 32, 78};

        int[] returnedValue = testClass.merge(firstArray, secondArray);
        assertArrayEquals(expectedValue, returnedValue);

    }

    @Test(expected = NullPointerException.class)
    public void testOuterUnion_FirstArrayIsNull ()throws Exception
    {
        int[] firstArray = null;
        int[] secondArray = {3,5,24,4,1,2,34,45,32,5};
        int[] expectedValue = {3,5,24,4,1,2,34,45,32,5};

        int[] returnedValue = testClass.merge(firstArray, secondArray);
        assertArrayEquals(expectedValue, returnedValue);
    }

    @Test(expected = NullPointerException.class)
    public void testOuterUnion_SecondArrayIsNull ()throws Exception
    {
        int[] firstArray = {1, 5, 4, 23, 65, 32, 78};
        int[] secondArray = null;
        int[] expectedValue = {1, 5, 4, 23, 65, 32, 78};

        int[] returnedValue = testClass.merge(firstArray, secondArray);
        assertArrayEquals(expectedValue, returnedValue);
    }

    @Test
    public void testOuterUnion_FirstArrayIsMaxValue ()throws Exception
    {
        int[] firstArray = new int[Integer.MAX_VALUE];
        int[] secondArray = {3,5,24,4,1,2,34,45,32,5};
        int[] expectedValue = {3,5,24,4,1,2,34,45,32,5};

        int[] returnedValue = testClass.merge(firstArray, secondArray);
        assertArrayEquals(expectedValue, returnedValue);
    }

    @Test
    public void testOuterUnion_SecondArrayIsMaxValue ()throws Exception
    {
        int[] firstArray = {1, 5, 4, 23, 65, 32, 78};
        int[] secondArray = new int[Integer.MAX_VALUE];
        int[] expectedValue = {1, 5, 4, 23, 65, 32, 78};

        int[] returnedValue = testClass.merge(firstArray, secondArray);
        assertArrayEquals(expectedValue, returnedValue);
    }

    @Test
    public void testOuterUnion_ArrayWithDuplication ()throws Exception
    {
        int[] firstArray = {1, 5, 4, 23, 65, 32, 78, 78, 23};
        int[] secondArray = {3, 5, 24, 54, 1, 2, 34, 45, 32, 3, 24};
        int[] expectedValue = {4, 65, 54, 2, 34, 45};

        int[] returnedValue = testClass.merge(firstArray, secondArray);
        assertArrayEquals(expectedValue, returnedValue);
    }

    //-----------------------------------------------------------------------------------
}
