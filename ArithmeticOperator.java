//63课 算数运算符的使用
public class ArithmeticOperator {
	public static void main(String[] args) {
		System.out.println(10 / 4);
		//从数字上看是2.5，JAVA中是2
		System.out.println(10.0 / 4);
		//java中是2.5
		double d = 10/4;//JAVA中是2 10/4=2.5.因为是double 精度提升 2=2.0 所以是2.0
		System.out.println(d);//答案是2.0   2.0是double类型的 2是int类型的；
		
		//% 取模也叫取余
		//在%本质 是一个公式 a % b= a - a  / b * b
		System.out.println(10 % 3);//1
		System.out.println(-10 % 3);//-1
		System.out.println(-10 % -3);//-1
		
		// ++的使用  。++i i++ 各自独立运算的时候独立自增
		//-- 自减 i = i - 1
		int i = 10;
		i++;//自增 i=i+1  (1)
		++i;//自增 i=i+1  (2)
		System.out.println(i);//1自增后是11  2又自增一次所以是12.
		/*
		 * 作为表达式使用
		 * 前++; ++i 先自增后赋值
		 * 后++; i++ 先赋值后自增
		 */
		int j = 8;
		int k = ++j;// 这句话是 先 等价 j = j+1，然后 在 k=j；
		System.out.println("k="+k + "j="+ j);
		int j1 = 8;
		int k1 = j1++;// 这句话是 先 等价 k1=j1.然后 在 j1 = j1+1，
		System.out.println("k1="+k1 + "j1="+ j1);//k1=8 j1=9
		 //练习    1 （计算机内部运算）先temp=a; 2 a=a+1; 3 a=temp  所以a = 1 
		int a = 1;
		 a = a++;
		 System.out.println("a=" +a ); 
		 // 1 b=b+1; 2（计算机内部运算）先 temp=b; 3 b=temp  所以b = 2 
		 int b = 1;
		 b = ++b;
		 System.out.println("b=" +b ); 
		//练习1
		 int y = 31;
		 int z = y/7;
		 int t =y%7;
		 System.out.println(y+"天 合" + z+"个星期零"+t+"天");
		 //2
		 double h = 234.5;
		 double s = 5.0 / 9 * (h-100);
		 /*考虑计算机java 的运算 和语言特性 double 是最高精度 
		 温度是带小数点的所以 必须.0*/
		 System.out.println("摄氏温度为" + s +"对应的华氏温度=" + h);
		
		 
	}
}