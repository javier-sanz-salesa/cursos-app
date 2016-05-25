package org.jsanz.cursosapp.controller.error;

import javax.ws.rs.WebApplicationException;

/**
 * Generic application exception
 */
public class GenericApplicationException extends WebApplicationException {
    public GenericApplicationException(String message, Throwable t) {
        super(message, t, 500);
    }

    public GenericApplicationException(String message) {
        super(message, 500);
    }
}
