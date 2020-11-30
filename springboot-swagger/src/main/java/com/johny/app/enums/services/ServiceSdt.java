package com.johny.app.enums.services;

public enum ServiceSdt {
    BY_CHARACTERISTICS("https://5fb812a28e07f00016643984.mockapi.io/technical/document/byCharacteristics"),
    CONFIRMATION_REQUEST("https://5fb812a28e07f00016643984.mockapi.io/technical/document/confirmationRequest");

    private final String urlPath;

    ServiceSdt(String urlPath) {
        this.urlPath = urlPath;
    }

    public String getUrlPath() {
        return urlPath;
    }
}
