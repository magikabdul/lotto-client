package cloud.cholewa.lotto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
//import io.swagger.annotations.ApiModel;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Nullable;
import jakarta.validation.Valid;
import lombok.Value;
import lombok.experimental.NonFinal;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Schema(description = "Error response from Lotto Service")
@Value
@NonFinal
@Jacksonized
@SuperBuilder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvalidParametersErrorResponse {

    @JsonProperty("errors")
    Errors errors;

    @JsonProperty("code")
    Integer code;

    @Nullable
    @Valid
    public Errors getErrors() {
        return errors;
    }

    @Nullable
    public Integer getCode() {
        return code;
    }
}
