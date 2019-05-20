package by.epam.ksr2.t02;

public class Main {

	public static void main(String[] args) {
		Payment order1 = new Payment();
		
		
		Good position1 = new Good("table", 45.5, "red", 4);
		Good position2 = new Good("Chair", 13.8, "green", 1);
		Good position3 = new Good("Chair", 13.8, "blue", 3);
		Good position4 = new Good("Chair", 13.8, "red", 2);
		Good position5 = new Good("Chair", 13.8, 1);
		Good position6 = new Good("Eyewear", 186, 1);
		Good position7 = new Good("Watches", 5, 1);
		
		order1.addToPayment(position1);
		order1.addToPayment(position2);
		order1.addToPayment(position3);
		order1.addToPayment(position4);
		order1.addToPayment(position5);
		order1.addToPayment(position6);
		order1.addToPayment(position7);
		order1.removeFromPayment(position7);
		
		
		
		System.out.println();
		System.out.println("Стоимость товаров в корзине: "+order1.getTotalPrice());
		System.out.println("Всего товаров в корзине: "+order1.getTotalQuantity());
		
		
		
		

	}

}
