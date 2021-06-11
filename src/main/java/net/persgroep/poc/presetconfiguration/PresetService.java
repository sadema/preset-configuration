package net.persgroep.poc.presetconfiguration;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class PresetService {

    private final PresetProperties presetProperties;

    public String getTitle(int i) {
        return presetProperties.getBaseValues().get(i).getTitle();
    }

    public String getTitleLong(int i) {
        return presetProperties.getBaseValues().get(i).getTitleLong();
    }

}
