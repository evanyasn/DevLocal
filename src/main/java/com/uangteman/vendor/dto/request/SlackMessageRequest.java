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
public class SlackMessageRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("text")
	private String text;
	@JsonProperty("channel")
	private String channel;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

}
