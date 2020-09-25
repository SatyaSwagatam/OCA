package com.cg.day3;

import java.util.*;

public class Prog9 {

	public static void main(String args[]) {
		LinkedList<String> ll = new LinkedList<>();

		ll.add("Welcome");
		ll.add("Capgemini");
		ll.add(1, "To");

		System.out.println(ll);
	}
}
/* O/P-
[Welcome, To, Capgemini]
*/