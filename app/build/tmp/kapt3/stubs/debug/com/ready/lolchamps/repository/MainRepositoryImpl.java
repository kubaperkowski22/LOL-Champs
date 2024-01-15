package com.ready.lolchamps.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/ready/lolchamps/repository/MainRepositoryImpl;", "Lcom/ready/lolchamps/repository/MainRepository;", "championService", "Lcom/ready/lolchamps/network/ChampionService;", "championDao", "Lcom/ready/lolchamps/db/ChampionDao;", "(Lcom/ready/lolchamps/network/ChampionService;Lcom/ready/lolchamps/db/ChampionDao;)V", "getAllChampions", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ready/lolchamps/ui/base/UiState;", "", "Lcom/ready/lolchamps/model/Champion;", "app_debug"})
public final class MainRepositoryImpl implements com.ready.lolchamps.repository.MainRepository {
    private final com.ready.lolchamps.network.ChampionService championService = null;
    private final com.ready.lolchamps.db.ChampionDao championDao = null;
    
    @javax.inject.Inject()
    public MainRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.ready.lolchamps.network.ChampionService championService, @org.jetbrains.annotations.NotNull()
    com.ready.lolchamps.db.ChampionDao championDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.ready.lolchamps.ui.base.UiState<java.util.List<com.ready.lolchamps.model.Champion>>> getAllChampions() {
        return null;
    }
}