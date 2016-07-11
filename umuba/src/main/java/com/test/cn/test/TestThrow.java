package com.test.cn.test;

import java.util.Scanner;

/**
 * Created by victory_x on 2016/7/8.
 */
public class TestThrow {
	public static void main(String[] args) {
		try {
			inputAge();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("end...");
	}

	private static void inputAge() {
		Scanner sc = new Scanner(System.in);
		System.out.print("age=");
		int age = sc.nextInt();
		if (age > 30) {
			//System.out.println("年纪偏大");
			throw new AgeTooLargeException("年纪偏大");
		}
	}

	public static void test() {
		RuntimeException ex = new RuntimeException();
		throw ex;
	}

}
