package com.dio.hw.lesson04;

/**
 * Created by Андрей on 29.06.2014.
 */
public class ArrayHelperImp implements ArrayHelper
{
    public int[] merge(int[] leftArray, int[] rightArray)
    {
        int[] res = new int[leftArray.length + rightArray.length];
        for(int i = 0;i < leftArray.length;i++)
        {
            res[i] = leftArray[i];
        }

        for(int i = leftArray.length; i < res.length;i++)
        {
            res[i] = rightArray[i-leftArray.length];
        }

        int[] finalResult= uniqueNumber(res);

        return finalResult;
    }

    public int[] innerUnion(int[] leftArray, int[] rightArray)
    {
        int[] res = new int[leftArray.length+rightArray.length];
        int count=0;

        for(int i = 0; i<leftArray.length; i++)
        {
            for(int j = 0; j<rightArray.length; j++)
            {
                if(leftArray[i] == rightArray[j])
                {
                    res[count]=leftArray[i];
                    count++;
                }
            }
        }

        int[] finalResult = new int[count];
        for (int i = 0; i < count; i++)
        {
            finalResult[i]=res[i];
        }
        finalResult= uniqueNumber(finalResult);
        return finalResult;
    }

    public int[] outerUnion(int[] leftArray, int[] rightArray)
    {
        int[] res = new int[leftArray.length + rightArray.length];
        for(int i = 0;i < leftArray.length;i++)
        {
            res[i] = leftArray[i];
        }

        for(int i = leftArray.length; i < res.length;i++)
        {
            res[i] = rightArray[i-leftArray.length];
        }

        int[] res1 = new int[res.length];

        int countEl=0;
        for (int i = 0; i < res.length; i++)
        {
            int countDuplication=0;
            for (int j = 0; j < res.length; j++)
            {
                if(res[i] == res[j] && i!=j)
                    countDuplication++;
            }
            if(countDuplication==0)
            {
                res1[countEl]=res[i];
                countEl++;
            }
        }

        int[] finalResult=new int[countEl];
        for (int i = 0; i < countEl; i++)
        {
            finalResult[i]=res1[i];
        }
        return finalResult;
    }

    private int[] uniqueNumber(int[] array)
    {
        int[] res = new int[array.length];
        int countResEl=0;

        for(int i = 0; i < array.length; i++)
        {
            int countDuplication=0;
            for(int j = 0; j < res.length; j++)
            {
                if(array[i] == res[j])
                {
                    countDuplication++;
                    break;
                }
            }
            if(countDuplication==0)
            {
                res[countResEl]=array[i];
                countResEl++;
            }
        }

        int[] finalResult=new int[countResEl];
        for(int i=0;i<finalResult.length;i++)
        {
            finalResult[i]=res[i];
        }
        return finalResult;
    }
}
