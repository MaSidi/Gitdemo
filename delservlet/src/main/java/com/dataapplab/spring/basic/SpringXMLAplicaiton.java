package com.dataapplab.spring.basic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dataapplab.spring.basic.algorithm.AlgorithmConfig;
import com.dataapplab.spring.basic.algorithm.BinarySearchm;

public class SpringXMLAplicaiton {
	public static void main(String[]args) {

		try (ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml")){
		       BinarySearchm search= context.getBean(BinarySearchm.class);
		int result = search.binarySearchm(new int[] {12,5,6,8},3);
		System.out.println(result);
	
			}	
}
}
