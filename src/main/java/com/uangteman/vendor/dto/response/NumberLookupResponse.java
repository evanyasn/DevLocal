package com.uangteman.vendor.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.uangteman.vendor.model.constant.ErrorCode;
import com.uangteman.vendor.model.constant.StatusCode;

public class NumberLookupResponse {

	@JsonProperty("destination")
	private String destination;
	@JsonProperty("mcc_mnc")
	private String mccMnc;
	@JsonProperty("imsi")
	private String imsi;
	@JsonProperty("ported")
	private Boolean ported;
	@JsonProperty("roaming")
	private Boolean roaming;
	@JsonProperty("status")
	private StatusCode status;
	@JsonProperty("error_code")
	private ErrorCode error;

	public NumberLookupResponse() {
		super();
		this.setDestination("");
		this.setMccMnc("");
		this.setImsi("");
		this.setPorted(false);
		this.setRoaming(false);
		this.setStatus(StatusCode.DELIVERED_TO_HANDSET);
		this.setError(ErrorCode.NO_ERROR);
	}

	public static NumberLookupResponse ok() {
		return new NumberLookupResponse();
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getMccMnc() {
		return mccMnc;
	}

	public void setMccMnc(String mccMnc) {
		this.mccMnc = mccMnc;
	}

	public String getImsi() {
		return imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	public Boolean getPorted() {
		return ported;
	}

	public void setPorted(Boolean ported) {
		this.ported = ported;
	}

	public Boolean getRoaming() {
		return roaming;
	}

	public void setRoaming(Boolean roaming) {
		this.roaming = roaming;
	}

	public StatusCode getStatus() {
		return status;
	}

	public void setStatus(StatusCode status) {
		this.status = status;
	}

	public ErrorCode getError() {
		return error;
	}

	public void setError(ErrorCode error) {
		this.error = error;
	}

}
