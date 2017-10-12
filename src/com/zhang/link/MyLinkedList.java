package com.zhang.link;

/**
 * 自定义的链表
 */
public class MyLinkedList {
     private Link first;

    /**
     * 表示插入节点
     * @param data
     */
     public void insert(long data){
         Link link=new Link(data);
         if (first==null){
             first=link;
         }
         else
         {
             link.setNext(first);
             first=link;
         }
     }

    /**
     * 查找所用的节点
     */
    public void displayAll() {
        Link current = first;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
    }

    /**
     * 查找某一个节点
     * @param key
     */
    public Link find(long key){
        Link current=first;
        while (current.getData()!=key){
            if (current.getNext()==null){
                return null;
            }
            current=current.getNext();
        }
        return current;
    }

    /**
     * 插入到指定的位置
     * @param value
     * @param pos
     */
    public void insert(long value,int pos){
        Link link=new Link(value);
        if (pos==0){
            insert(value);
        }
        else{
            Link current=first;
            for (int i=0;i<pos-1;i++){
                current=current.getNext();
            }
            link.setNext(current.getNext());
            current.setNext(link);
        }
    }

    /**
     * 删除指定的节点
     * @param key
     */
    public void delete(long key){
        Link current=first;
        Link ago=first;
        //先找到需要删除的元素
        while (current.getData()!=key){
            if (current==null){
                return;
            }else {
                ago=current;
                current = current.getNext();
            }
        }
        if (current==first){
            first=first.getNext();
        }else {
            ago.setNext(current.getNext());
        }
    }

    /**
     * 测试方法
     * @param args
     */
    public static void main(String args[]){
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.insert(1l);
        myLinkedList.insert(2l);
        myLinkedList.insert(3l);
        myLinkedList.displayAll();
        System.out.println("----------");
        myLinkedList.insert(4,1);
        myLinkedList.delete(3);
        myLinkedList.displayAll();
    }

}
