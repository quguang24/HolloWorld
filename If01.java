
import java.util.Scanner;
public class If01 {
	public static void main(String[] args) {
		//编写一个程序，可以输入人的年龄， 如果该人的年龄大于18随，
		//则输出“你年龄大于18，要对自己的行为负责，送入监狱”
		//
		//思路分析 接受输入的年龄，应该定义一个Scanne 对象
		//吧年龄保存到一个int age
		//使用if 判断 输出对应信息
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入年龄");
		//吧年龄保存到一个int age
		int age = myScanner.nextInt();
		if(age>18) {
			System.out.println("你年龄大于18，要对自己的行为负责，送入监狱");
		}
		System.out.println("程序继续....");
	}
}