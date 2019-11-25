package application;

import java.util.Date;
import java.util.Locale;

import entities.Order;
import enums.OrderStatus;

public class Program15 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT, null);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
