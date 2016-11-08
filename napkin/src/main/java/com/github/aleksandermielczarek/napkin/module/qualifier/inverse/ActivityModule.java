package com.github.aleksandermielczarek.napkin.module.qualifier.inverse;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.github.aleksandermielczarek.napkin.qualifier.inverse.ContextActivity;
import com.github.aleksandermielczarek.napkin.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Aleksander Mielczarek on 08.11.2016.
 */
@Module
@ActivityScope
public class ActivityModule {

    private final AppCompatActivity activity;

    public ActivityModule(AppCompatActivity activity) {
        this.activity = activity;
    }

    @Provides
    @ActivityScope
    AppCompatActivity provideActivity() {
        return activity;
    }

    @Provides
    @ActivityScope
    @ContextActivity
    Context provideContext() {
        return activity;
    }
}