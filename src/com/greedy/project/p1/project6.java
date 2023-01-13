package com.greedy.project.p1;

public class project6 {

	public static void main(String[] args) {
		double weight = 74.5;
		double height = 1.744;

		int bmi = (int) (weight / (height * height));
		
		System.out.println("키 : " + (height * 100));
		System.out.println("몸무게 : " + weight);
		System.out.println("BMI : " + bmi);
	}
}
