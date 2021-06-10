package com.pjh.mvvm.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class CounterViewModel extends ViewModel {

    public MutableLiveData<Integer> counter = new MutableLiveData<>();
    public MutableLiveData<ArrayList<Integer>> arrOfNums = new MutableLiveData<>();
    public ArrayList<Integer> integers = new ArrayList<>();
    public CounterViewModel(){
        counter.setValue(0);
        arrOfNums.setValue(integers);

    }
    public void increase(){
        counter.setValue(counter.getValue()+1);

    }

    public void decrease(){
        counter.setValue(counter.getValue()-1);
    }

}
