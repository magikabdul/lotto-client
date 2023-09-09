package cloud.cholewa.lotto.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;

@ConfigurationProperties("internal.services.lotto.uri")
public record LottoUriConfig(
        String scheme,
        String host,
        String port
) {
}
