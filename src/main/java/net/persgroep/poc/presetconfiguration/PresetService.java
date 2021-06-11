package net.persgroep.poc.presetconfiguration;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class PresetService {

    private final PresetConfiguration presetConfiguration;

    public String getTitle() {
        return presetConfiguration.getBaseValues().getTitle();
    }

    public String getTitleLong() {
        return presetConfiguration.getBaseValues().getTitleLong();
    }

}
