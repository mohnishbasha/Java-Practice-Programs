package com.tests;

import java.io.*;
import java.util.Scanner;

public class Forest implements Serializable {
	private Tree tree = new Tree();

	public enum Color {
		RED, GREEN, BLUE
	};

	static void test() throws Error {
		if (true)
			throw new AssertionError();
		System.out.print("test ");
	}

	public static void main(String[] args) {
		Forest f = new Forest();
		try {

			for (Color c : Color.values()) {
				System.out.println(c);
			}
			String test = "a1b2c3";
			String[] tokens = test.split("\\d");
			for (String s : tokens)
				System.out.print(s + " ");

			test();
		} catch (NullPointerException npe) {
			System.out.println("NullPointerException");
		} catch (Exception ex) {
			System.out.println("Exception");
		}

	}
}

class Tree {
	public Tree() {
	}
}
