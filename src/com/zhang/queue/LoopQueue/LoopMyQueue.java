package com.zhang.queue.LoopQueue;

/**
 * 非循环队列的实现
 */
public class LoopMyQueue {
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
    public LoopMyQueue(int maxSize){
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
        if (end==maxSize-1){
            end=-1;
        }
        date[++end]=value;
        eleme++;
    }

    /**
     * 移除操作
     * @return
     */
    public long remove(){
        long temp=date[front++];
        if (front==maxSize){
            front=0;
        }
        eleme--;
        return temp;
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
        return (eleme>=maxSize);
    }

    /**
     * 返回有效数据元素个数
     * @return
     */
    public int size(){
        return eleme;
    }

    public static void main(String args[]){
        LoopMyQueue loopMyQueue=new LoopMyQueue(2);
        loopMyQueue.insert(1L);
        loopMyQueue.insert(2L);
        loopMyQueue.insert(3L);
        System.out.println(loopMyQueue.isFull());
        while (!loopMyQueue.isEmpty()){
            System.out.println(loopMyQueue.remove());
        }
        System.out.println(loopMyQueue.remove());

    }


}
