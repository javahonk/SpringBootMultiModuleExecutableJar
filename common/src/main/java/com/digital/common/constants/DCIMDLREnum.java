package com.digital.common.constants;

public enum DCIMDLREnum implements BaseEnum {

    ACCEPT("Accept","Header Accept key");

    private String code;
    private String description;

    DCIMDLREnum(String code, String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return name();
    }

    @Override
    public String toString() {
        return "InventoryEnum{" +
                "code='" + code + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
