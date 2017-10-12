package com.zhang.link;

/**
 * 链表节点的定义
 */
public class Link {
    //数据
    private long data;
    //指向下一个节点的指针
    private Link next;

    public Link(long data){
        this.data=data;
    }

    public long getData() {
        return data;
    }

    public void setData(long data) {
        this.data = data;
    }

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Link{" +
                "data=" + data +
                '}';
    }
}
