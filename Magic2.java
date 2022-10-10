public class Magic2 {
	public static void main(String[] argas) {
    int myNumber=1;
    // myNumber使用原始编号
    int stepOne=myNumber*myNumber;
    int stepTwo=stepOne+myNumber;
    int stepThree=stepTwo/myNumber;
    int stepFour=stepThree+17;
    int stepFive=stepFour-myNumber;
    int stepSix=stepFive/6;
    System.out.println(stepSix);
  }
}