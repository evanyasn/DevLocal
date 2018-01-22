package com.uangteman.vendor.constant;

public class ConstantRestApi {
	public static final String API_PATH = ""; // v1, v2 and ect
	public static final String API_VENDOR = API_PATH + "/vendor";
	public static final String API_MASTER_PREFIX = "/master";

	/**
	 * SMS
	 */
	public static final String API_SMS_PREFIX = API_VENDOR + "/sms";

	/**
	 * IVR
	 */
	public static final String API_IVR_PREFIX = API_VENDOR + "/ivr";

	/**
	 * EMAIL
	 */
	public static final String API_EMAIL_PREFIX = API_VENDOR + "/email";

	/**
	 * MSISDN
	 */
	public static final String API_MSISDN_PREFIX = API_VENDOR + "/msisdn";

	/**
	 * PERSONAL ID
	 */
	public static final String API_PERSONALID_PREFIX = API_VENDOR + "/personalid";

	/**
	 * SLACK
	 */
	public static final String API_SLACK_SEND_NOTIFICATION = API_VENDOR + "/slack";

	/**
	 * IPISP
	 */
	public static final String API_IP_ADDRESS_ISP_PREFIX = API_VENDOR + "/ipisp";

	/**
	 * TELKOMSEL VERIFY SUBSCRIBER
	 */
	public static final String API_TELKOMSEL_PREFIX = API_VENDOR + "/telkomsel";

	/**
	 * MASTER TEMPLATE
	 */
	public static final String API_MASTER_TEMPLATE = API_PATH + API_MASTER_PREFIX + "/template";

	/**
	 * PIN
	 */
	public static final String API_TWO_FA_PREFIX = API_VENDOR + "/2fa";

	/**
	 * SUFFIX ENDPOINTS
	 */
	public static final String ENDPOINT_SUFFIX_SAVE = "/save";
	public static final String ENDPOINT_SUFFIX_DELETE = "/delete";
	public static final String ENDPOINT_SUFFIX_SEARCH = "/search";
	public static final String ENDPOINT_SUFFIX_SEND = "/send";
	public static final String ENDPOINT_SUFFIX_CHECK_BALANCE = "/check-balance";
	public static final String ENDPOINT_SUFFIX_LOOKUP = "/lookup";
	public static final String ENDPOINT_SUFFIX_GET = "/get";
	public static final String ENDPOINT_SUFFIX_VERIFY = "/verify";
	public static final String ENDPOINT_SUFFIX_PIN = "/pin";
	public static final String ENDPOINT_SUFFIX_APPLICATION = "/application";
	public static final String ENDPOINT_SUFFIX_MESSAGE_TEMPLATE = "/message";
	public static final String ENDPOINT_SUFFIX_RESEND = "/resend";

	/**
	 * REQUEST SOURCE SMS
	 */
	public static final String SOURCE_LINK = "link";
	public static final String SOURCE_DISBURSEMENT = "disbursement";
	public static final String SOURCE_REMINDER = "reminder";

	/**
	 * RESPONSE CODE
	 */
	public static final int RESPONSE_CODE_SUCCESS = 0;
	public static final int RESPONSE_CODE_DATA_NOT_FOUND = 2001;
	public static final int RESPONSE_CODE_INTERNAL_SERVER_ERROR = 2002;

	public static final String RESPONSE_MESSAGE_SUCCESS = "SUCCESS";
	public static final String RESPONSE_MESSAGE_DATA_NOT_FOUND = "DATA NOT FOUND";
	public static final String RESPONSE_MESSAGE_INTERNAL_SERVER_ERROR = "INTERNAL SERVER ERROR";

}
