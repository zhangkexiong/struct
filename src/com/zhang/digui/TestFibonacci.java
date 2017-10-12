package com.zhang.digui;

/**
 * Finbonacci数列的递归实现
 */
public class TestFibonacci {

    public static void main(String args[]){
        System.out.println(fibonacci(5));
    }

    public static int fibonacci(int n){
        if (n==1||n==2){
            return 1;
        }
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }
}
