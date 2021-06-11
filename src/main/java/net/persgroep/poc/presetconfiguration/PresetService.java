package net.persgroep.poc.presetconfiguration;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class PresetService {

    private final PresetsProperties presetsProperties;

    public String getBackgroundColor(int i) {
        return presetsProperties.getPresets().get(i).getBaseValues().getBackgroundColor();
    }

    public String getTitleAlignment(int i) {
        return presetsProperties.getPresets().get(i).getBaseValues().getTitleAlignment();
    }

}
