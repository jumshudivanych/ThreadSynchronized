package com.sandbox50572;

public class BlockedMethodCaller extends Thread {

    int k;

    public BlockedMethodCaller(int k) throws InterruptedException {
        this.k = k;
        com.sandbox50572.App.f(k);
    }
}
