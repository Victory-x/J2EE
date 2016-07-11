package com.test.cn.test;

/**
 * Created by victory_x on 2016/7/8.
 */
public class EcmDef {

	public static void main(String[] args) {
		try {
			int i = Integer.parseInt(args[0]);
			int j = Integer.parseInt(args[1]);
			System.out.println(ecm(i, j));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("输入的参数个数不足（数组下界越界异常）");
		} catch (ArithmeticException e) {
			System.out.println("除数不能为0");
		} catch (EcDef e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("输入的参数不能转成整型.");
		}
	}
	public static int ecm(int i, int j) {
		if (i < 0 || j < 0) {
			throw new EcDef("不能处理负数");
		}
		int result = i / j;
		return result;
	}
}
