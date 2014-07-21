package com.dio.hw.lesson04;

/**
 * Created by Андрей on 27.06.2014.
 */
public class Test01 {
    static int doTest() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            if (i == 3) {
                throw new Exception();
            }
        }
        //local code review (vtegza): what '-10' stand for? @ 21.07.14
        return -10;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("doTest() = " + doTest());
    }
}
