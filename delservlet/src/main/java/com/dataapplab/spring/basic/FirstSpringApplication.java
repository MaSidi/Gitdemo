package com.dataapplab.spring.basic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.dataapplab.spring.basic.algorithm.AlgorithmConfig;
import com.dataapplab.spring.basic.algorithm.BinarySearchm;
import com.dataapplab.spring.basic.algorithm.BubbleSort;

public class FirstSpringApplication {
public static void main(String[]args) {
	//initialize bean
	//where are bean
	//bean dependency of bean 
	//searBubbleSortch beans =>auto compose 
	//BubbleSort bubble = new BubbleSort();
    //BinarySearchm search =new BinarySearchm(bubble);
	try (AnnotationConfigApplicationContext context = 
			new AnnotationConfigApplicationContext(AlgorithmConfig.class))
	{       BinarySearchm search= context.getBean(BinarySearchm.class);
	int result = search.binarySearchm(new int[] {12,5,6,8},3);
	
	System.out.println(result);
	}
	
	}
}
