package com.uangteman.vendor.service;

/**
 * @author maryosandoz
 *
 */
public interface TwoFaService {

	public void registerNewApplication();

	public void registerNewMessageTemplate();

	public void sendPinUsingSms();

	public void verifyPin();
}
