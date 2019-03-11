package com.stringtest;

import java.util.Scanner;

public class StringBufferDemo {
	public static void main(String[] args) {
		//定义一个空的字符串缓冲区，含有16个字符的容量
		StringBuffer str1=new StringBuffer();
		//定义一个含有10个字符容量的字符串缓冲区
		StringBuffer str2=new StringBuffer(10);
		//定义一个含有(16+4)的字符串缓冲区，"青春无悔"为4个字符
		StringBuffer str3=new StringBuffer("青春无悔");
		/*
		*输出字符串的容量大小
		*capacity()方法返回字符串的容量大小
		*/
		System.out.println(str1.capacity());    //输出 16
		System.out.println(str2.capacity());    //输出 10
		System.out.println(str3.capacity());    //输出 20
		
		
		//追加字符串
		System.out.println("=================2"); 
		StringBuffer buffer=new StringBuffer("hello,");    //创建一个 StringBuffer 对象
		System.out.println(java.lang.System.identityHashCode(buffer));//2018699554
		
		String str="World!";
		buffer.append(str);    //向 StringBuffer 对象追加 str 字符串
		System.out.println(buffer.substring(0));    //输出：Hello,World!
		System.out.println(java.lang.System.identityHashCode(buffer));//2018699554
		
		System.out.println("=================3"); 
		StringBuffer sys=new StringBuffer("校内课程管理");
        System.out.println("欢迎进入《"+sys+"》系统");
        //声明课程名称字符串
        StringBuffer courseName=new StringBuffer();
        System.out.println("请录入本期的五门必修课名称：");
        Scanner input=new Scanner(System.in);//定义一个 Scanner对象
        //循环接收控制台输入的字符串
        String name="";
        for(int i=0;i<5;i++)
        {
            name=input.next();//设置并获取键盘键盘录入的值
            courseName.append(name+"\t");
            if(i==4)
            {
                System.out.println("录入完毕!");
            }
        }
        System.out.println("本学期的必修课程有：\n"+courseName);
	}
}
