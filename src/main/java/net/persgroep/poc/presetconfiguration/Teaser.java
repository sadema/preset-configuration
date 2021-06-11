package net.persgroep.poc.presetconfiguration;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Teaser {
    @JsonIgnore
    private String id;
    private String title = "bla";
    private boolean copyArticleTitle = false;
    private String titleLong = "";
}
