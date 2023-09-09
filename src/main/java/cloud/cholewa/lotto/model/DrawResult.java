package cloud.cholewa.lotto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.annotation.Nullable;
import jakarta.validation.Valid;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Value;
import lombok.experimental.NonFinal;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Value
@NonFinal
@Jacksonized
@SuperBuilder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DrawResult {

    @JsonProperty("drawSystemId")
    Integer drawSystemId;

    @JsonProperty("drawDate")
    LocalDateTime drawDate;

    @JsonProperty("gameType")
    GameType gameType;

    @JsonProperty("resultsJson")
    @Valid
    List<Integer> resultsJson;

    @JsonProperty("specialResults")
    @Valid
    List<Integer> specialResults;

    @Nullable
    public Integer getDrawSystemId() {
        return drawSystemId;
    }

    @Nullable
    @Valid
    public LocalDateTime getDrawDate() {
        return drawDate;
    }

    @Nullable
    @Valid
    public GameType getGameType() {
        return gameType;
    }

    @Nullable
    public List<Integer> getResultsJson() {
        return resultsJson;
    }

    @Nullable
    public List<Integer> getSpecialResults() {
        return specialResults;
    }
}
