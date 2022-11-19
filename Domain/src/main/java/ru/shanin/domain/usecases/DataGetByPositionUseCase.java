package ru.shanin.domain.usecases;

import ru.shanin.domain.entity.Data;
import ru.shanin.domain.repository.DataDomainRepository;

public class DataGetByPositionUseCase {
    private final DataDomainRepository repository;

    public DataGetByPositionUseCase(DataDomainRepository repository) {
        this.repository = repository;
    }

    public Data dataGetByPosition(int id) {
        return repository.dataGetByPosition(id);
    }
}