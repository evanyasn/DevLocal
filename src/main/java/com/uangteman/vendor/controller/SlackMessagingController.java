/**
 * 
 */
package com.uangteman.vendor.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uangteman.vendor.constant.ConstantRestApi;
import com.uangteman.vendor.dto.request.SlackMessageRequest;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author maryosandoz
 *
 */

@RestController
@RequestMapping(value = ConstantRestApi.API_SLACK_SEND_NOTIFICATION)
public class SlackMessagingController {

	@ApiOperation(value = "Send notification to one Slack channel", notes = "Allow you to send notification to specified channel in Slack ")
	@ApiResponses(value = {
			@ApiResponse(code = ConstantRestApi.RESPONSE_CODE_SUCCESS, message = ConstantRestApi.RESPONSE_MESSAGE_SUCCESS),
			@ApiResponse(code = ConstantRestApi.RESPONSE_CODE_INTERNAL_SERVER_ERROR, message = ConstantRestApi.RESPONSE_MESSAGE_INTERNAL_SERVER_ERROR) })
	@PostMapping(value = ConstantRestApi.ENDPOINT_SUFFIX_SEND)
	public boolean sendSlackNotificaiton(@RequestBody SlackMessageRequest slackMessageRequest) {
		return true;
	}

}
