package com.airqualityapp.logsaver.log;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "APP_LOG")
@Getter
@Setter
public class AppLog {
    @Id
    @SequenceGenerator(name = "AppLog", sequenceName = "APP_LOG_ID_SEQ")
    @GeneratedValue(generator = "AppLog")
    private Long id;

    private Date logDate;

    private String logData;
}
