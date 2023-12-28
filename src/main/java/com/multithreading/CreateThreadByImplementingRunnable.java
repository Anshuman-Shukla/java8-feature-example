package com.multithreading;

public class CreateThreadByImplementingRunnable implements Runnable{
    @Override
    public void run() {
        for(int i =0; i<5;i++){
            System.out.println("Printing from thread:"+i+"  "+Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }

    }
}
