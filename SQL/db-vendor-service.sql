-- LOGS_AFFILIATE_SMS_EMAIL_DISBURSEMENT --
CREATE TABLE `logs_aff_sms_email_disbursement` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `aff_user_id` varchar(64) NOT NULL COMMENT 'Relation Id from table affiliate_users',
  `process_datetime` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `is_email_retry` enum('Y','N') COLLATE utf8_unicode_ci NOT NULL DEFAULT 'N',
  `is_email_sent` enum('Y','N') COLLATE utf8_unicode_ci NOT NULL DEFAULT 'N',
  `is_sms_retry` enum('Y','N') COLLATE utf8_unicode_ci NOT NULL DEFAULT 'N',
  `is_sms_sent` enum('Y','N') COLLATE utf8_unicode_ci NOT NULL DEFAULT 'N',
  `retry_email_datetime` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `retry_sms_datetime` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` int(11) DEFAULT NULL COMMENT 'created_by => user_id from table provisioning users, set 0 if system who create the record',
  `updated_at` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` int(11) DEFAULT NULL COMMENT 'updated_by => user_id from table provisioning users, set 0 if system who create the record',
  PRIMARY KEY (`id`),
  KEY `aff_user_id` (`aff_user_id`),
  KEY `process_datetime` (`process_datetime`),
  KEY `is_email_retry` (`is_email_retry`),
  KEY `is_email_sent` (`is_email_sent`),
  KEY `is_sms_retry` (`is_sms_retry`),
  KEY `is_sms_sent` (`is_sms_sent`),
  KEY `created_at` (`created_at`),
  KEY `updated_at` (`updated_at`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- LOGS_KOKATTO --
CREATE TABLE `logs_kokatto` (
  `id` varchar(64) NOT NULL COMMENT 'SHA-256 Hash using datetime miliseconds + Instance(Server) name',
  `ref_id` varchar(28) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `loan_id` varchar(64) COLLATE utf8_unicode_ci NOT NULL COMMENT 'Relation Id from table loans',
  `sub_app` enum('1','2','3','4','5','6','7','8','9','10') COLLATE utf8_unicode_ci NOT NULL DEFAULT '6' COMMENT '1=hmin15, 2=hmin10,3=hmin5, 4=hmin3, 5=hmin2, 6=hmin1, 7=h0, 8=hplus1, 9=hplus2, 10=hplus3',
  `request_id` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `request_date` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `is_sent` enum('Y','N') COLLATE utf8_unicode_ci DEFAULT 'N',
  `response_date` datetime NULL DEFAULT NULL,
  `full_response` text COLLATE utf8_unicode_ci,
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` int(11) DEFAULT NULL COMMENT 'created_by => user_id from table provisioning users, set 0 if system who create the record',
  `updated_at` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` int(11) DEFAULT NULL COMMENT 'updated_by => user_id from table provisioning users, set 0 if system who create the record',
  PRIMARY KEY (`id`),
  KEY `ref_id` (`ref_id`),
  KEY `is_sent` (`is_sent`),
  KEY `created_at` (`created_at`),
  KEY `updated_at` (`updated_at`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- LOGS_CALLBACK --
CREATE TABLE `logs_callback` (
  `id` varchar(64) NOT NULL COMMENT 'SHA-256 Hash using datetime miliseconds + Instance(Server) name',
  `vendor_id` varchar(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `from_ip` varchar(15) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `on_date` datetime NULL DEFAULT '0000-00-00 00:00:00',
  `content` text COLLATE utf8_unicode_ci NOT NULL,
  `is_valid` enum('Y','N') COLLATE utf8_unicode_ci DEFAULT 'N',
  `description` varchar(128) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` int(11) DEFAULT NULL COMMENT 'created_by => user_id from table provisioning users, set 0 if system who create the record',
  `updated_at` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` int(11) DEFAULT NULL COMMENT 'updated_by => user_id from table provisioning users, set 0 if system who create the record',
  PRIMARY KEY (`id`),
  KEY `on_date` (`on_date`),
  KEY `created_at` (`created_at`),
  KEY `updated_at` (`updated_at`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- LOGS_SMS_LINK --
CREATE TABLE `logs_sms_link` (
  `id` varchar(64) NOT NULL COMMENT 'SHA-256 Hash using datetime miliseconds + Instance(Server) name',
  `phone_number` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `ip_address` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `state` enum('N','Y') COLLATE utf8_unicode_ci NOT NULL DEFAULT 'N',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` int(11) DEFAULT NULL COMMENT 'created_by => user_id from table provisioning users, set 0 if system who create the record',
  `updated_at` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` int(11) DEFAULT NULL COMMENT 'updated_by => user_id from table provisioning users, set 0 if system who create the record',
  PRIMARY KEY (`id`),
  KEY `state` (`state`),
  KEY `created_at` (`created_at`),
  KEY `updated_at` (`updated_at`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- LOGS_SMS_RECEIVED --
CREATE TABLE `logs_sms_received` (
  `id` varchar(64) NOT NULL COMMENT 'SHA-256 Hash using datetime miliseconds + Instance(Server) name',
  `origin` varchar(16) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `content` varchar(160) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `at_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` int(11) DEFAULT NULL COMMENT 'created_by => user_id from table provisioning users, set 0 if system who create the record',
  `updated_at` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` int(11) DEFAULT NULL COMMENT 'updated_by => user_id from table provisioning users, set 0 if system who create the record',
  PRIMARY KEY (`id`),
  KEY `created_at` (`created_at`),
  KEY `updated_at` (`updated_at`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- LOGS_SMS_SENT --
CREATE TABLE `logs_sms_sent` (
  `id` varchar(64) NOT NULL COMMENT 'SHA-256 Hash using datetime miliseconds + Instance(Server) name',
  `sender` varchar(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `origin` enum('1','2','3','4','5') COLLATE utf8_unicode_ci NOT NULL DEFAULT '2' COMMENT '1=private, 2=workbench, 3=apps, 4=reply, 5=shell',
  `destination` varchar(16) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `on_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `content` varchar(500) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` int(11) DEFAULT NULL COMMENT 'created_by => user_id from table provisioning users, set 0 if system who create the record',
  `updated_at` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` int(11) DEFAULT NULL COMMENT 'updated_by => user_id from table provisioning users, set 0 if system who create the record',
  PRIMARY KEY (`id`),
  KEY `sender` (`sender`),
  KEY `origin` (`origin`),
  KEY `on_time` (`on_time`),
  KEY `created_at` (`created_at`),
  KEY `updated_at` (`updated_at`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- TELKOMSEL_CALLBACK --
CREATE TABLE `telkomsel_callback` (
  `id` varchar(64) NOT NULL COMMENT 'SHA-256 Hash using datetime miliseconds + Instance(Server) name',
  `customer_application_id` varchar(64) COLLATE utf8_unicode_ci  NOT NULL COMMENT 'Relation Id from table customer_application',
  `trx_id` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `msisdn` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `sms` varchar(160) COLLATE utf8_unicode_ci DEFAULT NULL,
  `adn` int(5) DEFAULT NULL,
  `result` double DEFAULT NULL,
  `error_code` varchar(2) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` int(11) DEFAULT NULL COMMENT 'created_by => user_id from table provisioning users, set 0 if system who create the record',
  `updated_at` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` int(11) DEFAULT NULL COMMENT 'updated_by => user_id from table provisioning users, set 0 if system who create the record',
  PRIMARY KEY (`id`),
  KEY `created_at` (`created_at`),
  KEY `updated_at` (`updated_at`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- TELKOMSEL_SUBSCRIBER --
CREATE TABLE `telkomsel_subscriber` (
  `id` varchar(64) NOT NULL COMMENT 'SHA-256 Hash using datetime miliseconds + Instance(Server) name',
  `customer_application_id` varchar(64) NOT NULL COMMENT 'Relation Id from table customer_application',
  `msisdn` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  `sms` varchar(160) COLLATE utf8_unicode_ci DEFAULT NULL,
  `keyword` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `homeloc` varchar(150) COLLATE utf8_unicode_ci DEFAULT NULL,
  `workloc` varchar(150) COLLATE utf8_unicode_ci DEFAULT NULL,
  `response` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` int(11) DEFAULT NULL COMMENT 'created_by => user_id from table provisioning users, set 0 if system who create the record',
  `updated_at` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` int(11) DEFAULT NULL COMMENT 'updated_by => user_id from table provisioning users, set 0 if system who create the record',
  PRIMARY KEY (`id`),
  KEY `created_at` (`created_at`),
  KEY `updated_at` (`updated_at`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- LOGS_EMAIL_DISBURSEMENT --
CREATE TABLE `logs_email_disbursement` (
  `id` int(11) NOT NULL,
  `date` date NOT NULL DEFAULT '0000-00-00',
  `content` text COLLATE utf8_unicode_ci NOT NULL,
  `is_delivered` enum('Y','N') COLLATE utf8_unicode_ci NOT NULL DEFAULT 'N',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` int(11) DEFAULT NULL COMMENT 'created_by => user_id from table provisioning users, set 0 if system who create the record',
  `updated_at` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` int(11) DEFAULT NULL COMMENT 'updated_by => user_id from table provisioning users, set 0 if system who create the record',
  KEY `created_at` (`created_at`),
  KEY `updated_at` (`updated_at`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- SMS_BLAST --
CREATE TABLE `sms_blast` (
  `id` varchar(64) NOT NULL COMMENT 'SHA-256 Hash using datetime miliseconds + Instance(Server) name',
  `user_id` int(11) COLLATE utf8_unicode_ci NOT NULL,
  `destination` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `message` text COLLATE utf8_unicode_ci NOT NULL,
  `state` enum('N','Y') COLLATE utf8_unicode_ci NOT NULL DEFAULT 'N',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` int(11) DEFAULT NULL COMMENT 'created_by => user_id from table provisioning users, set 0 if system who create the record',
  `updated_at` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` int(11) DEFAULT NULL COMMENT 'updated_by => user_id from table provisioning users, set 0 if system who create the record',
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  KEY `created_at` (`created_at`),
  KEY `updated_at` (`updated_at`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- LOGS_SMS_EMAIL_DISBURSEMENT --
CREATE TABLE `logs_sms_email_disbursement` (
  `id` int(11) NOT NULL,
  `loan_id` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `process_datetime` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `is_email_retry` enum('Y','N') COLLATE utf8_unicode_ci NOT NULL DEFAULT 'N',
  `is_email_sent` enum('Y','N') COLLATE utf8_unicode_ci NOT NULL DEFAULT 'N',
  `is_sms_retry` enum('Y','N') COLLATE utf8_unicode_ci NOT NULL DEFAULT 'N',
  `is_sms_sent` enum('Y','N') COLLATE utf8_unicode_ci NOT NULL DEFAULT 'N',
  `retry_email_datetime` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `retry_sms_datetime` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` int(11) DEFAULT NULL COMMENT 'created_by => user_id from table provisioning users, set 0 if system who create the record',
  `updated_at` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` int(11) DEFAULT NULL COMMENT 'updated_by => user_id from table provisioning users, set 0 if system who create the record',
  PRIMARY KEY (`id`),
  KEY `loan_id` (`loan_id`),
  KEY `created_at` (`created_at`),
  KEY `updated_at` (`updated_at`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- LOGS_GENERAL_EMAIL --
CREATE TABLE `logs_general_email` (
  `id` int(16) NOT NULL,
  `customer_application_id` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `loan_id` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `topic` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `trx_no` bigint(10) DEFAULT NULL,
  `sender` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `receiver` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `template_id` int(3) DEFAULT NULL,
  `body` text COLLATE utf8_unicode_ci,
  `sent_datetime` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `state` enum('Y','N') COLLATE utf8_unicode_ci DEFAULT 'N',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` int(11) DEFAULT NULL COMMENT 'created_by => user_id from table provisioning users, set 0 if system who create the record',
  `updated_at` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` int(11) DEFAULT NULL COMMENT 'updated_by => user_id from table provisioning users, set 0 if system who create the record',
  PRIMARY KEY (`id`),
  KEY `customer_application_id` (`customer_application_id`),
  KEY `created_at` (`created_at`),
  KEY `updated_at` (`updated_at`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- LOGS_REPORT_EXPORTFILE --
CREATE TABLE `logs_report_exportfile` (
  `id` varchar(64) NOT NULL COMMENT 'SHA-256 Hash using datetime miliseconds + Instance(Server) name',
  `user_id` int(11) NOT NULL,
  `user_email` varchar(100) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `filename` varchar(100) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `extension` enum('.pdf','.xls','.xlsx','.csv') COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` int(11) DEFAULT NULL COMMENT 'created_by => user_id from table provisioning users, set 0 if system who create the record',
  `updated_at` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` int(11) DEFAULT NULL COMMENT 'updated_by => user_id from table provisioning users, set 0 if system who create the record',
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  KEY `created_at` (`created_at`),
  KEY `updated_at` (`updated_at`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- LOGS_REPORT_SMS --
CREATE TABLE `logs_report_sms` (
  `id` int(16) NOT NULL,
  `type` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `loan_id` varchar(60) COLLATE utf8_unicode_ci DEFAULT NULL,
  `trx_no` bigint(10) DEFAULT NULL,
  `sender` varchar(24) COLLATE utf8_unicode_ci DEFAULT NULL,
  `receiver` varchar(24) COLLATE utf8_unicode_ci DEFAULT NULL,
  `body` text COLLATE utf8_unicode_ci,
  `is_sent` enum('Y','N') COLLATE utf8_unicode_ci NOT NULL DEFAULT 'N',
  `sent_datetime` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `is_retry` enum('Y','N') COLLATE utf8_unicode_ci NOT NULL DEFAULT 'N',
  `retry_datetime` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` int(11) DEFAULT NULL COMMENT 'created_by => user_id from table provisioning users, set 0 if system who create the record',
  `updated_at` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` int(11) DEFAULT NULL COMMENT 'updated_by => user_id from table provisioning users, set 0 if system who create the record',
  PRIMARY KEY (`id`),
  KEY `loan_id` (`loan_id`),
  KEY `created_at` (`created_at`),
  KEY `updated_at` (`updated_at`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- MASTER_TEMPLATE --
CREATE TABLE `mr_template` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) COLLATE utf8_unicode_ci NOT NULL DEFAULT '0',
  `category` enum('EMAIL','SMS') COLLATE utf8_unicode_ci DEFAULT NULL,
  `desc_en` text COLLATE utf8_unicode_ci,
  `desc_in` text COLLATE utf8_unicode_ci,
  `state` enum('Y','N','D') COLLATE utf8_unicode_ci NOT NULL DEFAULT 'Y',
  `is_delete` enum('Y','N') COLLATE utf8_unicode_ci DEFAULT 'N',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` int(11) DEFAULT NULL COMMENT 'created_by => user_id from table provisioning users, set 0 if system who create the record',
  `updated_at` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` int(11) DEFAULT NULL COMMENT 'updated_by => user_id from table provisioning users, set 0 if system who create the record',
  PRIMARY KEY (`id`),
  KEY `name` (`name`),
  KEY `state` (`state`),
  KEY `created_at` (`created_at`),
  KEY `updated_at` (`updated_at`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
