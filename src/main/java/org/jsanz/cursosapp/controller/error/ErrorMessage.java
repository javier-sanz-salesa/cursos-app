package org.jsanz.cursosapp.controller.error;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Error message pojo
 */
public class ErrorMessage {
    private int statusCode;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("statusCode", statusCode).append("message", message).toString();
    }
}
