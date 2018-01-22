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
public class SmsRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty(value = "destination")
	private String destination;
	@JsonProperty(value = "from")
	private String from;
	@JsonProperty(value = "text")
	private String text;
	@JsonProperty(value = "smsSource")
	private String smsSource;

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

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getSmsSource() {
		return smsSource;
	}

	public void setSmsSource(String smsSource) {
		this.smsSource = smsSource;
	}

}
