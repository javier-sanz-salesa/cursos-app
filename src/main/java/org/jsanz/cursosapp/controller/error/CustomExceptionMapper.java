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
    public Response toResponse(GenericApplicationException throwable) {
        System.out.println("###################### Estamos en el handler de excepciones");
        ErrorMessage message = new ErrorMessage();
        message.setStatusCode(505);
        message.setMessage("internal server error");
        return Response.status(505).entity(message).type(MediaType.APPLICATION_JSON_TYPE).build();
    }
}
