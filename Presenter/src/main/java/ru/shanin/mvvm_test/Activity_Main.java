package ru.shanin.mvvm_test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class Activity_Main extends AppCompatActivity {
    private ViewModel_Main viewModel_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViewModel();
        setupView();
    }


    private void initViewModel() {
        viewModel_main = new ViewModelProvider(this).get(ViewModel_Main.class);
    }

    private void setupView() {
        new FloatingActionButtonHandler(this, R.id.fab);
        new TextViewHandler(this, this, R.id.tv);
    }

    private final class FloatingActionButtonHandler implements View.OnClickListener {

        public FloatingActionButtonHandler(Activity activity, int fabId) {
            FloatingActionButton fab = activity.findViewById(fabId);
            fab.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            viewModel_main.addNewData();
        }
    }

    private final class TextViewHandler {
        private final TextView tv;

        public TextViewHandler(Activity activity, LifecycleOwner owner, int tvId) {
            tv = activity.findViewById(tvId);
            viewModel_main.getAllData().observe(
                    owner,
                    data -> tv.setText(data.toString())
            );
        }
    }
}