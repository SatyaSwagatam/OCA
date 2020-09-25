package com.cg.day3;

import java.util.*;

public class Prog7 {

	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<>();

		al.add("Welcome");
		al.add("Capgemini");
		al.add(1, "to");

		System.out.println("Initial ArrayList " + al);

		al.remove(1);

		System.out.println("After the Index Removal " + al);

		al.remove("Welcome");

		System.out.println("After the Object Removal " + al);
	}
}
/* O/P-
Initial ArrayList [Welcome, to, Capgemini]
After the Index Removal [Welcome, Capgemini]
After the Object Removal [Capgemini]
*/