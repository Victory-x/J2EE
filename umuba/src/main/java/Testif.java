/**
 * Created by Administrator on 2016/6/21.
 */

import java.util.Scanner;

/**
 * 1)����������������if else���н���
 */
public class Testif {
	public static void main(String[] args) {
		// �ڿ���̨��������
		// ����scanner����
		System.out.println("��������������");
		Scanner scanner = new Scanner(System.in);//����(System.in)
		// ����scanner�����nextInt���������������������
		System.out.println("a1=");
		int a1 = scanner.nextInt();

		System.out.println("a2=");
		int a2 = scanner.nextInt();

		System.out.println("a3=");
		int a3 = scanner.nextInt();

		System.out.println("����������������ֱ�Ϊ��"+a1+","+a2+","+a3);

		if (a1 <= a2) {
			if (a3 <= a1) {
				System.out.println(a3 + "," + a1 + "," + a2);
			} else if (a3 >= a1) {
				System.out.println(a1 + "," + a2 + "," + a3);
			} else {
				System.out.println(a1 + "," + a3 + "," + a2);
			}

		} else {
			if (a3 <= a2) {

				System.out.println(a3 + "," + a2 + "," + a1);
			} else if (a3 >= a1) {
				System.out.println(a2+ "," + a1 + "," + a3);
			} else {
				System.out.println(a2+ "," + a3 + "," + a1);
			}
		}
		int i = 1;
		switch (i) {
			case 0:
				System.out.println("zero");
				break;
			case 1:
				System.out.println("one");
			default:
				System.out.println("default");
				break;
		}
		int a = 3;
		int x = 100;
		switch (a) {
			case 1:
				x += 5;
				break;
			case 2:
				x += 10;
				break;
			case 3:
				x += 34;
				break;
		}
		System.out.println(x);

		Scanner scanner1 = new Scanner(System.in);
		System.out.println("����ѧ����ѧ���ɼ�,source=");
		int source = scanner1.nextInt();
		switch (source/10) {
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8:
			case 7:
				System.out.println("B");
				break;
			case 6:
				System.out.println("C");
				break;
			default:
				System.out.println("D");
		}
		/**
		 * ����2013���ĳ���·ݺ����ڣ�����4�� month=4,day=21
		 * ��������ļ��㣬��ӡ��������·ݺ�������2013��ĵڼ���  31+28+31+21
		 */


	}
}
