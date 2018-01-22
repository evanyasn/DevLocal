/**
 * 
 */
package com.uangteman.vendor.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.uangteman.vendor.model.constant.StatusCode;

/**
 * @author maryosandoz
 *
 */
public class SmsSentResponse {

	@JsonProperty("to")
	private String destination;
	@JsonProperty("status")
	private StatusCode status;
	@JsonProperty("message_id")
	private String messageId;

	public SmsSentResponse() {
		super();
		this.destination = "";
		this.status = StatusCode.DELIVERED_TO_HANDSET;
		this.messageId = null;
	}

	public SmsSentResponse(String destination, StatusCode status, String message, String messageId) {
		super();
		this.destination = destination;
		this.status = status;
		this.messageId = messageId;
	}

	public static SmsSentResponse sent() {
		return new SmsSentResponse();
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public StatusCode getStatus() {
		return status;
	}

	public void setStatus(StatusCode status) {
		this.status = status;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

}
