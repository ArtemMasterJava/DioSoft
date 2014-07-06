package com.dio.cw.lesson05;

/**
 * Created by Андрей on 01.07.2014.
 */
public class PersonArrayHelperImp implements PersonArrayHelper
{
    public Person[] merge(Person leftArray[], Person rightArray[])
    {
        Person[] res = new Person[leftArray.length + rightArray.length];
        for(int i = 0;i < leftArray.length;i++)
        {
            res[i] = leftArray[i];
        }

        for(int i = leftArray.length; i < res.length;i++)
        {
            res[i] = rightArray[i-leftArray.length];
        }

        Person[] finalResult= uniqueNumber(res);

        return finalResult;
    }

    private Person[] uniqueNumber(Person[] array)
    {
        Person[] res = new Person[array.length];
        int countResEl=0;

        for (Person anArray : array) {
            int countDuplication = 0;
            for (Person re : res) {
                if (anArray.equals(re)) {
                    countDuplication++;
                    break;
                }
            }
            if (countDuplication == 0) {
                res[countResEl] = anArray;
                countResEl++;
            }
        }

        Person[] finalResult=new Person[countResEl];
        for(int i=0;i<finalResult.length;i++)
        {
            finalResult[i]=res[i];
        }
        return finalResult;
    }
}
