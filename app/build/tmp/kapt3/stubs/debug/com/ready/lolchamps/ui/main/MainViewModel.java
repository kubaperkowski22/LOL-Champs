package com.ready.lolchamps.ui.main;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/ready/lolchamps/ui/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "mainRepository", "Lcom/ready/lolchamps/repository/MainRepository;", "(Lcom/ready/lolchamps/repository/MainRepository;)V", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/ready/lolchamps/ui/base/UiState;", "", "Lcom/ready/lolchamps/model/Champion;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.ready.lolchamps.repository.MainRepository mainRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.ready.lolchamps.ui.base.UiState<java.util.List<com.ready.lolchamps.model.Champion>>> uiState = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.ready.lolchamps.repository.MainRepository mainRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.ready.lolchamps.ui.base.UiState<java.util.List<com.ready.lolchamps.model.Champion>>> getUiState() {
        return null;
    }
}