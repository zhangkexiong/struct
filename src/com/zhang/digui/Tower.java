package com.zhang.digui;

/**
 * 经典问题:汉诺塔问题
 * 比较重要
 * 古代有一个梵塔，塔内有三个座A、B、C，A座上有64个盘子，盘子大小不等，
 * 大的在下，小的在上（如图）。
 * 有一个和尚想把这64个盘子从A座移到B座，但每次只能允许移动一个盘子，
 * 并且在移动过程中，3个座上的盘子始终保持大盘在下，小盘在上。在移动过程中可以利用B座，
 * 要求打印移动的步骤。如果只有一个盘子，则不需要利用B座，直接将盘子从A移动到C
 */
public class Tower {

    /**
     * 算法的主要思路是
     * 将A上面的盘子分成两个部分,最大的盘子和其他的小盘子
     */
    public static void tower(int n,char a,char b,char c){
        if (n!=0){
            tower(n-1,a,c,b);
            System.out.println(a+"-->"+c);
            tower(n-1,b,a,c);
        }
    }

    /**
     * 移动的说明
     * @param n
     * @param from
     * @param to
     */
    public static void move(int n,char from,char to){
        System.out.println("第"+n+"步:将"+from+"上的盘子移动到------->"+to+"上");
    }

    /**
     * 递归实现
     * @param n
     * @param startPos
     * @param tranPos
     * @param endPos
     */
    public static void HaNio(int n,char startPos,char tranPos,char endPos){
        if (n==1){
            move(n,startPos,endPos);
        }
        else{
            HaNio(n-1,startPos,endPos,tranPos);//先将前a上的个盘子当做整体放到b上
            move(n,startPos,endPos);              //将a上的最后一个盘子移动到c上
            HaNio(n-1,tranPos,startPos,endPos);//在将b上面的盘子通过a移动到c上
        }

    }

    public static void main(String args[]){
        char a='a';
        char b='b';
        char c='c';
        //tower(3,a,b,c);
        HaNio(3,a,b,c);
    }

}
