package com.uangteman.vendor.service;

import com.uangteman.vendor.dto.response.PersonalIdLookupResponse;

public interface PersonalIdService {

	public PersonalIdLookupResponse lookupPersonalId(String nik);

}
