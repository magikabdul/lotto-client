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

@Schema(description = "errors list")
@Value
@NonFinal
@Jacksonized
@SuperBuilder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Errors {

    @JsonProperty("size")
    @Valid
    List<String> size;

    @JsonProperty("sort")
    @Valid
    List<String> sort;

    @JsonProperty("index")
    @Valid
    List<String> index;

    @JsonProperty("order")
    @Valid
    List<String> order;

    @Nullable
    public List<String> getSize() {
        return size;
    }

    @Nullable
    public List<String> getSort() {
        return sort;
    }

    @Nullable
    public List<String> getIndex() {
        return index;
    }

    @Nullable
    public List<String> getOrder() {
        return order;
    }
}
