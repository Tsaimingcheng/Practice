package com.example.androidapppractice;

import android.widget.LinearLayout;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    private MutableLiveData<Integer> LikedNumber;

    public MutableLiveData<Integer> getLikedNumber() {
        if (LikedNumber == null){
            LikedNumber = new MutableLiveData<>();
            LikedNumber.setValue(0);
        }
        return LikedNumber;
    }
    public void addLikedNumber(int n){
        LikedNumber.setValue(LikedNumber.getValue() + n);
    }
}
