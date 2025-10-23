package net.javaguides.ems_backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNoFoundException extends RuntimeException {
    //    le constructeur
    public ResourceNoFoundException(String message) {
        super(message);
    }
}
