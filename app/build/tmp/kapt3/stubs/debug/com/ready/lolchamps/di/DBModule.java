package com.ready.lolchamps.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\b\u0010\u0019\u001a\u00020\u0018H\u0007J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0010\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0010\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007\u00a8\u0006\u001e"}, d2 = {"Lcom/ready/lolchamps/di/DBModule;", "", "()V", "provideAppDatabase", "Lcom/ready/lolchamps/db/AppDatabase;", "context", "Landroid/content/Context;", "imageTypeConverter", "Lcom/ready/lolchamps/db/ImageTypeConverter;", "stringListTypeConverter", "Lcom/ready/lolchamps/db/StringListTypeConverter;", "skinTypeConverter", "Lcom/ready/lolchamps/db/SkinTypeConverter;", "spellTypeConverter", "Lcom/ready/lolchamps/db/SpellTypeConverter;", "passiveTypeConverter", "Lcom/ready/lolchamps/db/PassiveTypeConverter;", "provideChampionDao", "Lcom/ready/lolchamps/db/ChampionDao;", "appDatabase", "provideChampionInfoDao", "Lcom/ready/lolchamps/db/ChampionInfoDao;", "provideImageTypeConverter", "moshi", "Lcom/squareup/moshi/Moshi;", "provideMoshi", "providePassiveTypeConverter", "provideSkinTypeConverter", "provideSpellTypeConverter", "provideStringListTypeConverter", "app_debug"})
@dagger.Module()
public final class DBModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.ready.lolchamps.di.DBModule INSTANCE = null;
    
    private DBModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.squareup.moshi.Moshi provideMoshi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.ready.lolchamps.db.AppDatabase provideAppDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.ready.lolchamps.db.ImageTypeConverter imageTypeConverter, @org.jetbrains.annotations.NotNull()
    com.ready.lolchamps.db.StringListTypeConverter stringListTypeConverter, @org.jetbrains.annotations.NotNull()
    com.ready.lolchamps.db.SkinTypeConverter skinTypeConverter, @org.jetbrains.annotations.NotNull()
    com.ready.lolchamps.db.SpellTypeConverter spellTypeConverter, @org.jetbrains.annotations.NotNull()
    com.ready.lolchamps.db.PassiveTypeConverter passiveTypeConverter) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.ready.lolchamps.db.ChampionDao provideChampionDao(@org.jetbrains.annotations.NotNull()
    com.ready.lolchamps.db.AppDatabase appDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.ready.lolchamps.db.ChampionInfoDao provideChampionInfoDao(@org.jetbrains.annotations.NotNull()
    com.ready.lolchamps.db.AppDatabase appDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.ready.lolchamps.db.ImageTypeConverter provideImageTypeConverter(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.ready.lolchamps.db.StringListTypeConverter provideStringListTypeConverter(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.ready.lolchamps.db.SkinTypeConverter provideSkinTypeConverter(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.ready.lolchamps.db.SpellTypeConverter provideSpellTypeConverter(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.ready.lolchamps.db.PassiveTypeConverter providePassiveTypeConverter(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi) {
        return null;
    }
}