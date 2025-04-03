package br.com.dio.barbershopback.service;

import br.com.dio.barbershopback.domain.entity.ScheduleEntity;

public interface IScheduleService {

    ScheduleEntity save(final ScheduleEntity entity);

    void delete(final long id);

}
