package com.condominium.management_api.exceptions;

public class EmailAlreadyExistsException extends RuntimeException {

    public EmailAlreadyExistsException(String email){
        super(String.format("El email %s ya está registrado",email));
    }
}
