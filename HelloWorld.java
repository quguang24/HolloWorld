// 演示转义字符的使用
public class HelloWorld {
	public static void main(String[] args) {
		//单行注释
		/* 多行注释  
		/**
		 * 文档注释
		 * @author 曲广
		 */
//		\t 空格符号
		System.out.println("北京\t田径\t上海");
//      \n 换行符号		
		System.out.println("北京\n田径\n上海");
//      \\ 显示一个\
		System.out.println("北京\\田径\\上海");
//      \"
		System.out.println("老安说:\"要好好学JAVA，有前途\".");
//      \'		
		System.out.println("老安说:\'要好好学JAVA，有前途\'.");
//     \r:一个回车  1：输出
		System.out.println("北京教育\r上海");
		/*
		 * 
		 */
		System.out.println("书名\t作者\t价格\t销量\n三国\t罗贯中\t120\t1000");
	}
}

