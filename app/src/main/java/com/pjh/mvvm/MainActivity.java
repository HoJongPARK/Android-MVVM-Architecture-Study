package com.pjh.mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

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
        binding.setLifecycleOwner(this);
        model = new ViewModelProvider(this).get(CounterViewModel.class);
        binding.setViewModel(model);
       // model.counter.observe(this, integer -> binding.textviewCount.setText(String.valueOf(integer)));


    }
    public void onAddButtonClick(View view){
        model.increase();
    }
    public void onSubButtonClick(View view){
        model.decrease();
    }
}