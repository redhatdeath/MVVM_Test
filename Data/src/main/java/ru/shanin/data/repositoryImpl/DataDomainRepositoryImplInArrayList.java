package ru.shanin.data.repositoryImpl;

import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;

import ru.shanin.data.generate.DataGenerateRandom;
import ru.shanin.domain.entity.Data;
import ru.shanin.domain.entity.comparators.ByFnSn;
import ru.shanin.domain.repository.DataDomainRepository;

public class DataDomainRepositoryImplInArrayList implements DataDomainRepository {
    private final ArrayList<Data> dataArrayList;
    private final MutableLiveData<ArrayList<Data>> dataLiveData;

    private static int autoIncrementId = 0;

    {
        dataLiveData = new MutableLiveData<>();
        dataArrayList = new ArrayList<>();
//
//        for (int i = 0; i < 10; i++) {
//            dataAddNew(DataGenerateRandom.newData());
//        }
    }

    private void updateArrayList() {
        dataLiveData.postValue(new ArrayList<>(dataArrayList));
    }


    @Override
    public void dataAddNew(Data data) {
        if (data.get_id() == Data.UNDEFINED_ID)
            data.set_id(autoIncrementId++);
        dataArrayList.add(data);
        dataArrayList.sort(new ByFnSn());
        updateArrayList();
    }

    @Override
    public void dataEditByPosition(Data data) {
        Data data_old = dataGetById(data.get_id());
        dataRemoveByPosition(data_old);
        dataAddNew(data);

    }

    @Override
    public void dataRemoveByPosition(Data data) {
        dataArrayList.remove(data);
        updateArrayList();
    }


    @Override
    public Data dataGetByPosition(int id) {
        Data data = dataArrayList.get(id);
        if (data != null)
            return data;
        else throw new RuntimeException("There is no data in position = " + id);
    }

    @Override
    public Data dataGetById(long _id) {
        Data data = null;
        for (Data d : dataArrayList)
            if (d.get_id() == _id) {
                data = d;
                break;
            }
        if (data != null)
            return data;
        else throw new RuntimeException("There is no data with id = " + _id);
    }

    @Override
    public MutableLiveData<ArrayList<Data>> dataGetAll() {
        return dataLiveData;
    }

    public ArrayList<Data> getDataArrayList() {
        return new ArrayList<>(dataArrayList);
    }
}
