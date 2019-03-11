package com.stringtest;

public class StringDemo4 {
	
	public static void main(String[] args)
	{
	    String words="hello java,hello php";
	    System.out.println("原始字符串是'"+words+"'");
	    System.out.println("replace(\"l\",\"D\")结果："+words.replace("l","D"));
	    System.out.println("replace(\"hello\",\"你好\")结果："+words.replace("hello","你好 "));
	    words="hr's dog";
	    System.out.println("words的引用"+java.lang.System.identityHashCode(words));
	    System.out.println("原始字符串是'"+words+"'");
	    String words2=words.replace("r's","is");
	    System.out.println("words2的引用"+java.lang.System.identityHashCode(words2));
	    System.out.println("replace(\"r's\",\"is\")结果："+words.replace("r's","is"));
	    
	    System.out.println("=======================1");
	    String str1="abc";
		String str2=new String("abc");
		String str3="ABC";
		System.out.println(str1.equals(str2));    //输出 true
		System.out.println(str1.equals(str3));    //输出 false
		
		
	}
	
	
	

}
