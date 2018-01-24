package com.sandbox50572;

/**
 * создание пяти потоков в цикле
 * и вызов ими синхронизированного метода
 */
public class App 
{
    public static void main(String[] args ) throws InterruptedException
    {
        //App ref = new App();

        //создание пяти потоков

        for(int k=0; k<5; k++) {
            new Thread(new BlockedMethodCaller(k)).start();
        }


    }

    public static void f(int x) throws InterruptedException {
        System.out.println("Зашел в синхронизированный метод поток " + x);
        Thread.sleep(1000);
        System.out.println("Вышел из метода поток " + x);
    }
}
