package com.ready.lolchamps.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0013\u0014B+\u0012$\u0010\u0004\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\t0\u0005\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000eH\u0016R,\u0010\u0004\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\t0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/ready/lolchamps/ui/main/ChampionAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/ready/lolchamps/model/Champion;", "Lcom/ready/lolchamps/ui/main/ChampionAdapter$ChampionViewHolder;", "whenItemClicked", "Lkotlin/Function2;", "Landroid/util/Pair;", "Landroid/view/View;", "", "", "(Lkotlin/jvm/functions/Function2;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ChampionViewHolder", "Companion", "app_debug"})
public final class ChampionAdapter extends androidx.recyclerview.widget.ListAdapter<com.ready.lolchamps.model.Champion, com.ready.lolchamps.ui.main.ChampionAdapter.ChampionViewHolder> {
    private final kotlin.jvm.functions.Function2<com.ready.lolchamps.model.Champion, android.util.Pair<android.view.View, java.lang.String>, kotlin.Unit> whenItemClicked = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.ready.lolchamps.ui.main.ChampionAdapter.Companion Companion = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.ready.lolchamps.model.Champion> diffCallback = null;
    
    public ChampionAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.ready.lolchamps.model.Champion, ? super android.util.Pair<android.view.View, java.lang.String>, kotlin.Unit> whenItemClicked) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ready.lolchamps.ui.main.ChampionAdapter.ChampionViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.ready.lolchamps.ui.main.ChampionAdapter.ChampionViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/ready/lolchamps/ui/main/ChampionAdapter$ChampionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/ready/lolchamps/databinding/ItemChampionBinding;", "(Lcom/ready/lolchamps/databinding/ItemChampionBinding;)V", "bind", "", "item", "Lcom/ready/lolchamps/model/Champion;", "app_debug"})
    public static final class ChampionViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.ready.lolchamps.databinding.ItemChampionBinding binding = null;
        
        public ChampionViewHolder(@org.jetbrains.annotations.NotNull()
        com.ready.lolchamps.databinding.ItemChampionBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.ready.lolchamps.model.Champion item) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/ready/lolchamps/ui/main/ChampionAdapter$Companion;", "", "()V", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/ready/lolchamps/model/Champion;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}