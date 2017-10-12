package com.zhang.digui;

public class TestDiGui {

    public static void test(int i){
        if (i<5){
            System.out.println("Hello word "+i);
            test(++i);
            System.out.println("Hello java "+i);
        }
    }
    public static void main(String args[]){
        test(0);
    }
}
