package com.test.cn.test;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/23.
 */
public class Testtwo {
	public static void main(String[] args) {
		/**
		 * 输入2013年的某个月份和日期，例如4月 month=4,day=21
		 * 经过程序的计算，打印出输入的月份和日期是2013年的第几天  31+28+31+21
		 */
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("请输入2013的某个月份和日期" );
		System.out.println("month:");
		int month = scanner2.nextInt();
		System.out.println("day:");
		int day = scanner2.nextInt();
		int noDay = 0;
		int days = day ;
		switch (month-1) {
			//...
			case 4:
				days += 31;
			case 3:
				days += 31;
			case 2:
				days += 28;
			case 1:
				days += 31;
		}
		System.out.println(month + "月0" + day + "日是2014年的第" + days + "天");

/*		//从1打印到100
		for (i = 1; i <= 100; i++) {
			System.out.println(i);
		}*/
		//循环的初始化  通常用
		int j = 1;
		for (; j <= 100; ) {
			System.out.println(j);
			//迭代
			j++;
		}
		//打印1-100所有偶数
		for (int k = 1; k <= 100; k++) {
			if (k % 2 == 0) {
				System.out.println(k);
			}
		}
		/*编写程序FooBizBaz.java，从1循环到150并在每行打印一个值，
		另外在每个3的倍数行上打印出“foo”,在每个5的倍数行上打印“biz”,
		在每个7的倍数行上打印输出“baz”。
		*/
		for (int v = 1; v <= 150; v++) {
			System.out.print(v);
			if (v % 3 == 0) {
				System.out.print(" foo");
			}
			if (v % 5 == 0) {
				System.out.print(" biz");
			}
			if (v % 7 == 0) {
				System.out.print(" baz");
			}
			System.out.println();
		}
		int i = 1;
		while (i <= 100) {
			System.out.println(i);
			i++;
		}
		System.out.println("========================================");
		int q = 102;
		do {
			System.out.println(q++);
		} while (q <= 100);
		//求1到100之间所有偶数的和。用for和while语句分别完成。
		int sum = 0;
		int m = 1;
		while (m <= 100) {
			if (m % 2 == 0) {
				sum += m;
			}
			m++;
		}
		System.out.println(sum);
		//for
		int total=0;
		for (int n=1;n<=100;n++) {
			if (n % 2 == 0) {
				total += n;
			}
		}
		System.out.println(total);

		// 从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序。
		int x = 0;//正个数
		int y = 0;//负个数
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int b = scanner.nextInt();
			if (b > 0) {
				x++;
			}else if (b < 0) {
				y++;
			} else {
				break;
			}
		}
		System.out.println("正数" + x);
		System.out.println("负数" + y);

	}
}
