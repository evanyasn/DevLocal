package com.uangteman.vendor.model.constant;

/**
 * 
 * @author maryosandoz
 *
 *         INVALID_EMAIL = Specified email is not a valid email address syntax,
 * 
 *         INVALID_DOMAIN = Domain for email does not exist,
 * 
 *         REJECTED_EMAIL = Email address was rejected by the SMTP server, email
 *         address does not exist,
 * 
 *         ACCEPTED_EMAIL = Email address was accepted by the SMTP server,
 * 
 *         LOW_QUALITY = Email address has quality issues that may make it a
 *         risky or low-value address,
 * 
 *         LOW_DERIVELABILITY = Email address appears to be deliverable, but
 *         deliverability cannot be guaranteed,
 * 
 *         NO_CONNECT = Could not connect to SMTP server,
 * 
 *         TIMEOUT = SMTP session timed out,
 * 
 *         INVALID_SMTP = SMTP server returned an unexpected/invalid response,
 * 
 *         UNAVAILABLE_SMTP = SMTP server was unavailable to process our
 *         request,
 * 
 *         UNEXPECTED_ERROR = An unexpected error has occurred
 */
public enum EmailVerifyReasonType {
	INVALID_EMAIL, INVALID_DOMAIN, REJECTED_EMAIL, ACCEPTED_EMAIL, LOW_QUALITY, LOW_DERIVELABILITY, NO_CONNECT, TIMEOUT, INVALID_SMTP, UNAVAILABLE_SMTP, UNEXPECTED_ERROR
}
