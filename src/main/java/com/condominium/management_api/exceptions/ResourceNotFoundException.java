package com.condominium.management_api.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String resourceType, Long id){
        super(String.format("%s no encontrado con id: %s ",resourceType, id));
    }
}
