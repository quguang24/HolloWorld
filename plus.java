/*程序中+号的使用plus
1.当左右两边都是数值型的时候 则做加法运算；
2当左右两边有一方为：”字符串“的时候 则做拼接预算；
3预算程序是从左到右运算；
System.out.println(100+98);//198
System.out.println("100"+98);//10098

System.out.println(100+3+"hello");//103hello
System.out.println("hello"+100+3);//hello1003
*/
public class plus {
	public static void main(String[] args) {
		System.out.println(100+98);//198
		System.out.println("100"+98);//10098

		System.out.println(100+3+"hello");//103hello
		System.out.println("hello"+100+3);//hello1003
		
	}
}