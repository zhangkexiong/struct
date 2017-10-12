package com.zhang.tree;

/**
 * 定义节点的数据类型
 */
public class Node {
    //g关键字
    private int keyData;
    //其他的数据
    private int otherData;
    //左节点
    private Node leftNode;
    //右节点
    private Node rightNode;
    //初始化节点的时候
    public Node(int keyData,int otherData){
        this.keyData=keyData;
        this.otherData=otherData;
    }

    public int getKeyData() {
        return keyData;
    }

    public void setKeyData(int keyData) {
        this.keyData = keyData;
    }

    public int getOtherData() {
        return otherData;
    }

    public void setOtherData(int otherData) {
        this.otherData = otherData;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }
    public void display(){
        System.out.println(keyData+", "+otherData);
    }
}
