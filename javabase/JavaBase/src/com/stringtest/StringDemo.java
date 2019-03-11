package com.stringtest;
import java.util.Scanner;
public class StringDemo {
	public static void main(String[] args) {
		int[] no=new int[]{501,101,204,102,334};    //定义学号数组
	    String[] names=new String[]{"张城","刘丽丽","李国旺","孟红霞","贺宁"};    //定义姓名数组
	    String[] classes=new String[]{"数学","语文","数学","英语","英语"};    //定义课程数组
	    System.out.println("本次考试学生信息如下：");
	    //循环遍历数组，连接字符串
	    for(int i=0;i<no.length;i++)
	    {
	        System.out.println("学号："+no[i]+"|姓名："+names[i]+"|课程："+classes[i]+"|班级："+"初二（三）班");
	    }
	    
	    System.out.println("==============================");
	    String info="三国演义、";
	    info=info.concat("西游记、");
	    info=info.concat("水漭传、");
	    info=info.concat("红楼梦");
	    System.out.println(info);
	    String cn="中国";
	    System.out.println(cn.concat("北京").concat("海淀区").concat("人民公园"));
	    
	    System.out.println("==============================2");
//	    String sys="学生信息管理";//字义一个字符串表示系统名称
//        System.out.println("欢迎进入《"+sys+"》系统");//输出系统名称
//        System.out.println("请设置一个管理员密码：");
//        Scanner input=new Scanner(System.in);
//        String pass=input.next();//获取用户输入的密码
//        int length=pass.length();//获取密码的长度
//        if(length>6&&length<12)
//        {
//            System.out.println("密码长度符合规定。");
//            System.out.println("已生效，请牢记密码："+pass);
//        }
//        else if(length>=12)
//            System.out.println("密码过长。");
//        else
//            System.out.println("密码过短。");
//    }
	
	    System.out.println("==============================3");
	String str="abcdef 我 gHijklmn";
	System.out.println(str.toLowerCase());    //输出：abcdef 我 ghijklmn
	System.out.println(str.toUpperCase());    //输出：ABCDEF 我 GHIJKLMN
	}
	
}




