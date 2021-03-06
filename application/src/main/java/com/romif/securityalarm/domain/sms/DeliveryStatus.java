package com.romif.securityalarm.domain.sms;

import java.util.Arrays;

public enum DeliveryStatus {
    DELIVERED("D"), UNDELIVERED("U"), PENDING("P"), INVALID_NUMBER("I"), EXPIRED("E"), UNKNOWN("?");

    private final String code;

    DeliveryStatus(String code) {
        this.code = code;
    }

    public static DeliveryStatus getByCode(String code) {
        return  Arrays.stream(values())
            .filter(deliveryStatus -> code.equals(deliveryStatus.code))
            .findFirst().orElseThrow(() -> new IllegalArgumentException("Can't find DeliveryStatus by code: " + code));

    }
}
