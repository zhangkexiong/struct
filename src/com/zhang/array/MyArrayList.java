package com.zhang.array;

/**
 * 自定义的arrayList
 */
public class MyArrayList {
    //数组用来存放数据
    private long []data;

    //数组中有效数据的大小
    private int elems;

    //默认的构造函数(长度为50)
    public MyArrayList(){
        data=new long[50];
    }
    //设置顺序表的长度
    public MyArrayList(int max){
        data=new long[max];
    }

    /**
     * 插入数据
     * @param value
     */
    public void insert(long value){
        data[elems]=value;
        elems++;
    }

    /**
     * 显示数据
     */
    public void display(){
        for (int i=0;i<elems;i++){
            System.out.println(data[i]);
        }
    }

    /**
     * 查询指定的数据
     * @param value
     * @return
     */
    public int find(long value){
        int i;
        for (i=0;i<elems;i++){
            if (data[i]==value) {
                break;
            }
        }
        if (i==data.length){
            return -1;
        }
        else {
            return i;
        }
    }

    /**
     * 删除指定的元素
     * @param deleteKey
     */
    public void delete(long deleteKey){
        if (find(deleteKey)==-1){
            System.out.println("找不到指定的元素,无法删除..");
        }
        else {
            //将被要删除的元素的后面元素都像前移动一位
            for (int i=find(deleteKey);i<elems;i++){
                data[i]=data[i+1];
            }
            elems--;
        }
    }

    /**
     * 修改数据
     * @param oldValue
     * @param newValue
     */
    public void change(long oldValue,long newValue){
        if(find(oldValue)==-1){
            System.out.println("查找不到指定的数据,修改失败");
        }else {
            data[find(oldValue)]=newValue;
        }
    }
    public static void main(String args[]){
        MyArrayList myArrayList=new MyArrayList();
        myArrayList.insert(2);
        myArrayList.insert(3);
        myArrayList.insert(5);
        myArrayList.delete(2);
        System.out.println(myArrayList.elems);
        System.out.println("------------");
        myArrayList.display();
    }

}
