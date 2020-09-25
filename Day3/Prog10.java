package com.cg.day3;

import java.util.*;  

public class Prog10 {  
    
    public static void main(String args[])  
    {  
        LinkedList<String> ll = new LinkedList<>();  
    
        ll.add("welcome");  
        ll.add("capgemini");  
        ll.add(1, "to");  
    
        System.out.println(  
            "Initial LinkedList " + ll);  
    
        ll.remove(1);  
    
        System.out.println(  
            "After the Index Removal " + ll);  
    
        ll.remove("welcome");  
    
        System.out.println(  
            "After the Object Removal " + ll);  
    }  
}  
/* O/P-
Initial LinkedList [welcome, to, capgemini]
After the Index Removal [welcome, capgemini]
After the Object Removal [capgemini]
*/