package com.seminolestate.edu;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;

public class DataWarehouse {
	private ArrayList<Integer> intArray = new ArrayList<>();
	private LinkedList<Integer> linkArray = new LinkedList<>();
	private Hashtable<Integer, Integer> hashArray = new Hashtable<>();

	DataWarehouse(ArrayList<Integer> intArray, LinkedList<Integer> linkArray, Hashtable<Integer, Integer> hashArray) {
		this.intArray = intArray;
		this.linkArray = linkArray;
		this.hashArray = hashArray;

	}

	public ArrayList<Integer> getIntArray() {
		return intArray;
	}

	public void setIntArray(ArrayList<Integer> intArray) {
		this.intArray = intArray;
	}

	public LinkedList<Integer> getLinkArray() {
		return linkArray;
	}

	public void setLinkArray(LinkedList<Integer> linkArray) {
		this.linkArray = linkArray;
	}

	public Hashtable<Integer, Integer> getHashArray() {
		return hashArray;
	}

	public void setHashArray(Hashtable<Integer, Integer> hashArray) {
		this.hashArray = hashArray;
	}

}
