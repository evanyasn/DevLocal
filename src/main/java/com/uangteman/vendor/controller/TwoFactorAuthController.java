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
import com.uangteman.vendor.dto.request.RegisterApplicationRequest;
import com.uangteman.vendor.dto.request.TwoFaMessageTemplateRequest;
import com.uangteman.vendor.dto.request.TwoFaRequest;
import com.uangteman.vendor.dto.response.TwoFaResponse;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author maryosandoz
 *
 */
@RestController
@RequestMapping(value = ConstantRestApi.API_TWO_FA_PREFIX)
public class TwoFactorAuthController {
	@ApiOperation(value = "Send pin for two factor authentication using SMS", notes = "Allow you to send authentication pin to customer")
	@ApiResponses(value = {
			@ApiResponse(code = ConstantRestApi.RESPONSE_CODE_SUCCESS, message = ConstantRestApi.RESPONSE_MESSAGE_SUCCESS),
			@ApiResponse(code = ConstantRestApi.RESPONSE_CODE_INTERNAL_SERVER_ERROR, message = ConstantRestApi.RESPONSE_MESSAGE_INTERNAL_SERVER_ERROR) })
	@PostMapping(value = ConstantRestApi.ENDPOINT_SUFFIX_PIN + ConstantRestApi.ENDPOINT_SUFFIX_SEND)
	public TwoFaResponse sendPin(@RequestBody TwoFaRequest twoFaRequest) {
		return TwoFaResponse.sent();
	}

	@ApiOperation(value = "Resend pin for two factor authentication using SMS", notes = "Allow you to send authentication pin to customer")
	@ApiResponses(value = {
			@ApiResponse(code = ConstantRestApi.RESPONSE_CODE_SUCCESS, message = ConstantRestApi.RESPONSE_MESSAGE_SUCCESS),
			@ApiResponse(code = ConstantRestApi.RESPONSE_CODE_INTERNAL_SERVER_ERROR, message = ConstantRestApi.RESPONSE_MESSAGE_INTERNAL_SERVER_ERROR) })
	@GetMapping(value = ConstantRestApi.ENDPOINT_SUFFIX_PIN + "{pinId}" + ConstantRestApi.ENDPOINT_SUFFIX_RESEND)
	public TwoFaResponse resendPin(@PathVariable("pinId") String pinId) {
		return TwoFaResponse.sent();
	}

	@ApiOperation(value = "Verify pin for two factor authentication from customer", notes = "Allow you to verify pin from customer")
	@ApiResponses(value = {
			@ApiResponse(code = ConstantRestApi.RESPONSE_CODE_SUCCESS, message = ConstantRestApi.RESPONSE_MESSAGE_SUCCESS),
			@ApiResponse(code = ConstantRestApi.RESPONSE_CODE_INTERNAL_SERVER_ERROR, message = ConstantRestApi.RESPONSE_MESSAGE_INTERNAL_SERVER_ERROR) })
	@GetMapping(value = ConstantRestApi.ENDPOINT_SUFFIX_PIN + "{pinId}" + ConstantRestApi.ENDPOINT_SUFFIX_VERIFY)
	public TwoFaResponse verifyPin(@PathVariable("pinId") String pinId) {
		return TwoFaResponse.sent();
	}

	@ApiOperation(value = "Register new application for 2FA", notes = "Allow you to register new application for 2FA")
	@ApiResponses(value = {
			@ApiResponse(code = ConstantRestApi.RESPONSE_CODE_SUCCESS, message = ConstantRestApi.RESPONSE_MESSAGE_SUCCESS),
			@ApiResponse(code = ConstantRestApi.RESPONSE_CODE_INTERNAL_SERVER_ERROR, message = ConstantRestApi.RESPONSE_MESSAGE_INTERNAL_SERVER_ERROR) })
	@PostMapping(value = ConstantRestApi.ENDPOINT_SUFFIX_APPLICATION)
	public void registerApplication(@RequestBody RegisterApplicationRequest regApplicationRequest) {

	}

	@ApiOperation(value = "Register new message template for 2FA", notes = "Allow you to register new message template for 2FA")
	@ApiResponses(value = {
			@ApiResponse(code = ConstantRestApi.RESPONSE_CODE_SUCCESS, message = ConstantRestApi.RESPONSE_MESSAGE_SUCCESS),
			@ApiResponse(code = ConstantRestApi.RESPONSE_CODE_INTERNAL_SERVER_ERROR, message = ConstantRestApi.RESPONSE_MESSAGE_INTERNAL_SERVER_ERROR) })
	@PostMapping(value = ConstantRestApi.ENDPOINT_SUFFIX_MESSAGE_TEMPLATE)
	public void registerMessageTemplate(@RequestBody TwoFaMessageTemplateRequest twoFaTempMsgRequest) {

	}
}
