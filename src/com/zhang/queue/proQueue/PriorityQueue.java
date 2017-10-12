package com.zhang.queue.proQueue;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * 优先级队列
 */
public class PriorityQueue {
    //存储的数据
    private long date[];
    //定义队列的大小
    private int maxSize;
    //定义数组中元素的个数
    private int eleme;

    /**
     * 初始化队列
     * @param maxSize
     */
    public PriorityQueue(int maxSize){
        date=new long[maxSize];
        this.maxSize=maxSize;
    }

    /**
     * 插入操作(使用的是插入算法)
     * @param value
     */
    public void insert(long value){
           /* int i;
            for (i=0;i<eleme;i++){
                if (value>date[i]){
                    break;
                }
            }*/
            int j=eleme;
            while (j>0&&value<date[j-1]){
                date[j]=date[j-1];
                j--;
            }
            date[j]=value;
        eleme++;
    }

    /**
     * 移除操作
     * @return
     */
    public long remove(){
        long temp=date[eleme-1];
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
        PriorityQueue priorityQueue=new PriorityQueue(5);
        priorityQueue.insert(2L);
        priorityQueue.insert(3L);
        priorityQueue.insert(4L);
        priorityQueue.insert(1L);
        priorityQueue.insert(5L);
        System.out.println(priorityQueue.isFull());
        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.remove());
        }
    }
}
