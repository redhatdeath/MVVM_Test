package ru.shanin.mvvm_test;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import ru.shanin.data.generate.DataGenerateRandom;
import ru.shanin.domain.entity.Data;


public class Activity_Main extends AppCompatActivity {
    private TextView tv;
    private FloatingActionButton fab;


    private ViewModel_Main viewModel_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViewModel();
        initViewFAB();
        initViewTV();
    }


    private void initViewFAB() {
        fab = findViewById(R.id.fab);
        fab.setOnClickListener(
                v -> {
                    viewModel_main.addNewData(
                            DataGenerateRandom.newData()
                    );
                }
        );
    }

    private void initViewTV() {
        tv = findViewById(R.id.tv);
        viewModel_main.getAllData().observe(
                this,
                new Observer<ArrayList<Data>>() {
                    @Override
                    public void onChanged(ArrayList<Data> data) {
                        tv.setText(data.toString());
                    }
                }
        );
    }

    private void initViewModel() {
        viewModel_main = new ViewModelProvider(this).get(ViewModel_Main.class);
    }
}