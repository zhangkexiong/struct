package com.zhang.statck;

public class TestMyStack {
    public static void main(String args[]){
        MyStack myStack=new MyStack(20);
        myStack.push(1L);
        myStack.push(2L);
        myStack.push(3L);
        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }
    }
}
