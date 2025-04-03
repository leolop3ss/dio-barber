package br.com.dio.barbershopback.handler.exception;

public class PhoneInUseException extends RuntimeException {

    public PhoneInUseException(String message) {
        super(message);
    }

}
