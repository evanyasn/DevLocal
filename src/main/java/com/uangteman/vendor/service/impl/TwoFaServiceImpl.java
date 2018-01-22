/**
 * 
 */
package com.uangteman.vendor.service.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.uangteman.vendor.service.TwoFaService;

/**
 * @author maryosandoz
 *
 */
@Service("twoFaService")
@Transactional
public class TwoFaServiceImpl implements TwoFaService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.uangteman.vendor.service.TwoFaService#registerNewApplication()
	 */
	@Override
	public void registerNewApplication() {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.uangteman.vendor.service.TwoFaService#registerNewMessageTemplate()
	 */
	@Override
	public void registerNewMessageTemplate() {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.uangteman.vendor.service.TwoFaService#sendPinUsingSms()
	 */
	@Override
	public void sendPinUsingSms() {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.uangteman.vendor.service.TwoFaService#verifyPin()
	 */
	@Override
	public void verifyPin() {
		// TODO Auto-generated method stub

	}

}
