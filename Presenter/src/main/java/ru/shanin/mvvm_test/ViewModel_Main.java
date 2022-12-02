package ru.shanin.mvvm_test;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

import ru.shanin.app.AppStart;
import ru.shanin.domain.entity.Data;

public class ViewModel_Main extends ViewModel {

    protected void addNewData(Data data) {
        (AppStart.addNewUseCase).dataAddNew(data);
    }

    protected MutableLiveData<ArrayList<Data>> getAllData() {
        return (AppStart.getAllUseCase).peopleGetAll();
    }


}
