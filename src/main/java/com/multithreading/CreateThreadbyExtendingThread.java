package com.multithreading;

public class CreateThreadbyExtendingThread extends Thread{

    public void run() {
        // Code that will be executed in a separate thread
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getId() + " Value " + i);
        }
    }
}
