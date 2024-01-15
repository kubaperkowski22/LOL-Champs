package com.ready.lolchamps.ui.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0012\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0016"}, d2 = {"Lcom/ready/lolchamps/ui/detail/DetailActivity;", "Lcom/ready/lolchamps/ui/base/BaseActivity;", "Lcom/ready/lolchamps/databinding/ActivityDetailBinding;", "()V", "skinAdapter", "Lcom/ready/lolchamps/ui/detail/SkinAdapter;", "getSkinAdapter", "()Lcom/ready/lolchamps/ui/detail/SkinAdapter;", "skinAdapter$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/ready/lolchamps/ui/detail/DetailViewModel;", "getViewModel", "()Lcom/ready/lolchamps/ui/detail/DetailViewModel;", "viewModel$delegate", "initTransition", "", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class DetailActivity extends com.ready.lolchamps.ui.base.BaseActivity<com.ready.lolchamps.databinding.ActivityDetailBinding> {
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy skinAdapter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.ready.lolchamps.ui.detail.DetailActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHAMPION_ID_KEY = "CHAMPION_ID_KEY";
    
    public DetailActivity() {
        super(0);
    }
    
    private final com.ready.lolchamps.ui.detail.DetailViewModel getViewModel() {
        return null;
    }
    
    private final com.ready.lolchamps.ui.detail.SkinAdapter getSkinAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initTransition() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/ready/lolchamps/ui/detail/DetailActivity$Companion;", "", "()V", "CHAMPION_ID_KEY", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}