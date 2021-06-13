package net.persgroep.poc.presetconfiguration;

import lombok.extern.slf4j.Slf4j;
import net.persgroep.poc.presetconfiguration.presets.PresetService;
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
            log.info("BackgroundColor: {}, TitleAlignment: {}", presetService.getBackgroundColor(0), presetService.getTitleAlignment(0));
            log.info("BackgroundColor: {}, TitleAlignment: {}", presetService.getBackgroundColor(1), presetService.getTitleAlignment(1));
        };
    }
}
