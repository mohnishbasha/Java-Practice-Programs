package com.tests;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

enum Title1 {
	MR("Mr."), MRS("Mrs."), MS("Ms.");
	private final String title;

	private Title1(String t) {
		title = t;
	}

	public String format(String last, String first) {
		return title + " " + first + " " + last;
	}
}

public class TitleEnumExample {
	public static void main(String[] args) {
		System.out.println(Title1.MR.format("Doe", "John"));
		search(new LinkedList<String>());
	}

	public static void search(List<String> list) {
		list.clear();
		list.add("b");
		list.add("a");
		list.add("c");
		System.out.println(Collections.binarySearch(list, "a"));
	}
}