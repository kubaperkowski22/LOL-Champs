package com.ready.lolchamps.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/ready/lolchamps/di/RepositoryModule;", "", "()V", "provideDetailRepository", "Lcom/ready/lolchamps/repository/DetailRepository;", "detailRepositoryImpl", "Lcom/ready/lolchamps/repository/DetailRepositoryImpl;", "provideMainRepository", "Lcom/ready/lolchamps/repository/MainRepository;", "mainRepositoryImpl", "Lcom/ready/lolchamps/repository/MainRepositoryImpl;", "app_debug"})
@dagger.Module()
public abstract class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract com.ready.lolchamps.repository.MainRepository provideMainRepository(@org.jetbrains.annotations.NotNull()
    com.ready.lolchamps.repository.MainRepositoryImpl mainRepositoryImpl);
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract com.ready.lolchamps.repository.DetailRepository provideDetailRepository(@org.jetbrains.annotations.NotNull()
    com.ready.lolchamps.repository.DetailRepositoryImpl detailRepositoryImpl);
}