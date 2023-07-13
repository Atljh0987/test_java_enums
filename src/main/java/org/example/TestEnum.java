package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


public enum TestEnum {
    FIRST_OPTION("firstOption"),
    SECOND_OPTION("secondOption"),
    THIRD_OPTION("thirdOption"),
    FOURTH_OPTION("fourthOption");

    private final String name;

    public String getName() {
        return name;
    }

    TestEnum(String value) {
        this.name = value;
    }

    public static TestEnum fromString(String value) {
        for (TestEnum enumValue : TestEnum.values()) {
            if (enumValue.getName().equals(value)) {
                return enumValue;
            }
        }
        throw new IllegalArgumentException("Invalid TestEnum value: " + value);
    }
}
