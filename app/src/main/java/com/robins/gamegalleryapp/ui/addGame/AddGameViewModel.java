package com.robins.gamegalleryapp.ui.addGame;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AddGameViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AddGameViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}