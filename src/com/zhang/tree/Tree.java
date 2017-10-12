package com.zhang.tree;

public class Tree {
    //根节点
    private Node root;

    //插入方法
    public void insert(int keyData,int otherDate){
        Node newNode=new Node(keyData,otherDate);
        //如果是一个空树
        if (root==null){
            root=newNode;
        }
        //否则的就从树的根节点遍历树,然后根据传入的值来判断该节点存放的位置
        else {
            Node current=root;
            Node parent;
            while (true){
                parent=current;
                if (keyData<parent.getKeyData()){
                    //说明遍历的是左子树
                    current=current.getLeftNode();
                    if (current==null){
                        parent.setLeftNode(newNode);
                        return;
                    }
                }else{
                    current=current.getRightNode();
                    if (current==null){
                        parent.setRightNode(newNode);
                        return;
                    }
                }
            }
        }
    }

    /**
     * 查找节点
     * @param keyData
     * @return
     */
    public Node find(int keyData){
        Node current=root;
        while (current.getKeyData()!=keyData){
            if (keyData<current.getKeyData()){
                current=current.getLeftNode();
            }else {
                current=current.getRightNode();
            }
            if (current==null){
                return null;
            }
        }
        return current;
    }

    /**
     * 修改树中的某个节点
     * @param keyData
     * @param newOtherData
     */
    public void change(int keyData,int newOtherData){
        Node findNode=find(keyData);
        findNode.setOtherData(newOtherData);
    }

    /**
     * 先序遍历(使用递归算法实现)
     * @param node
     */
    public void preOrder(Node node){
        if (node!=null){
            node.display();
            preOrder(node.getLeftNode());
            preOrder(node.getRightNode());
        }

    }

    /**
     * 中序遍历
     * @param node
     */
    public void inOrder(Node node){
        if (node!=null){
            inOrder(node.getLeftNode());
            node.display();
            inOrder(node.getRightNode());
        }
    }

    /**
     * 后序遍历
     * @param node
     */
    public void endOrder(Node node){
        if (node!=null){
            endOrder(node.getLeftNode());
            endOrder(node.getRightNode());
            node.display();
        }
    }
    public Node getRoot(){
        return root;
    }
}
