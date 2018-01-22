package com.uangteman.vendor.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.uangteman.vendor.model.constant.EmailVerifyReasonType;
import com.uangteman.vendor.model.constant.EmailVerifyResultType;

public class EmailAddressLookupResponse {

	@JsonProperty("result")
	private EmailVerifyResultType result;
	@JsonProperty("reason")
	private EmailVerifyReasonType reason;
	@JsonProperty("status")
	private Boolean status;
	@JsonProperty("email_address")
	private String emailAddress;

	public EmailAddressLookupResponse() {
		super();
		this.result = EmailVerifyResultType.DELIVERABLE;
		this.reason = EmailVerifyReasonType.ACCEPTED_EMAIL;
		this.status = true;
		this.emailAddress = "test@uangteman.com";
	}

	public EmailAddressLookupResponse(EmailVerifyResultType result, EmailVerifyReasonType reason, Boolean status,
			String emailAddress) {
		super();
		this.result = result;
		this.reason = reason;
		this.status = status;
		this.emailAddress = emailAddress;
	}

	public EmailVerifyResultType getResult() {
		return result;
	}

	public void setResult(EmailVerifyResultType result) {
		this.result = result;
	}

	public EmailVerifyReasonType getReason() {
		return reason;
	}

	public void setReason(EmailVerifyReasonType reason) {
		this.reason = reason;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public static EmailAddressLookupResponse verified() {
		return new EmailAddressLookupResponse();
	}

}
