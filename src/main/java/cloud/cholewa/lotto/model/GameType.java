package cloud.cholewa.lotto.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum GameType {
    LOTTO("Lotto"),

    MINILOTTO("MiniLotto"),

    EKSTRAPENSJA("EkstraPensja"),

    MULTIMULTI("MultiMulti");

    private final String value;

    GameType(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static GameType fromValue(String value) {
        for (GameType b : GameType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}
