package com.cg.day3;

import java.util.*;

public class Prog3 {

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 2, 3, 4 };
		Vector<Integer> v = new Vector();
		Hashtable<Integer, String> h = new Hashtable();

		v.addElement(1);
		v.addElement(2);

		h.put(1, "Hi");
		h.put(2, "Hello");

		System.out.println(arr[0]);
		System.out.println(v.elementAt(0));
		System.out.println(h.get(1));

	}
}
/* O/P-
1
1
Hi
*/