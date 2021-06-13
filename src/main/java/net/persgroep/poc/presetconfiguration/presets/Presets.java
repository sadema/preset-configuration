package net.persgroep.poc.presetconfiguration.presets;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Presets {
    private String id;
    private Teaser baseValues = new Teaser();
    private String fallbackPresetId = "169708bf-0e37-4901-ad8c-a09344f5b628";
    private List<Preset> preset;
}
