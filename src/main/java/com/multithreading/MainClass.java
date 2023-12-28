package com.multithreading;

public class MainClass {
    public static void main(String[] args) {
        Thread thread = new Thread(new CreateThreadByImplementingRunnable());
        thread.start();

        CreateThreadbyExtendingThread mythread = new CreateThreadbyExtendingThread();
        mythread.run();

        Thread lambdathread= new Thread(()->{
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getId() + " Lambda Thread " + i);
            }
        });
        lambdathread.start();
    }
}
