/**
 * 
 */
package com.uangteman.vendor.model.constant;

/**
 * @author maryosandoz
 *
 */
public enum StatusCode {

	DELIVERED_TO_HANDSET(5), PENDING_WAITING_DELIVERY(3), PENDING_ENDROUTE(7), DELIVERED_TO_OPERATOR(
			2), PENDING_ACCEPTED(26), UNDELIVERABLE_REJECTED_OPERATOR(4);

	private int value;

	private StatusCode(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
