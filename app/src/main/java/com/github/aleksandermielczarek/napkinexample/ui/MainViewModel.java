package com.github.aleksandermielczarek.napkinexample.ui;

import android.databinding.ObservableField;

import com.github.aleksandermielczarek.napkinexample.qualifier.ActivityString;
import com.github.aleksandermielczarek.napkinexample.qualifier.AppString;

import javax.inject.Inject;

/**
 * Created by Aleksander Mielczarek on 09.11.2016.
 */

public class MainViewModel {

    public final ObservableField<String> napkinString = new ObservableField<>();
    public final ObservableField<String> napkinString2 = new ObservableField<>();

    @Inject
    public MainViewModel(@AppString String napkinString, @ActivityString String napkinString2) {
        this.napkinString.set(napkinString);
        this.napkinString2.set(napkinString2);
    }
}
