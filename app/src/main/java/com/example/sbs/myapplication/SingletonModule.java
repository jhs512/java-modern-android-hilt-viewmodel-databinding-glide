package com.example.sbs.myapplication;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public abstract class SingletonModule {
    @Singleton
    @Provides
    public static MemberRepository provideMemberRepository() {
        return new MemberRepository();
    }
}