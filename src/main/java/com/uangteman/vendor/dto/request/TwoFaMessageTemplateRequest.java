package com.uangteman.vendor.dto.request;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author maryosandoz
 *
 */
public class TwoFaMessageTemplateRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("applicationId")
	private String applicationId;
	@JsonProperty("pinType")
	private String pinType;
	@JsonProperty("pinPlaceHolder")
	private String pinPlaceHolder;
	@JsonProperty("messageText")
	private String messageText;
	@JsonProperty("pinLength")
	private String pinLength;
	@JsonProperty("senderId")
	private String senderId;
	@JsonProperty("language")
	private String language;
	@JsonProperty("repeatDtmf")
	private String repeatDtmf;
	@JsonProperty("speechRate")
	private int speechRate;

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getPinType() {
		return pinType;
	}

	public void setPinType(String pinType) {
		this.pinType = pinType;
	}

	public String getPinPlaceHolder() {
		return pinPlaceHolder;
	}

	public void setPinPlaceHolder(String pinPlaceHolder) {
		this.pinPlaceHolder = pinPlaceHolder;
	}

	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	public String getPinLength() {
		return pinLength;
	}

	public void setPinLength(String pinLength) {
		this.pinLength = pinLength;
	}

	public String getSenderId() {
		return senderId;
	}

	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getRepeatDtmf() {
		return repeatDtmf;
	}

	public void setRepeatDtmf(String repeatDtmf) {
		this.repeatDtmf = repeatDtmf;
	}

	public int getSpeechRate() {
		return speechRate;
	}

	public void setSpeechRate(int speechRate) {
		this.speechRate = speechRate;
	}

}
