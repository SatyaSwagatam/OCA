package com.cg.day2;

import java.util.*;
public class Prog7 {
    public static void main(String args[]) {
        // initialize ArrayList  
        ArrayList<Integer> al = new ArrayList<Integer>();
        // add elements to ArrayList object
        al.add(3);
        al.add(17);
        al.add(6);
        al.add(9);
        al.add(7);
        al.remove(2);
         
            for (Integer num : al) {         
            System.out.println(num);   
        }
        if (al.contains(7)) {
            System.out.println("7 was found in the list");
        } else {
            System.out.println("7 was not found in the list");
        }
    }
}

//o/p- 3
//17
//9
//7
//7 was found in the list