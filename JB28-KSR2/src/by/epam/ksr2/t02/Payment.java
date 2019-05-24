package by.epam.ksr2.t02;

public class Payment {
	
	private Good goods[] = new Good[10];//размер корзины - 10 позиций
	private int positionOrder;
	private int totalQuantity;
	private double totalPrice;
	
	public Payment() {   //конструктор новой корзины
		positionOrder=0;
		totalQuantity=0;
		totalPrice=0;
	}
	
	
	public Good[] getGoods() {
		return goods;
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}
	
	public int getTotalQuantity() {
		return totalQuantity;
	}
	
	public int getPositionOrder(){
		return positionOrder;
	}
	
	public void addToPayment(Good good) {
		if (positionOrder==goods.length) {
			System.out.println("Невозможно добавить товар - корзина заполнена");
		}else {
			goods[positionOrder]=good;
			totalPrice += good.positionCost();
			totalQuantity+= good.getQuantity();
			System.out.println("Товар "+good.name+" цвета "+good.color+ " в количестве "+good.quantity+" шт. успешно добавлен в корзину");
			positionOrder++;
		}
	}
	
	
	
	public void removeFromPayment(Good good) {
		if(positionOrder==0) {
			System.out.println("Корзина пуста, нечего удалять");
		}else {
		
			for(int i=0; i<positionOrder; i++) {
				if (goods[i].equals(good)) {
				int tempPos=(positionOrder-1);
				totalPrice -= goods[i].positionCost();
				totalQuantity -= goods[i].getQuantity();
				goods[i]=goods[tempPos];
				clearPosition(goods[tempPos]);
				System.out.println("Товар "+good.name+" успешно удален из корзины"+i);
				positionOrder--;
				}
			
			}
		}
	}
	
	public void clearPosition(Good good) {
		good = null;
	}
	
}
