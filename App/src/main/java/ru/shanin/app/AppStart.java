package ru.shanin.app;

import android.app.Application;

import ru.shanin.data.repositoryImpl.DataDomainRepositoryImplInArrayList;
import ru.shanin.domain.usecases.DataAddNewUseCase;
import ru.shanin.domain.usecases.DataGetAllUseCase;

public class AppStart extends Application {

    public static DataDomainRepositoryImplInArrayList repository;
    public static DataGetAllUseCase getAllUseCase;
    public static DataAddNewUseCase addNewUseCase;

    @Override
    public void onCreate() {
        super.onCreate();
        initRepositoryImpl();
    }

    private void initRepositoryImpl() {
        repository = new DataDomainRepositoryImplInArrayList();
        getAllUseCase = new DataGetAllUseCase(repository);
        addNewUseCase = new DataAddNewUseCase(repository);
    }
}
