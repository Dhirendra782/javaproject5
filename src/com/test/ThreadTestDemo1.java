package com.test;

public class ThreadTestDemo1 {
    public static void main(String [] args){

        ThreadDemo1 threadDemo1 = new ThreadDemo1();
        Thread th = new Thread(threadDemo1);
        th.start();

    }

}
