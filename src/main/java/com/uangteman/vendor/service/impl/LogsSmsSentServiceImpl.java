/**
 * 
 */
package com.uangteman.vendor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uangteman.vendor.model.LogsSmsSent;
import com.uangteman.vendor.repository.LogsSmsSentRepository;
import com.uangteman.vendor.service.LogsSmsSentService;

/**
 * @author maryosandoz
 *
 */
@Service("logsSmsSentService")
public class LogsSmsSentServiceImpl implements LogsSmsSentService {

	@Autowired
	private LogsSmsSentRepository repo;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.uangteman.vendor.service.LogsSmsSentService#save(com.uangteman.vendor.
	 * model.LogsSmsSent)
	 */
	@Override
	public LogsSmsSent save(LogsSmsSent logsSmsSent) {
		return repo.save(logsSmsSent);
	}

}
