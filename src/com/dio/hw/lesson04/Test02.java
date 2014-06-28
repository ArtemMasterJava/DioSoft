package com.dio.hw.lesson04;

/**
 * Created by Андрей on 27.06.2014.
 */
public class Test02 {
    static int doTest() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            try {
                if (i == 3) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Exception!");
                return i;
            } finally {
                System.out.println("Finally block");
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("doTest() = " + doTest());
    }
}