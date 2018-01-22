package com.uangteman.vendor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.uangteman.vendor.model.LogsSmsSent;

@RepositoryRestResource(exported = false)
public interface LogsSmsSentRepository extends JpaRepository<LogsSmsSent, String> {

	public LogsSmsSent save(LogsSmsSent logsSmsSent);

}
