package ru.pmsoft.twitterkiller.domain.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;


public class TokenOutput {
    private final String token;
    private final Date expiration;

    public TokenOutput(String token, Date expiration) {
        this.token = token;
        this.expiration = expiration;
    }

    public String getToken() {
        return token;
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "YYYY-MM-dd'T'HH:mm:ssZ", timezone = "GMT+4")
    public Date getExpiration() {
        return expiration;
    }
}
