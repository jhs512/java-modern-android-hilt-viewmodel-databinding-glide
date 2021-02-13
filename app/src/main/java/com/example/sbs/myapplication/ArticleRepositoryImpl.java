package com.example.sbs.myapplication;

import android.content.Context;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.android.scopes.ViewModelScoped;

@ViewModelScoped
public class ArticleRepositoryImpl implements ArticleRepository {
    @Inject
    public ArticleRepositoryImpl(@ApplicationContext Context context) {
    }
}
