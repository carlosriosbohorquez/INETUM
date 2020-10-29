package com.ocr.api.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Logger;

@Configuration
public class OCRConfig{

	@Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

}
