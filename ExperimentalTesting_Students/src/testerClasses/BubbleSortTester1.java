package testerClasses;

import java.util.ArrayList;
import java.util.Map;

import strategiesClasses.BubbleSort;
import strategiesClasses.HeapSort;
import strategiesClasses.SequentialFD;

public class BubbleSortTester1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> data = TestingUtils.generateListOfIntegers(500); 
		
		TestingUtils.displayListElements("Original Data", data);
		
		BubbleSort<Integer> sorter = new BubbleSort<Integer>(new IntegerComparator2()); 
		 

		sorter.sortList(data);
		
		TestingUtils.displayListElements("Sorted", data);
	}
	
	/**
	 * THE COMPARATOR2 CHANGES THE ORDER TO REVERSE ACCORDING TO THE INITIAL ORDER OF THE
	 * SORTING ALGORITHM.
	 */
	
	

}
