package com.ready.lolchamps.ui.detail;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00110\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f\u00a8\u0006\u0013"}, d2 = {"Lcom/ready/lolchamps/ui/detail/DetailViewModel;", "Landroidx/lifecycle/ViewModel;", "detailRepository", "Lcom/ready/lolchamps/repository/DetailRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/ready/lolchamps/repository/DetailRepository;Landroidx/lifecycle/SavedStateHandle;)V", "championId", "", "getChampionId", "()Ljava/lang/String;", "championInfo", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/ready/lolchamps/model/ChampionInfo;", "getChampionInfo", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lcom/ready/lolchamps/ui/base/UiState;", "getUiState", "app_debug"})
public final class DetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String championId = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.ready.lolchamps.ui.base.UiState<com.ready.lolchamps.model.ChampionInfo>> uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.ready.lolchamps.model.ChampionInfo> championInfo = null;
    
    @javax.inject.Inject()
    public DetailViewModel(@org.jetbrains.annotations.NotNull()
    com.ready.lolchamps.repository.DetailRepository detailRepository, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getChampionId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.ready.lolchamps.ui.base.UiState<com.ready.lolchamps.model.ChampionInfo>> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.ready.lolchamps.model.ChampionInfo> getChampionInfo() {
        return null;
    }
}