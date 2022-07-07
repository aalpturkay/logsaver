package com.airqualityapp.logsaver.log;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppLogService {
    private final AppLogDao appLogDao;

    public void save(AppLogDto appLogDto){

        AppLog appLog = new AppLog();
        appLog.setLogData(appLogDto.getLogData());
        appLog.setLogDate(appLogDto.getLogDate());

        appLogDao.save(appLog);
    }
}
