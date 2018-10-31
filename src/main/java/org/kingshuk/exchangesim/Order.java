package org.kingshuk.exchangesim;

import java.util.Objects;

public class Order {
	private final Side side;
	private final int quantity;
	private final OrderType type;
	
	private long price;
	
	public Order (Side side, int quantity, OrderType type) {
		Objects.requireNonNull(side);
		Objects.requireNonNull(type);
		
		this.side = side;
		if (quantity <= 0) {
			throw new IllegalArgumentException ("quantity must be greater than zero");
		}
		this.quantity = quantity;
		this.type = type;
	}

}
