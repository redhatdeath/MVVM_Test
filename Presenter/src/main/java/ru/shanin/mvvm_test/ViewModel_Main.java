package ru.shanin.mvvm_test;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

import ru.shanin.app.AppStart;
import ru.shanin.data.generate.DataGenerateRandom;
import ru.shanin.domain.entity.Data;

public class ViewModel_Main extends ViewModel {

//    protected void addNewData(Data data) {
//        (AppStart.addNewUseCase).dataAddNew(data);
//    }

    protected void addNewData() {
        (AppStart.addNewUseCase).dataAddNew(DataGenerateRandom.newData());
    }

    protected MutableLiveData<ArrayList<Data>> getAllData() {
        return (AppStart.getAllUseCase).peopleGetAll();
    }


}
