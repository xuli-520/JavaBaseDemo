package com.stringtest;

public class StringDemo4 {
	
	public static void main(String[] args)
	{
	    String words="hello java,hello php";
	    System.out.println("ԭʼ�ַ�����'"+words+"'");
	    System.out.println("replace(\"l\",\"D\")�����"+words.replace("l","D"));
	    System.out.println("replace(\"hello\",\"���\")�����"+words.replace("hello","��� "));
	    words="hr's dog";
	    System.out.println("words������"+java.lang.System.identityHashCode(words));
	    System.out.println("ԭʼ�ַ�����'"+words+"'");
	    String words2=words.replace("r's","is");
	    System.out.println("words2������"+java.lang.System.identityHashCode(words2));
	    System.out.println("replace(\"r's\",\"is\")�����"+words.replace("r's","is"));
	    
	    System.out.println("=======================1");
	    String str1="abc";
		String str2=new String("abc");
		String str3="ABC";
		System.out.println(str1.equals(str2));    //��� true
		System.out.println(str1.equals(str3));    //��� false
		
		
	}
	
	
	

}
