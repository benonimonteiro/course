package enums;

public enum OrderStatus {

	PENDING_PAYMENT(0),
	PROCESSING(1),
	SHIPPED(2),
	DELIVERED(3);
	
	private Integer id;
	
	OrderStatus(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
}
