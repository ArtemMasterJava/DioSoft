package com.dio.cw.lesson03;

/**
 * Created by Андрей on 24.06.2014.
 */
public class ArrayHelperImple implements ClassHelper
{
    public int[] leftArray;
    public int[] rightArray;

    public int[] leftUnion(int[] leftArray, int[] rightArray)
    {
        int[] res = new int[leftArray.length + rightArray.length];
        //local code review (vtegza): replace with arrayCopy @ 21.07.14
        for(int i = 0;i < leftArray.length;i++)
        {
            res[i] = leftArray[i];
        }

        int count = leftArray.length;
        //local code review (vtegza): use foreach @ 21.07.14
        for(int j=0;j < rightArray.length;j++)
        {
            for (int i=0;i<leftArray.length;i++)
            {
                if (leftArray[i] == rightArray[j])
                {
                    res[count]=rightArray[j];
                    count++;
                }

            }
        }

        int[] finalResult=new int[count];
        //local code review (vtegza): replace with arrayCopy @ 21.07.14
        for(int i=0;i<finalResult.length;i++)
        {
            finalResult[i]=res[i];
        }
        return finalResult;
    }

}
