package net.persgroep.poc.presetconfiguration.presets;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Teaser {
    @JsonIgnore
    private String id;
    private String title = "";
    private boolean copyArticleTitle = false;
    private String titleLong = "";
    private String titleAlignment = "LEFT";
    private String backgroundColor = "#FFFFFF";
}
