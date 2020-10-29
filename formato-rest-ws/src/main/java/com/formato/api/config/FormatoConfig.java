package com.formato.api.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Logger;

//@EnableWs
@Configuration
public class FormatoConfig{

	@Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

}
