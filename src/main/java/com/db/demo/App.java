package com.db.demo;

import com.db.demo.math.Calc;

/**
 * 
 * @author Vaman Deshmukh
 *
 */

public class App {

	public static void main(String[] args) {

		System.out.println("Start");
		Calc calc = new Calc();
		System.out.println(calc.addNums(10, 5));
		System.out.println(calc.subNums(10, 5));
		System.out.println("End");
	}
}
