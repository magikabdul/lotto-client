package cloud.cholewa.lotto.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriBuilder;

@Component
@RequiredArgsConstructor
@EnableConfigurationProperties({LottoUriConfig.class, LottoPathsConfig.class})
public class LottoConfig {

    private final LottoUriConfig lottoUriConfig;
    private final LottoPathsConfig lottoPathsConfig;

    public UriBuilder drawResultsByGameType(final UriBuilder uriBuilder) {
        return commonProperties(uriBuilder)
                .path(lottoPathsConfig.drawResultsPath());
    }

    private UriBuilder commonProperties(final UriBuilder uriBuilder) {
        return uriBuilder
                .scheme(lottoUriConfig.scheme())
                .host(lottoUriConfig.host())
                .port(lottoUriConfig.port())
                .path(lottoPathsConfig.basePath());
    }
}
