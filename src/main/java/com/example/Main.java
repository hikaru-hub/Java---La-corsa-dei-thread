package com.example;

public class Main {
    public static void main(String[] args) {
        
        Corridore c1 = new Corridore("nini");
        Corridore c2 = new Corridore("cri");

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println("errore");
        }

        System.out.println("LA GARA È TERMINATA");
    }
}