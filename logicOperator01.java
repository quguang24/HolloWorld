//71
public class logicOperator01 {
	public static void main(String[] args) {
		//&&短路语 如果两个条件都为真 则结果为真 反之则为假
		int age = 50;
		if(age > 20 && age < 90) {
			System.out.println("ok100");
		}
		//&逻辑语 如果两个条件都为真 则结果为真 反之则为假
		if(age > 20 & age < 90) {
			
		}
			System.out.println("ok200");
			//区别
			int a= 4;
			int b =9;
			//对于&&短路语而言 如果第一个条件是假 则第二个条件不予运算
			//对于&逻辑语而言 如果第一个为假 则第二个仍然会继续运算
			if(a < 5 && ++b < 50) {
				System.out.println("a=" + a +"b=" + b);
			}
			//短路或|| 逻辑或|
			// || 规则：两个条件中只要有一个成立，结果为true,否则为false
			// |规则：两个条件中只要有一个成立，结果为true,否则为false
			int age1 = 50;
			if(age1 > 20 || age1 < 30) {
				System.out.println("ok10011");
			}
				
			int age2 = 50;	
			if(age2 > 20 | age2 < 30) {
				System.out.println("ok2000");
			}
			//|| 短路或；如果第一个条件为true,则第二个条件不会判断，最终结果为true,效率高
			int a1= 4;
			int b1 =9;	
			if(a1 > 1 || ++b1 > 4) {
				System.out.println("ok11111111");
			}
			System.out.println("a1=" + a1 +"b1=" + b1);//4/9
			// | 逻辑或；不管第一个条件是否为true,第二个都要判断效率底下
			int a2= 4;
			int b2 =9;	
			if(a2 > 1 | ++b2 > 4) {
				System.out.println("ok222222");
			}
			System.out.println("a2=" + a2 +"b2=" + b2);//4/第二个又判断 所以为10
			System.out.println(60 > 20);
			System.out.println(!(60 > 20));
			//a^b ； 叫做逻辑异域 当a和b 不同时  则结果为true, 否则为false 
			boolean b4 = (10 > 1) ^ (3 < 5);
			System.out.println("b4=" + b4);// 结果为true .
			boolean b5 = (10 > 1) ^ (3 > 5);
			System.out.println("b5=" + b5);// 结果为false 
	}
}