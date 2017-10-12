package com.zhang.digui;

/**
 * 三角关系的递归实现
 */
public class TestSanJiao {
    public static void main(String args[]){
     System.out.println(sanjiao(4));
     System.out.println(sanjiaoDiGui(7));
    }

    /**
     * 求前n个数的和
     * @param n
     * @return
     */
    public static int sanjiao(int n){
        int total=0;
        while (n>0){
            total=total+n;
            n--;
        }
        return total;
    }

    /**
     * 递归实现前n个数的和
     * @param n
     * @return
     */
    public static int sanjiaoDiGui(int n){
        if (n==1){
            return 1;
        }
        else {
            return n+sanjiaoDiGui(--n);
        }
    }


}
