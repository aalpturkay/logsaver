package com.airqualityapp.logsaver.log;

import lombok.Data;

import java.util.Date;

@Data
public class AppLogDto {

    private Date logDate;

    private String logData;
}
