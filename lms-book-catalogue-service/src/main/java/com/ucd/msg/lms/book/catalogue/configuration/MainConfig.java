package com.ucd.msg.lms.book.catalogue.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {
        @Bean
        public ModelMapper modelMapper() {
            return new ModelMapper();
        }
}
