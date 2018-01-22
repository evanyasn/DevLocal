/**
 * 
 */
package com.uangteman.vendor.dto.request;

import java.io.Serializable;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author maryosandoz
 *
 */
public class EmailSendgridRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("personalizations")
	private Map<String, String> personalization;
	@JsonProperty("subject")
	private String subject;
	@JsonProperty("from")
	private Map<String, String> from;
	@JsonProperty("content")
	private Map<String, String> messageContent;

	public Map<String, String> getPersonalization() {
		return personalization;
	}

	public void setPersonalization(Map<String, String> personalization) {
		this.personalization = personalization;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Map<String, String> getFrom() {
		return from;
	}

	public void setFrom(Map<String, String> from) {
		this.from = from;
	}

	public Map<String, String> getMessageContent() {
		return messageContent;
	}

	public void setMessageContent(Map<String, String> messageContent) {
		this.messageContent = messageContent;
	}

}
