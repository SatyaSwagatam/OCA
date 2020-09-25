package com.cg.day3;

import java.util.*;

public class Prog8 {

	public static void main(String args[]) {

		LinkedList<String> ll = new LinkedList<String>();

		ll.add("A");
		ll.add("B");
		ll.addLast("C");
		ll.addFirst("D");
		ll.add(2, "E");

		System.out.println(ll);

		ll.remove("B");
		ll.remove(3);
		ll.removeFirst();
		ll.removeLast();

		System.out.println(ll);
	}
}
/* O/P-
[D, A, E, B, C]
[A]
*/