package com.stringtest;

import java.util.Scanner;

public class StringBufferDemo {
	public static void main(String[] args) {
		//����һ���յ��ַ���������������16���ַ�������
		StringBuffer str1=new StringBuffer();
		//����һ������10���ַ��������ַ���������
		StringBuffer str2=new StringBuffer(10);
		//����һ������(16+4)���ַ�����������"�ഺ�޻�"Ϊ4���ַ�
		StringBuffer str3=new StringBuffer("�ഺ�޻�");
		/*
		*����ַ�����������С
		*capacity()���������ַ�����������С
		*/
		System.out.println(str1.capacity());    //��� 16
		System.out.println(str2.capacity());    //��� 10
		System.out.println(str3.capacity());    //��� 20
		
		
		//׷���ַ���
		System.out.println("=================2"); 
		StringBuffer buffer=new StringBuffer("hello,");    //����һ�� StringBuffer ����
		System.out.println(java.lang.System.identityHashCode(buffer));//2018699554
		
		String str="World!";
		buffer.append(str);    //�� StringBuffer ����׷�� str �ַ���
		System.out.println(buffer.substring(0));    //�����Hello,World!
		System.out.println(java.lang.System.identityHashCode(buffer));//2018699554
		
		System.out.println("=================3"); 
		StringBuffer sys=new StringBuffer("У�ڿγ̹���");
        System.out.println("��ӭ���롶"+sys+"��ϵͳ");
        //�����γ������ַ���
        StringBuffer courseName=new StringBuffer();
        System.out.println("��¼�뱾�ڵ����ű��޿����ƣ�");
        Scanner input=new Scanner(System.in);//����һ�� Scanner����
        //ѭ�����տ���̨������ַ���
        String name="";
        for(int i=0;i<5;i++)
        {
            name=input.next();//���ò���ȡ���̼���¼���ֵ
            courseName.append(name+"\t");
            if(i==4)
            {
                System.out.println("¼�����!");
            }
        }
        System.out.println("��ѧ�ڵı��޿γ��У�\n"+courseName);
	}
}
