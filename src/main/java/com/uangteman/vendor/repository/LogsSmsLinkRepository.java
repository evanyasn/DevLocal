package com.uangteman.vendor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uangteman.vendor.model.LogsSmsLink;

public interface LogsSmsLinkRepository extends JpaRepository<LogsSmsLink, String> {

	public LogsSmsLink save(LogsSmsLink logSmsLink);
}
