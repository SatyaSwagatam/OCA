package com.cg.day3;

import java.util.*;

public class Prog6 {

	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<>();

		al.add("Welcome");
		al.add("Capgemini");
		al.add(1, "to");

		for (int i = 0; i < al.size(); i++) {

			System.out.print(al.get(i) + " ");
		}

		System.out.println();

		for (String str : al)
			System.out.print(str + " ");
	}
}
/* O/P-
Welcome to Capgemini 
Welcome to Capgemini 
*/