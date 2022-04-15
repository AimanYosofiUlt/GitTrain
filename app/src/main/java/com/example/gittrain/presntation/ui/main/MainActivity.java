package com.example.gittrain.presntation.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gittrain.R;
import com.example.gittrain.databinding.ActivityMainBinding;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {
    @Inject
    MainActivityViewModel viewModel;
    ActivityMainBinding bd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bd = ActivityMainBinding.inflate(LayoutInflater.from(this));
        setContentView(bd.getRoot());

        initViewModel();
        initModelView();
        initEvent();
    }

    private void initViewModel() {

    }

    private void initModelView() {

    }

    private void initEvent() {

    }
}