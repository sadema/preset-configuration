package net.persgroep.poc.presetconfiguration.presets;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TeaserImage {
    @JsonIgnore
    private String env;
    private String imageId;
}
