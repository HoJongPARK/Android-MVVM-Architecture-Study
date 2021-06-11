package com.pjh.mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.pjh.mvvm.databinding.ActivityUserTestBinding;
import com.pjh.mvvm.viewmodel.UserViewModel;

public class UserTestActivity extends AppCompatActivity {
    ActivityUserTestBinding binding;
    UserViewModel userViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_user_test);
        binding.setLifecycleOwner(this);
        userViewModel = new ViewModelProvider(this).get(UserViewModel.class);
        binding.setUserViewModel(userViewModel);
    }
}