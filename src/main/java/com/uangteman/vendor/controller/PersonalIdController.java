/**
 * 
 */
package com.uangteman.vendor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uangteman.vendor.constant.ConstantRestApi;
import com.uangteman.vendor.dto.response.PersonalIdLookupResponse;
import com.uangteman.vendor.service.PersonalIdService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author maryosandoz
 *
 */

@RestController
@RequestMapping(value = ConstantRestApi.API_PERSONALID_PREFIX)
public class PersonalIdController {

	@Autowired
	public PersonalIdService service;

	@ApiOperation(value = "Lookup single personal id number", notes = "Allow you to ensure personal id number validity")
	@ApiResponses(value = {
			@ApiResponse(code = ConstantRestApi.RESPONSE_CODE_SUCCESS, message = ConstantRestApi.RESPONSE_MESSAGE_SUCCESS),
			@ApiResponse(code = ConstantRestApi.RESPONSE_CODE_INTERNAL_SERVER_ERROR, message = ConstantRestApi.RESPONSE_MESSAGE_INTERNAL_SERVER_ERROR) })
	@GetMapping(value = ConstantRestApi.ENDPOINT_SUFFIX_LOOKUP + "/{nik}")
	public PersonalIdLookupResponse personalIdLookup(@PathVariable("nik") String nik) {
		return service.lookupPersonalId(nik);
	}

}
