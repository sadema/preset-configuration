package net.persgroep.poc.presetconfiguration;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Presets {
    private Teaser baseValues = new Teaser();
    private String fallbackPresetId = "169708bf-0e37-4901-ad8c-a09344f5b628";
}
