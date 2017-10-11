package com.zhang.sort;


public class ObjectSort {

    public static void main(String args[]){
        MyArray myArray=new MyArray();
        UserUtils userUtils=new UserUtils(2,"b张三");
        UserUtils userUtils1=new UserUtils(1,"c李四");
        UserUtils userUtils2=new UserUtils(3,"a王五");
        myArray.insert(userUtils);
        myArray.insert(userUtils1);
        myArray.insert(userUtils2);
        myArray.objectSort();
        myArray.objectSortByString();
        myArray.display();
    }




}
