package com.zhang.statck.application;

/**
 * 栈的应用倒序排列
 */
public class Reverse {
   private String input;
   public Reverse(String input){
       this.input=input;
   }

    /**
     * 1. 先将传入的input压栈
     * 2. 然后再出栈
     * 3. 将char[]转换成string
     * @return
     */
   public String doReverse(){
       MyApplicationStack myApplicationStack=new MyApplicationStack(50);
       for (int i=0;i<input.length();i++){
           char ch=input.charAt(i);
           myApplicationStack.push(ch);
       }
       String output="";
       while (!myApplicationStack.isEmpty()){
           char ou=myApplicationStack.pop();
           output+=ou;
       }
       return output;
   }
   public static void main(String args[]){
       Reverse reverse=new Reverse("张可熊");
       System.out.println(reverse.doReverse());
   }
}
