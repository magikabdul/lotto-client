package cloud.cholewa.lotto.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;

@ConfigurationProperties("internal.services.lotto.paths")
public record LottoPathsConfig(
        String basePath,
        String drawResultsPath
) {
}
