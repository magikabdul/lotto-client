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
public class DrawItem {

    @JsonProperty("drawSystemId")
    Integer drawSystemId;

    @JsonProperty("drawDate")
    LocalDateTime drawDate;

    @JsonProperty("gameType")
    GameType gameType;

    @JsonProperty("multiplierValue")
    Integer multiplierValue;

    @JsonProperty("results")
    @Valid
    List<DrawResult> results;

    @JsonProperty("showSpecialResults")
    Boolean showSpecialResults;

    @JsonProperty("isNewEuroJackpotDraw")
    Boolean isNewEuroJackpotDraw;

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
    public Integer getMultiplierValue() {
        return multiplierValue;
    }

    @Nullable
    @Valid
    public List<DrawResult> getResults() {
        return results;
    }

    @Nullable
    public Boolean isShowSpecialResults() {
        return showSpecialResults;
    }

    @Nullable
    public Boolean isIsNewEuroJackpotDraw() {
        return isNewEuroJackpotDraw;
    }
}
