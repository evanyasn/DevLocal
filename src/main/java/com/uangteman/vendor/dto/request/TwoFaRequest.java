/**
 * 
 */
package com.uangteman.vendor.dto.request;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author maryosandoz
 *
 */
public class TwoFaRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("to")
	private String destination;
	@JsonProperty("from")
	private String from;
	@JsonProperty("applicationId")
	private String applicationId;
	@JsonProperty("messageId")
	private String messageId;

	public TwoFaRequest() {
		super();
	}

	public TwoFaRequest(String destination, String from, String applicationId, String messageId) {
		super();
		this.destination = destination;
		this.from = from;
		this.applicationId = applicationId;
		this.messageId = messageId;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

}
