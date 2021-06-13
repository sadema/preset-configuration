package net.persgroep.poc.presetconfiguration.configuration;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import net.persgroep.poc.presetconfiguration.presets.Presets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;
import java.util.List;

@Slf4j
@Configuration
@ConfigurationProperties(
        prefix = "ste"
)
@PropertySource(value = "classpath:presets.yml", factory = YamlPropertySourceFactory.class)
@Data
public class PresetsProperties {

    @Value("${spring.profiles.active:acc}")
    private String activeProfile;

    @Autowired
    private ImageFactory imageFactory;

    private List<Presets> presets;

//    @Profile("prod")
//    @Bean
//    ImageFactory createImageFactoryForProd() {
//        return new ImageFactory("prod");
//    }
//
//    @Profile("!prod")
//    @Bean
//    ImageFactory createImageFactoryForAcc() {
//        return new ImageFactory("acc");
//    }

    @PostConstruct
    private void setImageForEnv() {
        presets.stream()
                .map(it -> it.getPreset())
                .flatMap(it -> it.stream())
                .filter(it -> it.getValues() != null)
                .map(it -> it.getValues())
                .forEach(it -> {
                    imageFactory.setImage(it, activeProfile);
//                    log.info("set image for");
                });

    }

}
