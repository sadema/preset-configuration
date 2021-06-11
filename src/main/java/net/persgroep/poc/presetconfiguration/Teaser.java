package net.persgroep.poc.presetconfiguration;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Teaser {
    private String title = "bla";
    private boolean copyArticleTitle = false;
    private String titleLong;
}
