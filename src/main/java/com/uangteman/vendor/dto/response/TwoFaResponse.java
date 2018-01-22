/**
 * 
 */
package com.uangteman.vendor.dto.response;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author maryosandoz
 *
 */
public class TwoFaResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6192477014008405907L;

	@JsonProperty("pin_id")
	private String pinId;
	@JsonProperty("to")
	private String destination;
	@JsonProperty("status")
	private boolean deliveryStatus;

	public TwoFaResponse() {
		super();
	}

	public TwoFaResponse(String pinId, String destination, boolean deliveryStatus) {
		super();
		this.pinId = pinId;
		this.destination = destination;
		this.deliveryStatus = deliveryStatus;
	}

	public String getPinId() {
		return pinId;
	}

	public void setPinId(String pinId) {
		this.pinId = pinId;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public boolean isDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(boolean deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public static TwoFaResponse sent() {
		return new TwoFaResponse("h47f9jdf", "085270832134", true);
	}

}
