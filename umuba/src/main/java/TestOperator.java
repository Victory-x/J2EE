/**
 * Created by Administrator on 2016/6/16.
 */
public class TestOperator {
	public static void main(String[] args) {
		int r = 10 % 3;
		System.out.println(r);
//i++ ��ȡֵ������  ��ȡiֵ��������(i = i+1)
		int i = 10;
		int j = i++;
		System.out.println(j);

		j = i;
		System.out.println(j);

		int m = 100;
//++m ������(m=m+1)��ȡֵ
		int n = ++m;
		System.out.println(n);

		n = m;
		System.out.println(n);

		String str ="abc";
		String str2="bdc";

		System.out.println(str+str2);

		System.out.println(10 % -3);//1
		//�ȶ������ֵ����ȡģ���㣬Ȼ����ǰ��Ӹ���
		System.out.println(-10 % 3);//-1
		System.out.println(-10 % -3);//-1

		//����֮ǰ������ʱ��ֻ�����������֣�������С������
		int x=3290;
		x =x/1000;
		System.out.println(x);

		//+�Ӻų��ַ�����ӵĹ����⣬���ܰѷ��ַ���ת�����ַ���
		String str5 = "i1";
		System.out.println(str5 + 10);

		//��չ��ֵ�������+=....
		x += 1000;
		//x=x+1000
		System.out.println(x);

		System.out.println(x >= 1000);//true

		int a = 10;
		int b = 20;
		System.out.println(a > 5 & b < 10);//false

		System.out.println(a > 15 && (10 / 10 == 1));//false

		//��Ԫ����� ���������ʽ)?���ʽ1�����ʽ2��


	}
}