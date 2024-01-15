package com.ready.lolchamps.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/ready/lolchamps/repository/DetailRepositoryImpl;", "Lcom/ready/lolchamps/repository/DetailRepository;", "championInfoService", "Lcom/ready/lolchamps/network/ChampionInfoService;", "championInfoDao", "Lcom/ready/lolchamps/db/ChampionInfoDao;", "(Lcom/ready/lolchamps/network/ChampionInfoService;Lcom/ready/lolchamps/db/ChampionInfoDao;)V", "getChampionInfo", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ready/lolchamps/ui/base/UiState;", "Lcom/ready/lolchamps/model/ChampionInfo;", "championId", "", "app_debug"})
public final class DetailRepositoryImpl implements com.ready.lolchamps.repository.DetailRepository {
    private final com.ready.lolchamps.network.ChampionInfoService championInfoService = null;
    private final com.ready.lolchamps.db.ChampionInfoDao championInfoDao = null;
    
    @javax.inject.Inject()
    public DetailRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.ready.lolchamps.network.ChampionInfoService championInfoService, @org.jetbrains.annotations.NotNull()
    com.ready.lolchamps.db.ChampionInfoDao championInfoDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.ready.lolchamps.ui.base.UiState<com.ready.lolchamps.model.ChampionInfo>> getChampionInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String championId) {
        return null;
    }
}