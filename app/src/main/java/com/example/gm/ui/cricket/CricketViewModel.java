package com.example.gm.ui.cricket;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CricketViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CricketViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("List of Cricket Equipments");
    }

    public LiveData<String> getText() {
        return mText;
    }
}