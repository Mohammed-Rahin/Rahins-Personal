package com.example.gm.ui.soccer;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SoccerViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SoccerViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("List of Soccer Equipments ");
    }

    public LiveData<String> getText() {
        return mText;
    }
}