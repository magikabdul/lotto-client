package cloud.cholewa.lotto.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.zalando.logbook.Logbook;

@Configuration
public class WebClientConfig {

    @Value("${internal.services.lotto.timeout.connect}")
    private Integer connectTimeout;

    @Value("${internal.services.lotto.timeout.read}")
    private Long readTimeout;

    public WebClient lottoWebClient(
            final WebClient.Builder builder
//            final Logbook logbook,
    ) {
        return builder
                .build();
    }
}
