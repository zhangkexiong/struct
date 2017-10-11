package com.zhang.statck;

public class MyStack {
    //表示栈的最大的容量
    private int maxSize;
    //表示栈的存储的数据类型
    private long data[];
    //表示栈顶的元素
    private int top;

    /**
     * 表示创建栈时候的容量(自己设置)
     * top=-1表示栈内没有元素
     * @param size
     */
    public MyStack(int size){
        maxSize=size;
        data=new long[maxSize];
        top=-1;
    }

    /**
     * 压栈操作
     * 1. 先将栈顶的指针上移一位
     * 2. 然后插入数据
     * @param value
     */
    public void push(long value){
        data[++top]=value;
    }

    /**
     * 弹栈操作
     * 只需要将栈顶的指针下移一位
     * 并不是真正的出栈,只是将栈顶的指针位置发生了变化
     */
    public long pop(){
        return data[top--];
    }

    /**
     * 访问栈顶元素
     * @return
     */
    public long peek(){
        return data[top];
    }

    /**
     * 判断是否为空
     * @return
     */
    public boolean isEmpty(){
        return (top==-1);
    }

    /**
     * 判断是否满了
     * @return
     */
    public boolean isFull(){
        return (top==maxSize-1);
    }





}
