package ru.shanin.domain.usecases;

import ru.shanin.domain.entity.Data;
import ru.shanin.domain.repository.DataDomainRepository;

public class DataEditByPositionUseCase {
    private final DataDomainRepository repository;

    public DataEditByPositionUseCase(DataDomainRepository repository) {
        this.repository = repository;
    }

    public void dataEditById(Data data) {
        repository.dataEditByPosition(data);
    }
}