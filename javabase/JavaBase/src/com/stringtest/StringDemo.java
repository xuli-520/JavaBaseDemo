package com.stringtest;
import java.util.Scanner;
public class StringDemo {
	public static void main(String[] args) {
		int[] no=new int[]{501,101,204,102,334};    //����ѧ������
	    String[] names=new String[]{"�ų�","������","�����","�Ϻ�ϼ","����"};    //������������
	    String[] classes=new String[]{"��ѧ","����","��ѧ","Ӣ��","Ӣ��"};    //����γ�����
	    System.out.println("���ο���ѧ����Ϣ���£�");
	    //ѭ���������飬�����ַ���
	    for(int i=0;i<no.length;i++)
	    {
	        System.out.println("ѧ�ţ�"+no[i]+"|������"+names[i]+"|�γ̣�"+classes[i]+"|�༶��"+"������������");
	    }
	    
	    System.out.println("==============================");
	    String info="�������塢";
	    info=info.concat("���μǡ�");
	    info=info.concat("ˮ�ݴ���");
	    info=info.concat("��¥��");
	    System.out.println(info);
	    String cn="�й�";
	    System.out.println(cn.concat("����").concat("������").concat("����԰"));
	    
	    System.out.println("==============================2");
//	    String sys="ѧ����Ϣ����";//����һ���ַ�����ʾϵͳ����
//        System.out.println("��ӭ���롶"+sys+"��ϵͳ");//���ϵͳ����
//        System.out.println("������һ������Ա���룺");
//        Scanner input=new Scanner(System.in);
//        String pass=input.next();//��ȡ�û����������
//        int length=pass.length();//��ȡ����ĳ���
//        if(length>6&&length<12)
//        {
//            System.out.println("���볤�ȷ��Ϲ涨��");
//            System.out.println("����Ч�����μ����룺"+pass);
//        }
//        else if(length>=12)
//            System.out.println("���������");
//        else
//            System.out.println("������̡�");
//    }
	
	    System.out.println("==============================3");
	String str="abcdef �� gHijklmn";
	System.out.println(str.toLowerCase());    //�����abcdef �� ghijklmn
	System.out.println(str.toUpperCase());    //�����ABCDEF �� GHIJKLMN
	}
	
}




