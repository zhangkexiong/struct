package com.zhang.sort;

public class MyArray {
    private UserUtils[] attr;
    private int elems;

    /**
     * 默认的数组的大小为50
     */
    public MyArray(){
        attr=new UserUtils[50];
    }

    /**
     * 可以根据需求来修改数组的大小
     * @param max
     */
    public MyArray(int max){
        attr=new UserUtils[max];
    }

    /**
     * 插入数据
     * @param userUtils
     */
    public void insert(UserUtils userUtils){
        attr[elems]=userUtils;
        elems++;
    }
    /**
     * 显示数据
     */
    public void display(){
        for (int i=0;i<elems;i++){
            System.out.println("id: "+attr[i].getId()+", username: "+attr[i].getUsername());
        }
    }

    public void objectSort(){
        for (int i=0;i<elems-1;i++){
            for (int j=0;j<elems-i-1;j++){
                if (attr[j].getId()>attr[j+1].getId()){
                    /**
                     * 如果前面的数字比后面的大
                     * 交换位置
                     */
                    UserUtils temp;
                    temp=attr[j];
                    attr[j]=attr[j+1];
                    attr[j+1]=temp;
                }
            }
        }
    }
    public void objectSortByString(){
        for (int i=0;i<elems-1;i++){
            for (int j=0;j<elems-i-1;j++){
                if (attr[j].getUsername().compareTo(attr[j+1].getUsername())>0){
                    /**
                     * 如果前面的数字比后面的大
                     * 交换位置
                     */
                    UserUtils temp;
                    temp=attr[j];
                    attr[j]=attr[j+1];
                    attr[j+1]=temp;
                }
            }
        }
    }


}
