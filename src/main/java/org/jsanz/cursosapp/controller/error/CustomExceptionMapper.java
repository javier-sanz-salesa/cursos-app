package org.jsanz.cursosapp.controller.error;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Handle generic exceptions and return error code
 */
@Provider
public class CustomExceptionMapper implements ExceptionMapper<GenericApplicationException> {

    @Override
    public Response toResponse(GenericApplicationException ex) {
        ErrorMessage message = new ErrorMessage();
        message.setStatusCode(ex.getStatus());
        message.setMessage(ex.getMessage());
        return Response.status(ex.getStatus()).entity(message).type(MediaType.APPLICATION_JSON).build();
    }
}
