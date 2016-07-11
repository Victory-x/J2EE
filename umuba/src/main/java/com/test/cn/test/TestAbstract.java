package com.test.cn.test;

/**
 * Created by Administrator on 2016/7/6.
 * 1 abstract 修饰的类是抽象类，修饰的方法是抽象方法
 * 2 不可被实例化 就是被继承的类 抽象类中不一定有抽象方法
 * 3 没有方法体的方法 抽象方法所在的类一定是抽象类 抽象方法是用来被子类重写的
 * 4 abstract 不能用来 修饰构造方法 私有方法 静态方法
 * 5 抽象类是用来模拟化
 */
public abstract class TestAbstract {
	public static void main(String[] args) {
		E e = new F();
	}
}

abstract class E{
	abstract void test();
}

class F extends E {

	@Override
	void test() {

	}
}
