package ru.shanin.mvvm_test;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import ru.shanin.data.repositoryImpl.DataDomainRepositoryImplInArrayList;


public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private DataDomainRepositoryImplInArrayList temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
        setupView();
    }

    private void initData() {
        temp = new DataDomainRepositoryImplInArrayList();
    }

    private void initView() {
        tv = findViewById(R.id.tv);
    }

    private void setupView() {
        //tv.setText(temp.getDataArrayList().toString());
        tv.setText(temp.dataGetAll().getValue().toString());
    }
}