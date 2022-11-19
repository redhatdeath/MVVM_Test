package ru.shanin.domain.repository;

import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;

import ru.shanin.domain.entity.Data;

public interface DataDomainRepository {

    void dataAddNew(Data data);

    void dataEditByPosition(Data data);

    void dataRemoveByPosition(Data data);

    Data dataGetByPosition(int id);

    Data dataGetById(long _id);

    MutableLiveData<ArrayList<Data>> dataGetAll();
}
