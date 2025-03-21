package com.robins.gamegalleryapp.ui.homeGallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeGalleryModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeGalleryModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}