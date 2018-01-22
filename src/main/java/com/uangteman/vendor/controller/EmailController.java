/**
 * 
 */
package com.uangteman.vendor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uangteman.vendor.constant.ConstantRestApi;
import com.uangteman.vendor.dto.request.EmailRequest;
import com.uangteman.vendor.dto.response.EmailAddressLookupResponse;
import com.uangteman.vendor.dto.response.EmailSentResponse;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author maryosandoz
 *
 */
@RestController
@RequestMapping(value = ConstantRestApi.API_EMAIL_PREFIX)
public class EmailController {

	@ApiOperation(value = "Lookup single email address", notes = "Allow you to ensure email address validity")
	@ApiResponses(value = {
			@ApiResponse(code = ConstantRestApi.RESPONSE_CODE_SUCCESS, message = ConstantRestApi.RESPONSE_MESSAGE_SUCCESS),
			@ApiResponse(code = ConstantRestApi.RESPONSE_CODE_INTERNAL_SERVER_ERROR, message = ConstantRestApi.RESPONSE_MESSAGE_INTERNAL_SERVER_ERROR) })
	@GetMapping(value = ConstantRestApi.ENDPOINT_SUFFIX_LOOKUP + "/{email}")
	public EmailAddressLookupResponse emailLookup(@PathVariable("email") String emailAddress) {
		return EmailAddressLookupResponse.verified();
	}

	@ApiOperation(value = "Send single email", notes = "Allow you to send single email to single destination email address")
	@ApiResponses(value = {
			@ApiResponse(code = ConstantRestApi.RESPONSE_CODE_SUCCESS, message = ConstantRestApi.RESPONSE_MESSAGE_SUCCESS),
			@ApiResponse(code = ConstantRestApi.RESPONSE_CODE_INTERNAL_SERVER_ERROR, message = ConstantRestApi.RESPONSE_MESSAGE_INTERNAL_SERVER_ERROR) })
	@PostMapping(value = ConstantRestApi.ENDPOINT_SUFFIX_SEND)
	public EmailSentResponse emailSend(@RequestBody EmailRequest emailRequest) {
		return EmailSentResponse.ok();
	}
}
