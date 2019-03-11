package com.stringtest;

import java.util.Scanner;

public class StringDemo5 {
	

    public static void main(String[] args)
    {
    	   char str3='A';
    	   char str4='a';
    	   System.out.println((int)str3);//65
    	   System.out.println((int)str4);//97
    	   
	    
    	    String str="A";
    	    String str1="a";
    	    System.out.println("str="+str);
    	    System.out.println("str1="+str1);
    	    //str的值小于str1结果为负值
    	    System.out.println("str.compareTo(str1)的结果是："+str.compareTo(str1));
    	   //str1的值大于str1结果为正值
    	    System.out.println("str1.compareTo(str)的结果是："+str1.compareTo(str));
    	    System.out.println("str1.compareTo('a')的结果是："+str1.compareTo("a"));
    	   
           
//        String sys="学生信息管理";
//        System.out.println("欢迎进入《"+sys+"》系统");
//        System.out.println("请设置一个管理员密码：");
//        Scanner input=new Scanner(System.in);
//        String pass=input.next();    //设置密码，并返回
//        System.out.println("重复管理员密码：");
//        input=new Scanner(System.in);
//        String pass1=input.next();    //确认密码，并返回
//        if(pass.equals(pass1))
//        {   //比较两个密码
//            System.out.println("已生效，请牢记密码："+ pass);
//        }
//        else
//        {
//            System.out.println("两次密码不一致，请重新设置。");
//        }
    }

}
