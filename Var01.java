public class Var01 {
	//main方法
	public static void main(String[] args) {
		//记录人的信息
		int age = 33333;
		double score = 88.9;
		char gender = '男';
		String name = "king";
		//变量必须要先声明，后使用既有顺序
		int a = 50; 
		
		//输出信息，快捷键
		System.out.println("人的信息如下:");
		System.out.println(name);
		System.out.println(age);
		System.out.println(score);
		System.out.println(gender);
		System.out.println(a);
		//先后顺序
		a = 60; //变量必须相符 如a = 撒旦发射点；则不成立 不相符
		System.out.println(a);
		/* 变量在同一个作用域不能重名
		int a = 77;//错误
		System.out.println(a);*/
		/**
		 * 
		 * 
		 */
		
	}
}
       