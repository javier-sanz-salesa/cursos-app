package org.jsanz.cursosapp.controller.error;

import javax.ws.rs.WebApplicationException;

/**
 * Generic application exception
 */
public class GenericApplicationException extends Exception {
    /**
     * contains redundantly the HTTP status of the response sent back to the client in case of error, so that
     * the developer does not have to look into the response headers. If null a default
     */
    Integer status;

    /**
     * @param status
     */
    public GenericApplicationException(int status, String message) {
        super(message);
        this.status = status;
    }

    public GenericApplicationException() {
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
