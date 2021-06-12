package com.pjh.mvvm.viewmodel;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.pjh.mvvm.USER;

public class UserViewModel extends ViewModel {

    public MutableLiveData<USER> userMutableLiveData = new MutableLiveData<>();

    public UserViewModel(){
        USER user = new USER("박종호","010-2131-1234");
        userMutableLiveData.setValue(user);
    }
    public void modifyUserName(String userName){
        USER user = userMutableLiveData.getValue();
        assert user != null;
        user.setMUserName(userName);
        userMutableLiveData.postValue(user);
        Log.d("USER","modify occur");
        Log.d("USER",userMutableLiveData.getValue().toString());
    }
    public void modifyUserAge(int age){
        USER user = userMutableLiveData.getValue();
        assert user !=null;
        user.setMUserAge(age);
        userMutableLiveData.setValue(user);
    }
    public void modifyUserPhoneNumber(String phoneNumber){
        USER user = userMutableLiveData.getValue();
        assert user != null;
        user.setMPhoneNumber(phoneNumber);
        userMutableLiveData.setValue(user);

    }
    public String getUserName(){
        return userMutableLiveData.getValue().getMUserName();
    }
    public String getUserPhoneNumber(){
        return userMutableLiveData.getValue().getMPhoneNumber();
    }
    public int getUserAge(){
        return userMutableLiveData.getValue().getMUserAge();
    }
}
