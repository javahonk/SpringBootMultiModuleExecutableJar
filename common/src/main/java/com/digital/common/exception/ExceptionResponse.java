package com.digital.common.exception;

import java.time.LocalDateTime;

public class ExceptionResponse {

    private String errorMessage;
    private LocalDateTime dateTime;
    private String requestedURI;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getRequestedURI() {
        return requestedURI;
    }

    public void setRequestedURI(String requestedURI) {
        this.requestedURI = requestedURI;
    }

    @Override
    public String toString() {
        return "ExceptionResponse{" +
                "errorMessage='" + errorMessage + '\'' +
                ", dateTime=" + dateTime +
                ", requestedURI='" + requestedURI + '\'' +
                '}';
    }
}
