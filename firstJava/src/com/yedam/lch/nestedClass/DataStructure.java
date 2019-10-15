package com.yedam.lch.nestedClass;

import java.util.Iterator;

public class DataStructure {
	private final static int SIZE = 15;
	private int[] arrayOfInts = new int[SIZE];

	public DataStructure() {
		for (int i = 0; i < SIZE; i++) {
			arrayOfInts[i] = i;
		}
	}

	// 메소드
	public void printEven() {
		DataStructureIterator iterator = this.new EvenIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}
		System.out.println();
	}

	// int -> Integer
	interface DataStructureIterator extends Iterator<Integer> {

	}

	private class EvenIterator implements DataStructureIterator {
		private int nextIndex = 0;

		@Override
		public boolean hasNext() {
			return (nextIndex <= SIZE - 1);
		}

		@Override
		public Integer next() {
			Integer retVal = Integer.valueOf(arrayOfInts[nextIndex]);
			nextIndex += 2;
			return retVal;
		}

	}

	public static void main(String[] args) {
		DataStructure ds = new DataStructure();
		ds.printEven();
	}
}
