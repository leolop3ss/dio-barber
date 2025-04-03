package br.com.dio.barbershopback.service;

import br.com.dio.barbershopback.domain.entity.ClientEntity;

public interface IClientService {

    ClientEntity save(final ClientEntity entity);

    ClientEntity update(final ClientEntity entity);

    void delete(final long id);

}
