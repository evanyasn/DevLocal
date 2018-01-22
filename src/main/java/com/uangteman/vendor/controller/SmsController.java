package com.uangteman.vendor.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uangteman.vendor.constant.ConstantRestApi;
import com.uangteman.vendor.dto.request.SmsRequest;
import com.uangteman.vendor.dto.response.NumberLookupResponse;
import com.uangteman.vendor.dto.response.SmsSentResponse;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = ConstantRestApi.API_SMS_PREFIX)
public class SmsController {

	@ApiOperation(value = "Single textual message", notes = "Allow you to send single textual message to one destination address")
	@ApiResponses(value = {
			@ApiResponse(code = ConstantRestApi.RESPONSE_CODE_SUCCESS, message = ConstantRestApi.RESPONSE_MESSAGE_SUCCESS),
			@ApiResponse(code = ConstantRestApi.RESPONSE_CODE_INTERNAL_SERVER_ERROR, message = ConstantRestApi.RESPONSE_MESSAGE_INTERNAL_SERVER_ERROR) })
	@PostMapping(value = ConstantRestApi.ENDPOINT_SUFFIX_SEND)
	public SmsSentResponse sendSms(@RequestBody SmsRequest smsRequest) {
		return SmsSentResponse.sent();
	}

	@ApiOperation(value = "Lookup single mobile number", notes = "Allow you to ensure mobile number validity")
	@ApiResponses(value = {
			@ApiResponse(code = ConstantRestApi.RESPONSE_CODE_SUCCESS, message = ConstantRestApi.RESPONSE_MESSAGE_SUCCESS),
			@ApiResponse(code = ConstantRestApi.RESPONSE_CODE_INTERNAL_SERVER_ERROR, message = ConstantRestApi.RESPONSE_MESSAGE_INTERNAL_SERVER_ERROR) })
	@PostMapping(value = ConstantRestApi.ENDPOINT_SUFFIX_LOOKUP)
	public NumberLookupResponse numberLookup(@RequestBody SmsRequest smsRequest) {
		return NumberLookupResponse.ok();
	}

}
