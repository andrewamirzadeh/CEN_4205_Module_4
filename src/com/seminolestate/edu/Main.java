package com.seminolestate.edu;

public class Main {

	public static void main(String[] args) {

		// class to hold all the functions
		Functions functions = new Functions();

		// class to hold all the collections
		DataWarehouse dataWarehouse = new DataWarehouse(functions.twoMillArray(), functions.twoMillLinked(),
				functions.twoMillHash());

//		for (Integer i : dataWarehouse.getIntArray()) {
//			System.out.println(i);
//		}

//		System.out.println(dataWarehouse.getIntArray().toString());
//		System.out.println();
//		
//		System.out.println(dataWarehouse.getLinkArray().toString());
//		
//		System.out.println();
//		System.out.println(dataWarehouse.getHashArray().toString());
//		

	}

}
