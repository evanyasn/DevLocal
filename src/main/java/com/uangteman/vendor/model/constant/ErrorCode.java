/**
 * 
 */
package com.uangteman.vendor.model.constant;

/**
 * @author maryosandoz
 *
 */
public enum ErrorCode {

	NO_ERROR(0), EC_UNKNOWN_SUBSCRIBER(1);

	private int value;

	private ErrorCode(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
