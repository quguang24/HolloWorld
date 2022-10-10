public class Magic {
	public static void main(String[] args) {
	int myNumder = 15;
	int magicNumber = myNumder * myNumder;
	magicNumber += myNumder;
    magicNumber /= myNumder;
	magicNumber += 17;
    magicNumber -= myNumder;
    magicNumber /= 6;
	System.out.println(magicNumber);
	}
}