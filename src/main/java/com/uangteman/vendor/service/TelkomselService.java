package com.uangteman.vendor.service;

import com.uangteman.vendor.dto.response.TelkomselSubscriberResponse;
import com.uangteman.vendor.model.TelkomselSubscriber;

public interface TelkomselService {

	TelkomselService save(TelkomselService telkomselService);

	TelkomselSubscriber save(TelkomselSubscriber telkomselSubscriber);

	public boolean saveLogs();

	public TelkomselSubscriberResponse verify(String msisdn);
}
