package by.epam.ksr2.t02;

public class Main {

	public static void main(String[] args) {
		Payment order1 = new Payment();
		
		
		Good good1 = new Good("table", 45.5, "red", 4);
		Good good2 = new Good("Chair", 13.8, "green", 1);
		Good good3 = new Good("Chair", 13.8, "blue", 3);
		Good good4 = new Good("Chair", 13.8, "red", 2);
		Good good5 = new Good("Chair", 13.8, 1);
		Good good6 = new Good("Eyewear", 186, 1);
		Good good7 = new Good("Watches", 5, 1);
		
		order1.addToPayment(good1);
		order1.addToPayment(good2);
		order1.addToPayment(good3);
		order1.addToPayment(good4);
		order1.addToPayment(good5);
		order1.addToPayment(good6);
		order1.addToPayment(good7);
		order1.removeFromPayment(good7);
		
		
		
		System.out.println();
		System.out.println("Стоимость товаров в корзине: "+order1.getTotalPrice());
		System.out.println("Всего товаров в корзине: "+order1.getTotalQuantity());
		
		
		
		

	}

}
