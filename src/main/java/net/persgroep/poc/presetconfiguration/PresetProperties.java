package net.persgroep.poc.presetconfiguration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@Configuration
@ConfigurationProperties(
        prefix = "presets"
)
@PropertySource(value = "classpath:presets.yml", factory = YamlPropertySourceFactory.class)
@Data
public class PresetProperties {

    private List<Teaser> baseValues;
}
