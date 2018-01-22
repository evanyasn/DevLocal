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
public class RegisterApplicationRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("name")
	private String applicationName;
	@JsonProperty("name")
	private Map<String, String> configuration;
	@JsonProperty("enabled")
	private boolean enabled;

	public RegisterApplicationRequest() {
		super();
	}

	public RegisterApplicationRequest(String applicationName, Map<String, String> configuration, boolean enabled) {
		super();
		this.applicationName = applicationName;
		this.configuration = configuration;
		this.enabled = enabled;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public Map<String, String> getConfiguration() {
		return configuration;
	}

	public void setConfiguration(Map<String, String> configuration) {
		this.configuration = configuration;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
