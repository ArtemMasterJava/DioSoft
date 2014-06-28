package com.dio.hw.lesson04;

/**
 * Created by Андрей on 28.06.2014.
 */
import java.util.concurrent.*;
public class Test04 implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread() + ": " + i);
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted!");
        } finally {
            System.out.println("I'm in the finally block!");
        }
    }
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new Test04());
        t.start();
        TimeUnit.SECONDS.sleep(5);
        System.out.println("main() finished");
    }
}