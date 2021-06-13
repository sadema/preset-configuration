package net.persgroep.poc.presetconfiguration.presets;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class PresetTeaserValues {
    private String subLabel = "";
    private TeaserImage image;
    @JsonIgnore
    private List<TeaserImage> imagesByEnv;
}
