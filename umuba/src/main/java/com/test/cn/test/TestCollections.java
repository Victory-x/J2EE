package com.test.cn.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by victory_x on 2016/7/8.
 */
public class TestCollections {


	public static void main(String[] args) {
		//1.创建一个Collection接口的对象
		Collection collection = new ArrayList();
		//2。collection重复方法说明
		/**
		 *2.1用于添加元素的
		 *add()
		 *addAll()
		 * */
		Person p1 = new Person();
		collection.add(p1);
		collection.add(new Person());

		Collection collection2 = new ArrayList();
		collection2.add(new Person());
		collection2.add(new Person());

		collection.addAll(collection2);
		System.out.println(collection.size());
		/**
		 * 2.2用于访问集合的方法：
		 * 获取集合长度 size()
		 * 对集合进行遍历的方法：iterator() 可得到对应的iterator 接口对象
		 * iterator:迭代器
		 * a 获取iterator接口对象
		 * b 使用while 循环和Iterator对象遍历集合中的每一个元素 具体使用iterator接口的
		 * hasNext()和next()方法
		 */
		Iterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			Object obj = iterator.next();
			System.out.println(obj);
		}
		/**
		 * 2.3移除集合中的元素
		 * remove()移除某一个指定的对象,,通过equals()方法来判断要移除的某个元素在集合中是否存在 ,以及是否能成功移除
		 * removeAll()
		 * clear()：使集合中的元素为空
		 */
		//boolean result = collection.remove(new Person());
		//System.out.println(result);
		//result = collection.removeAll(collection);
		//System.out.println(collection.size());
		/**
		 * 2.4用于检测集合的方法
		 * retains()
		 * retainsAll()
		 * isEmpty()
		 */
		System.out.println(collection.contains(new Person()));
		System.out.println(collection.contains(p1));
		System.out.println(collection.containsAll(collection2));
		System.out.println(collection.isEmpty());
		//collection.clear();
		System.out.println(collection.isEmpty());
		/**
		 *2.5其他方法
		 * toArray();
		 * T[] toArray(T[])：涉及到泛型
		 * equals()
		 * hasCode()
		 */
		Object[] objs = collection.toArray();
		System.out.println(objs.length);

		Person p2 = new Person();
		Collection collection3 = new ArrayList();
		collection3.add(p1);
		collection3.add(p2);

		Collection collection4 = new ArrayList();
		collection4.add(p2);
		collection4.add(p1);

		System.out.println(collection3.equals(collection4));

		/**
		 * 使用增强for循环方式来进行遍历
		 */
		for (Object obj : collection) {
			System.out.println(obj);
		}
	}
}
