package com.test.cn.test;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/29.
 */
public class TestArray {
	public static void main(String[] args) {
		//数组的声明
		int[] a = null;
		int b[] = null;

		a = new int[10];
		System.out.println(a.length);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	/*	//若访问数组的下标超过合法范围。数组名【数组元素下标】、注意：下标从0开始，所以最大值是
		a[10] = 9;*/

		//2 为数组分配内存空间
		a = new int[10];

		//3 获取数组的长度
		System.out.println(a.length);

		//4 访问数组的元素：数组名【数组元素的下标】
		// 注意；数组从0开始，所以最大值是Length-1
		//数组默认初始化
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		//若访问数组的下标超过合法范围，则在运行时抛出异常
		//a[10] =10;

		//数组的静态初始化
		int[] c = {1, 2, 3, 4, 5};
		int[] d = new int[]{2, 3, 4, 5, 6};
	/*	for (int j = 0; j < a.length; j++) {
			//System.out.println(d);
			System.out.println(d[j]);
		}*/
		/**
		 * 从键盘读入学生成绩，找最高分 输出学生成绩等级
		 * 成绩》=最高分-10，A   成绩》=最高分-20 ，B
		 * 成绩》=最高分-30，C   其他 D
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入学生人数");
		int count = scanner.nextInt();
		int[] scores = new int[count];
		int highScore = 0;

		//利用循环录入学生的成绩，同时 得到最高分，把学生成绩录入到声明的数组中
		for (int i=0;i<scores.length;i++){
			scores[i]=scanner.nextInt();
			if (scores[i] > highScore) {
				highScore = scores[i];
			}
		}
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= highScore - 10) {
				System.out.println("student"+i+"score is"+scores[i]+"grade is A");
			}else if (scores[i] >= highScore - 20){
				System.out.println("student"+i+"score is"+scores[i]+"grade is B");
			}else if (scores[i] >= highScore - 30){
				System.out.println("student"+i+"score is"+scores[i]+"grade is C");
			}else {
				System.out.println("student"+i+"score is"+scores[i]+"grade is D");
			}
		}
		/**
	 	*0
		 0 0
		 0 0 0
		 0 0 0 0
		 0 0 0 0 0
		 */
		//二维数组
		int[][] aa = new int[5][];
		for (int i = 0; i < aa.length; i++) {
			aa[i] = new int[i + 1];
			for (int j = 0; j < aa[i].length; j++) {
				System.out.print(aa[i][j]+" ");
			}
			System.out.println();
		}
	/*	//对二维数组进行遍历
		for (int i = 0; i < aa.length; i++) {
			for (int j = 0; j < aa[i].length; j++) {
				System.out.print(aa[i][j]+" ");
			}
			System.out.println();
		}*/
	}
}
