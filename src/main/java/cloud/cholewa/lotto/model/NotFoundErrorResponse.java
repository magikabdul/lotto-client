package cloud.cholewa.lotto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Nullable;
import lombok.Value;
import lombok.experimental.NonFinal;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Schema(description = "Not found error response")
@Value
@NonFinal
@Jacksonized
@SuperBuilder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class NotFoundErrorResponse {

    @JsonProperty("type")
    String type;

    @JsonProperty("title")
    String title;

    @JsonProperty("status")
    Integer status;

    @JsonProperty("traceId")
    String traceId;

    @Nullable
    public String getType() {
        return type;
    }

    @Nullable
    public String getTitle() {
        return title;
    }

    @Nullable
    public Integer getStatus() {
        return status;
    }

    @Nullable
    public String getTraceId() {
        return traceId;
    }
}
