package net.persgroep.poc.presetconfiguration.presets;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Preset {
    private String id;
    private String sectionName;
    private String name;
    private PresetTeaserValues values;
}
