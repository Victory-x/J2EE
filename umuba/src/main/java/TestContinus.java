/**
 * Created by Administrator on 2016/6/28.
 */
public class TestContinus {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				continue;
				//System.out.println("test");
			}
			System.out.println(i);
		}
		//输入几个素数(1-100) 素数：有且仅有二个正约数的整数
		//true表示是素数  false表述不是素数
		long begin = System.currentTimeMillis();
		boolean flag = true;
		for (int x = 2; x <= 100000; x++) {
			flag = true;
		for(int j = 2;j <= Math.sqrt(x);j++) {
			if (x % j == 0) {
				flag = false;
				break;
			}
		}
			if (flag) {
				System.out.println(x);
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("time:" + (end - begin));
	}

}