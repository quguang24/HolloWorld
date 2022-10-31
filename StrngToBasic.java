//57课 基本数据类型转换字符串
public class StrngToBasic {
	public static void main(String[] args) {
		//基本数据类型->String("")(字符串）
		//基本类型值转字符串类型  语法；将基本类型的值+""即可
		int n1 = 100;
		float f1 = 1.1f;
		double d1 = 4.5;
		boolean b1 = true;
		String s1 = n1 + "";
		String s2 = f1 + "";
		String s3 = d1 + "";
		String s4 = b1 + "";
		System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);
		//String(字符串）->基本数据类型
		//通过基本类型的包装类调用parseXX方法即可
		String s5 = "123";
		//会在oop讲对象和方法的时候回详细讲解
		//解读调用使用包装类基本数据类型对应的包装类，的相应方法，得到的基本数据类型
		int unm1 = Integer.parseInt(s5);
		double unm2 = Double.parseDouble(s5);	
		float unm3 = Float.parseFloat(s5);
		long unm4 = Long.parseLong(s5);
		byte unm5 = Byte.parseByte(s5);	
		boolean b = Boolean.parseBoolean("true");
		short unm6 = Short.parseShort(s5);
		
		System.out.println("=====================");
		System.out.println(unm1);//123
		System.out.println(unm2);//123.0
		System.out.println(unm3);//123.0
		System.out.println(unm4);//123
		System.out.println(unm5);//123
		System.out.println(unm6);//123
		System.out.println(b);//true
		//怎么把字符串转字符char-含义是吧字符串的第一个字符得到
		//解读s5.charAt(1) 得到S5字符串的第一个字符 得到字符'1'不是数字1.因为老外排序 是 0123456；
		System.out.println(s5.charAt(0));//结果是1.
		
		
		
		//58课基本数据类型和String类型的转换，我们可以把"123"转成一个整数， 但是不能把Hello转成一个整数；
		String str = "123";
		//转成int
		int i1 = Integer.parseInt(str);
		System.out.println(i1);
		//如果格式不正确就会抛出异常，程序就会终止。“如String str = "Hello";”！！！！！！！
		//60
		char w1 = '\n';
		char w2= '\t';
		char w3 = '\r';
		char w4 ='\\';
		char w5 = '1';
		char w6 = '2';	
		char w7 = '3';	
		System.out.println(w1);
		System.out.println(w2);
		System.out.println(w3);
		System.out.println(w4);
		System.out.println(w5);
		System.out.println(w6);
		System.out.println(w7);
		
		System.out.println("西游记\t男\t12.3\n水浒传\t女\t12.6");
		String name = "曲广";
		int age = 33;//年龄
		double score =99.8;//成绩
		String gende = "男";//性别
		String Hobby = "玩";//爱好
		System.out.println("name\tage\tscore\tgende\tHobby\n曲广\t33\t99.8\t男\t玩 ");
		
		
	}
}