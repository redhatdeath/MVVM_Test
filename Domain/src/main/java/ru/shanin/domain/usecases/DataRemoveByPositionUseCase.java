package ru.shanin.domain.usecases;

import ru.shanin.domain.entity.Data;
import ru.shanin.domain.repository.DataDomainRepository;

public class DataRemoveByPositionUseCase {
    private final DataDomainRepository repository;

    public DataRemoveByPositionUseCase(DataDomainRepository repository) {
        this.repository = repository;
    }

    public void dataRemoveByPosition(Data data) {
        repository.dataRemoveByPosition(data);
    }
}
