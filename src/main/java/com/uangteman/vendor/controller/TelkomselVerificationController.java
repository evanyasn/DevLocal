/**
 * 
 */
package com.uangteman.vendor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uangteman.vendor.constant.ConstantRestApi;
import com.uangteman.vendor.dto.response.TelkomselSubscriberResponse;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author maryosandoz
 *
 */
@RestController
@RequestMapping(value = ConstantRestApi.API_TELKOMSEL_PREFIX)
public class TelkomselVerificationController {
	@ApiOperation(value = "Lookup msisdn number if the number is Telkomsel", notes = "Allow you to verify and check if the msisdn is Telkomsel")
	@ApiResponses(value = {
			@ApiResponse(code = ConstantRestApi.RESPONSE_CODE_SUCCESS, message = ConstantRestApi.RESPONSE_MESSAGE_SUCCESS),
			@ApiResponse(code = ConstantRestApi.RESPONSE_CODE_DATA_NOT_FOUND, message = ConstantRestApi.RESPONSE_MESSAGE_DATA_NOT_FOUND),
			@ApiResponse(code = ConstantRestApi.RESPONSE_CODE_INTERNAL_SERVER_ERROR, message = ConstantRestApi.RESPONSE_MESSAGE_INTERNAL_SERVER_ERROR) })
	@GetMapping(value = ConstantRestApi.ENDPOINT_SUFFIX_VERIFY + "/{msisdn}")
	public TelkomselSubscriberResponse isTelkomselSubsriber(@PathVariable("msisdn") String msisdn) {
		return new TelkomselSubscriberResponse();
	}

}
