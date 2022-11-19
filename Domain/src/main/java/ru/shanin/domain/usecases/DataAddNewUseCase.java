package ru.shanin.domain.usecases;

import ru.shanin.domain.entity.Data;
import ru.shanin.domain.repository.DataDomainRepository;

public class DataAddNewUseCase {
    private final DataDomainRepository repository;

    public DataAddNewUseCase(DataDomainRepository repository) {
        this.repository = repository;
    }

    public void dataAddNew(Data data) {
        repository.dataAddNew(data);
    }
}