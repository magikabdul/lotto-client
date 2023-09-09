package cloud.cholewa.lotto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Nullable;
import jakarta.validation.Valid;
import java.util.List;
import lombok.Value;
import lombok.experimental.NonFinal;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Schema(description = "draw result response to specific game type")
@Value
@NonFinal
@Jacksonized
@SuperBuilder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DrawResultByGameTypeResponse {

    @JsonProperty("totalRows")
    Integer totalRows;

    @JsonProperty("items")
    @Valid
    List<DrawItem> items;

    @JsonProperty("meta")
    Object meta;

    @JsonProperty("code")
    Integer code;

    @Nullable
    public Integer getTotalRows() {
        return totalRows;
    }

    @Nullable
    @Valid
    public List<DrawItem> getItems() {
        return items;
    }

    @Nullable
    public Object getMeta() {
        return meta;
    }

    @Nullable
    public Integer getCode() {
        return code;
    }
}
