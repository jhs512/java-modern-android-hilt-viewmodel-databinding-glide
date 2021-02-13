package com.example.sbs.myapplication;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class MainViewModel extends AndroidViewModel {
    private final ArticleRepository articleRepository;

    private final MutableLiveData<String> lvTitle;
    private final MutableLiveData<Integer> lvTitleBackground;
    private final MutableLiveData<Boolean> lvImageViewVisible;

    @Inject
    public MainViewModel(@NonNull Application application, ArticleRepository articleRepository, MemberRepository memberRepository) {
        super(application);
        this.articleRepository = articleRepository;

        lvTitle = new MutableLiveData<>("안녕하세요.");
        lvTitleBackground = new MutableLiveData<>(R.color.black);
        lvImageViewVisible = new MutableLiveData<>(false);
    }

    public MutableLiveData<String> getLvTitle() {
        return lvTitle;
    }

    public void setLvTitle(String title) {
        lvTitle.setValue(title);
    }

    public MutableLiveData<Integer> getLvTitleBackground() {
        return lvTitleBackground;
    }

    public void setLvTitleBackground(int color) {
        lvTitleBackground.setValue(color);
    }

    public MutableLiveData<Boolean> getLvImageViewVisible() {
        return lvImageViewVisible;
    }

    public void setLvImageViewVisible(boolean visible) {
        lvImageViewVisible.setValue(visible);
    }
}
