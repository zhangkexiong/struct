package com.zhang.queue;

public class TestQueue {
    public static void main(String args[]){
        MyQueue myQueue=new MyQueue(5);
        myQueue.insert(1L);
        myQueue.insert(2L);
        myQueue.insert(3L);
        myQueue.insert(4L);
        myQueue.insert(5L);
        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.isFull());
        while (!myQueue.isEmpty()){
            System.out.println(myQueue.remove());
        }
    }
}
