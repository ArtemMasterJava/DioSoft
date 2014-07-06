package com.dio.hw.lesson04;

/**
 * Created by Андрей on 29.06.2014.
 */
public interface ArrayHelper
{
    int[] merge(int[] leftArray, int[] rightArray);

    int[] innerUnion(int[] leftArray, int[] rightArray);

    int[] outerUnion(int[] leftArray, int[] rightArray);
}
