package net.persgroep.poc.presetconfiguration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class PresetConfigurationApplication {

    public static void main(String[] args) {
        SpringApplication.run(PresetConfigurationApplication.class, args);
    }

    @Bean
    CommandLineRunner getTitle(PresetService presetService) {
        return args -> {
            log.info("Title: {}, TitleLong: {}", presetService.getTitle(0), presetService.getTitleLong(0));
            log.info("Title: {}, TitleLong: {}", presetService.getTitle(1), presetService.getTitleLong(1));
        };
    }
}
