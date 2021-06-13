package net.persgroep.poc.presetconfiguration.configuration;

import lombok.RequiredArgsConstructor;
import net.persgroep.poc.presetconfiguration.presets.PresetTeaserValues;
import net.persgroep.poc.presetconfiguration.presets.TeaserImage;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class ImageSelector {

    public void setImage(PresetTeaserValues presetTeaserValues, String activeProfile) {
        Optional<TeaserImage> teaserImageOptional = presetTeaserValues.getImagesByEnv().stream()
                .filter(it -> it.getEnv().equals(activeProfile))
                .findFirst();
        teaserImageOptional.ifPresent(it -> {
            presetTeaserValues.setImage(it);
        });
    }
}
