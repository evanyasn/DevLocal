package com.uangteman.vendor.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmailSentResponse {

	@JsonProperty("to")
	private String destination;
	@JsonProperty("message_id")
	private String messageId;
	@JsonProperty("status")
	private boolean status;
	@JsonProperty("error_message")
	private String errorMessage;

	public EmailSentResponse() {
		super();
	}

	public EmailSentResponse(String destination, String messageId, boolean status, String errorMessage) {
		super();
		this.destination = destination;
		this.messageId = messageId;
		this.status = status;
		this.errorMessage = errorMessage;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public static EmailSentResponse ok() {
		return new EmailSentResponse("emaildummy@email.com", "g7fh2", true, "");
	}

}
