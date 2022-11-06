import java.util.Scanner;
public class If02 {
	public static void main(String[] args) {
		//编写一个程序，可以输入人的年龄， 如果该人的年龄大于18随，
		//则输出“你年龄大于18，要对自己的行为负责，送入监狱”
		//否则输出"你的年龄不大这次放过你"
		//思路分析 
		//1接受输入的年龄，应该定义一个Scanne 对象
		//2吧年龄保存到一个int age
		//3使用if-else(否则） 判断 输出对应信息
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入年龄");
		//吧年龄保存到一个int age
		int age = myScanner.nextInt();
		//使用 if-else判断 输出对应信息
		if(age>18) {
			System.out.println("你年龄大于18，要对自己的行为负责，送入监狱");
		} 
		else {//双分支
			System.out.println("你的年龄不大这次放过你");
		}
		System.out.println("程序继续....");
	}
}