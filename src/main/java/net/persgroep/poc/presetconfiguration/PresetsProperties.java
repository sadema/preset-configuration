package net.persgroep.poc.presetconfiguration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@Configuration
@ConfigurationProperties(
        prefix = "ste"
)
@PropertySource(value = "classpath:presets.yml", factory = YamlPropertySourceFactory.class)
@Data
public class PresetsProperties {

    private List<Presets> presets;

}
