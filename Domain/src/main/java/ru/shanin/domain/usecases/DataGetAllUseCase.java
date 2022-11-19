package ru.shanin.domain.usecases;


import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;

import ru.shanin.domain.entity.Data;
import ru.shanin.domain.repository.DataDomainRepository;

public class DataGetAllUseCase {

    private final DataDomainRepository repository;

    public DataGetAllUseCase(DataDomainRepository repository) {
        this.repository = repository;
    }

    public MutableLiveData<ArrayList<Data>> peopleGetAll() {
        return repository.dataGetAll();
    }
}