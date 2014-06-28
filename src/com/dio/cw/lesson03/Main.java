package com.dio.cw.lesson03;

import java.util.Arrays;

/**
 * Created by Андрей on 24.06.2014.
 */
public class Main
{
    public  static void main(String[] args)
    {

        int[] A={1,5,4,23,65,32,78};
        int[] B={3,5,24,4,1,2,34,45,32,5};

        ClassHelper someArray = new ArrayHelperImple();
        int [] result=someArray.leftUnion(A,B);

        System.out.println(Arrays.toString(result));

        int[] testArray = {1, 5, 4, 23, 65, 32, 78, 5, 4, 1, 32, 5};

        System.out.println(testArray.equals(result));
        System.out.println(Arrays.equals(result,testArray));


    }
}
