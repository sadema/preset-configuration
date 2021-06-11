package net.persgroep.poc.presetconfiguration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(
        prefix = "preset"
)
@PropertySource(value = "classpath:presets.yml", factory = YamlPropertySourceFactory.class)
@Data
public class PresetConfiguration {

    private Teaser baseValues;
}
