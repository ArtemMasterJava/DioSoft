package com.dio.hw.lesson04;

import java.util.Arrays;

/**
 * Created by Андрей on 29.06.2014.
 */
public class Main
{
    public  static void main(String[] args)
    {

        int[] A={1, 5, 4, 23, 65, 32, 78, 78, 23};
        //int[] B={3, 5, 24, 54, 1, 2, 34, 45, 32, 3, 24};
        int[] B=new int[0];

        ArrayHelperImp someArray = new ArrayHelperImp();
        int [] result=someArray.outerUnion(A,B);

        System.out.println(Arrays.toString(result));
//
        int[] testArray = {23,65,78,3,24,2,34,45};

        //System.out.println(testArray.equals(result));
        System.out.println(Arrays.equals(result,testArray));
    }
}
