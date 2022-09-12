package com.seminolestate.edu;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;

public class Functions {
	private static ArrayList<Integer> intArray = new ArrayList<>();
	private static LinkedList<Integer> linkArray = new LinkedList<>();
	private Hashtable<Integer, Integer> hashArray = new Hashtable<>();

	public ArrayList<Integer> twoMillArray() {
		for (int i = 0; i < 2000000; i++) {
			intArray.add((int) (Math.random() * 20));
		}
		intArray.clear();
		return intArray;
	}

	public LinkedList<Integer> twoMillLinked() {
		for (int i = 0; i < 2000000; i++) {
			linkArray.push((int) (Math.random() * 20));
		}
		linkArray.clear();
		return linkArray;
	}

	public Hashtable<Integer, Integer> twoMillHash() {
		for (int i = 0; i < 2000000; i++) {
			hashArray.put(i, (int) (Math.random() * 20));
		}
		hashArray.clear();
		return hashArray;
	}

}
