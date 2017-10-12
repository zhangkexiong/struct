package com.zhang.queue;

/**
 * 非循环队列的实现
 */
public class MyQueue {
    //存储的数据
    private long date[];
    //定义尾部指针
    private int end;
    //定义头部指针
    private int front;
    //定义队列的大小
    private int maxSize;
    //定义数组中元素的个数
    private int eleme;

    /**
     * 初始化队列
     * @param maxSize
     */
    public MyQueue(int maxSize){
        date=new long[maxSize];
        this.maxSize=maxSize;
        end=-1;
        front=0;
    }

    /**
     * 插入操作
     * @param value
     */
    public void insert(long value){
        date[++end]=value;
        eleme++;
    }

    /**
     * 移除操作
     * @return
     */
    public long remove(){
        eleme--;
        return date[front++];
    }

    /**
     * 判断是否为空
     * @return
     */
    public boolean isEmpty(){
        return (eleme==0);
    }

    /**
     * 判断是否满了
     * @return
     */
    public boolean isFull(){
        return (end==maxSize-1);
    }

    /**
     * 返回有效数据元素个数
     * @return
     */
    public int size(){
        return eleme;
    }


}
