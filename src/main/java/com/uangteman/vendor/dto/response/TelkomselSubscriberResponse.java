package com.uangteman.vendor.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TelkomselSubscriberResponse {

	@JsonProperty("status")
	private boolean status;
	@JsonProperty("message")
	private String message;

	public TelkomselSubscriberResponse() {
		super();
		this.status = true;
		this.message = "";
	}

	public TelkomselSubscriberResponse(boolean status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
