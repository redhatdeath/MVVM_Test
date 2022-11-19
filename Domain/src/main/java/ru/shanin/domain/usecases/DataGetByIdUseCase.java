package ru.shanin.domain.usecases;

import ru.shanin.domain.repository.DataDomainRepository;

public class DataGetByIdUseCase {
    private final DataDomainRepository repository;

    public DataGetByIdUseCase(DataDomainRepository repository) {
        this.repository = repository;
    }

    public void dataEditById(long _id) {
        repository.dataGetById(_id);
    }
}
