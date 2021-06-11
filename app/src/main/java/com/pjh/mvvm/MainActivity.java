package com.pjh.mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.pjh.mvvm.databinding.ActivityMainBinding;
import com.pjh.mvvm.viewmodel.CounterViewModel;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    private CounterViewModel model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setActivity(this);
        binding.setLifecycleOwner(this);
        model = new ViewModelProvider(this).get(CounterViewModel.class);
        binding.setViewModel(model);


    }

    public void toNextActivity(View view){
        Intent intent = new Intent(this,UserTestActivity.class);
        startActivity(intent);
    }
}