package com.dataapplab.spring.basic.algorithm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class BinarySearchm {

	public BubbleSort getBubbleSort() {
		return bubbleSort;
	}
	@Autowired	
	public void setBubbleSort(BubbleSort bubbleSort) {
		this.bubbleSort = bubbleSort;
	}


	private BubbleSort bubbleSort;
	 public BinarySearchm () {}
		 
	 public BinarySearchm (BubbleSort sortAlg) {
		 this.bubbleSort=sortAlg;
	 }
	 
public int binarySearchm (int[]number,int target ) {
	//sort
	bubbleSort.sort(number);
	System.out.println("binarySearch");
	System.out.println("BubbleSort");
	 return 3;
 }
}
