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
public class EmailRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("to")
	private String destination;
	@JsonProperty("subject")
	private String subject;
	@JsonProperty("message_id")
	private String messageId;
	@JsonProperty("attachment")
	private String attachment;
	@JsonProperty("email_source")
	private String emailSource;

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getAttachment() {
		return attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public String getEmailSource() {
		return emailSource;
	}

	public void setEmailSource(String emailSource) {
		this.emailSource = emailSource;
	}

}
