public class If03 {
	public static void main(String[] agsr) {
		/*声明两个double类型额变量并赋值。判断第一个数大于10.0，并且
		//第二个数字小于20.0，打印两数之和。
		double d1 = 30.5;
		double d2 = 2.5;
		if (d1 > 10.0 && d2 < 20.0) {
			System.out.println(d1 + d2);
		} 
		//定义两个变量int 判断二者的和
		//是否能被3 又能被5 整除 打印提示信息
		int a = 2;
		int b = 3;
	    int c = a + b;
		if (c % 3==0 && c % 5 ==0) {
			System.out.println("A+B的和能被3 和5 整除。");
		} else {
			System.out.println("A+B的和不能被3 和5 整除。");
		}
		
		//判断一个年份是否是闰年 ，闰年的条件是符合下面两者之一；
		//1年份能被4整除 但是不能被100整除
		//2能被400 整除
		 * */
		
		int year = 2022;
		if ((year % 4 == 0 && year % 100 != 0)|| year % 400 == 0 ) {
			System.out.println(year + "是闰年");
		} else {
			System.out.println(year + "不是闰年");
		}
	}
}