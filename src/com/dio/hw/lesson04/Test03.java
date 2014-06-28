package com.dio.hw.lesson04;

/**
 * Created by Андрей on 28.06.2014.
 */
public class Test03 {
    static int doTest(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("i = " + i);
            try {
                if (i % 3 == 0) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Exception!");
                return i;
            } finally {
                System.out.println("Finally block");
                if (i % 3 == 0) {
                    if (i < 5) {
                        System.out.println("Cancel exception, please");
                        continue;
                    } else {
                        System.out.println("OK, now everything is done");
                        return 42;
                    }
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("doTest(2) = " + doTest(2));
        System.out.println();
        System.out.println("doTest(10) = " + doTest(10));
    }
}
