package com.airqualityapp.logsaver.rabbit;

import com.airqualityapp.logsaver.log.AppLogDto;
import com.airqualityapp.logsaver.log.AppLogService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class RabbitMQConsumer {

    private final AppLogService appLogService;

    @RabbitListener(queues = "${airquality.rabbitmq.queue}")
    public void saveLog(AppLogDto appLogDto){

        appLogService.save(appLogDto);
        log.info("Log: {} {} Saved", appLogDto.getLogData(), appLogDto.getLogDate());
    }
}
