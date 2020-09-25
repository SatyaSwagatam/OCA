package com.cg.day3;
import java.util.*;
public class Prog2 {

	    public static void main(String args[]) 
	    { 
	        // Creating HashSet and adding elements 
	        HashSet<String> set = new HashSet<String>(); 
	  
	        set.add("Satya"); 
	        set.add("Ravi"); 
	        set.add("Vijay"); 
	        set.add("Ajay"); 
	        set.add("Satya"); 
	  
	        // Traversing elements 
	        Iterator<String> itr = set.iterator(); 
	        while (itr.hasNext()) { 
	            System.out.println(itr.next()); 
	        } 
	    } 
	} 
/* O/P-
Satya
Vijay
Ravi
Ajay
*/