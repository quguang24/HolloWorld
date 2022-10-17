public class Store2 {
	String productType;
	
	public Store2(String product) {
      
		productType = product;
	}
	public void advertise() {
		System.out.println("Come spend some money!");
		System.out.println("Selling " + productType + "!");
	}
	public static void main(String[] args) {
	  Store lemonadeStand = new Store("Lemonade");
	  lemonadeStand.advertise();
	  lemonadeStand.advertise();
	  lemonadeStand.advertise();
	}
}