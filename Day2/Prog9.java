package com.cg.day2;

public class Prog9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread t1=new Thread();
Thread t2=new Thread();
Thread t3=t1;
System.out.println(t1==t2);  //false
System.out.println(t2==t3);  //false
System.out.println(t3==t1);  //true

String s1=new String("Satya");
String s2=new String ("Satya");

System.out.println(s1==s2);   //false
System.out.println(s1.equals(s2)); //True
System.out.println(t1.equals(t2));  //false
System.out.println(t3.equals(t1));	//TRUE

	}

}