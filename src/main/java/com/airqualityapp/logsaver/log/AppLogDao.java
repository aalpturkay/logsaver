package com.airqualityapp.logsaver.log;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AppLogDao extends JpaRepository<AppLog, Long> {
}
