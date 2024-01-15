package com.ready.lolchamps.db;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.ready.lolchamps.db.ImageTypeConverter.class, com.ready.lolchamps.db.StringListTypeConverter.class, com.ready.lolchamps.db.SkinTypeConverter.class, com.ready.lolchamps.db.SpellTypeConverter.class, com.ready.lolchamps.db.PassiveTypeConverter.class})
@androidx.room.Database(entities = {com.ready.lolchamps.model.Champion.class, com.ready.lolchamps.model.ChampionInfo.class}, version = 1, exportSchema = true)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/ready/lolchamps/db/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "championDao", "Lcom/ready/lolchamps/db/ChampionDao;", "championInfoDao", "Lcom/ready/lolchamps/db/ChampionInfoDao;", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ready.lolchamps.db.ChampionDao championDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ready.lolchamps.db.ChampionInfoDao championInfoDao();
}