package com.cg.day3;

import java.util.*;

public class Prog5 {
	public static void main(String args[]) {

		TreeSet<String> ts = new TreeSet<String>();

		ts.add("Satya");
		ts.add("Ravi");
		ts.add("Vijay");
		ts.add("Ajay");
		ts.add("Satya");

		Iterator<String> itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
/* O/P-
Ajay
Ravi
Satya
Vijay
*/