package cloud.cholewa.lotto;

import cloud.cholewa.lotto.config.LottoConfig;
import cloud.cholewa.lotto.model.DrawResultByGameTypeResponse;
import cloud.cholewa.lotto.model.GameType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@Component
@RequiredArgsConstructor
public class LottoClient {

    private final WebClient lottoClient;
    private final LottoConfig lottoConfig;

    public Mono<DrawResultByGameTypeResponse> getDrawResultByGameType(final GameType gameType) {
        return lottoClient
                .get()
                .uri(uriBuilder -> lottoConfig.drawResultsByGameType(uriBuilder)
                        .queryParam("game", gameType.toString())
                        .queryParam("index", 1)
                        .queryParam("size", 1)
                        .queryParam("sort", "drawDate")
                        .queryParam("order", "desc")
                        .build()
                )
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(DrawResultByGameTypeResponse.class);
    }
}
