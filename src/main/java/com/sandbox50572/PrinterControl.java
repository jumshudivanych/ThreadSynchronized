package com.sandbox50572;

public class PrinterControl implements Runnable{
int k;


    public PrinterControl()  {
        this.k = k;
    }

    public void run() {
        try {
            f(k);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void f(int x) throws InterruptedException {
        System.out.println("+" + x);
        Thread.sleep(1000);
        System.out.println("-" + x);
    }
}
