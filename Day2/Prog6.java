package com.cg.day2;

import java.util.*;
public class Prog6 {
    public static void main(String args[]) {
     
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(3);
        hs.add(17);
        hs.add(6);
        hs.add(9);
        hs.add(6);  //duplicate element not allowed
        hs.add(7);
           
        for (Integer num : hs) {         
            System.out.println(num);   
        }
    }
}

//o/p- 17
//3
//6
//7
//9