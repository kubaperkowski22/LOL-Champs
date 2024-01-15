package com.ready.lolchamps.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0007\u001a \u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\u0007\u001a\u0016\u0010\n\u001a\u00020\u0001*\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007\u001a\u0014\u0010\u000e\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0007\u001a\u0018\u0010\u0011\u001a\u00020\u0001*\u00020\u00122\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0007\u001a\u0018\u0010\u0013\u001a\u00020\u0001*\u00020\u00142\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0007\u001a%\u0010\u0015\u001a\u00020\u0001*\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007\u00a2\u0006\u0002\u0010\u0019\u001a\u001c\u0010\u001a\u001a\u00020\u0001*\u00020\u00022\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\bH\u0007\u001a\u001c\u0010\u001d\u001a\u00020\u0001*\u00020\u001e2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\bH\u0007\u001a\u0016\u0010 \u001a\u00020\u0001*\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0007\u00a8\u0006$"}, d2 = {"bindAdapter", "", "Landroidx/recyclerview/widget/RecyclerView;", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "bindChampionItems", "uiState", "Lcom/ready/lolchamps/ui/base/UiState;", "", "Lcom/ready/lolchamps/model/Champion;", "bindImage", "Landroidx/appcompat/widget/AppCompatImageView;", "uri", "", "bindItemDecoration", "itemDecoration", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "bindShow", "Landroid/widget/ProgressBar;", "bindSkinAdapter", "Lcom/jackandphantom/carouselrecyclerview/CarouselRecyclerview;", "bindSkinImage", "championId", "skinNum", "", "(Landroidx/appcompat/widget/AppCompatImageView;Ljava/lang/String;Ljava/lang/Integer;)V", "bindSkinItems", "skinItems", "Lcom/ready/lolchamps/model/ChampionInfo$Skin;", "bindTags", "Lcom/google/android/material/chip/ChipGroup;", "tags", "bindToast", "Landroid/view/View;", "throwable", "", "app_debug"})
public final class BindingAdaptersKt {
    
    @androidx.databinding.BindingAdapter(value = {"image"})
    public static final void bindImage(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatImageView $this$bindImage, @org.jetbrains.annotations.Nullable()
    java.lang.String uri) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"championId", "skinNum"}, requireAll = true)
    public static final void bindSkinImage(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatImageView $this$bindSkinImage, @org.jetbrains.annotations.Nullable()
    java.lang.String championId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer skinNum) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"show"})
    public static final void bindShow(@org.jetbrains.annotations.NotNull()
    android.widget.ProgressBar $this$bindShow, @org.jetbrains.annotations.NotNull()
    com.ready.lolchamps.ui.base.UiState<?> uiState) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"toast"})
    public static final void bindToast(@org.jetbrains.annotations.NotNull()
    android.view.View $this$bindToast, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable throwable) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"adapter"})
    public static final void bindAdapter(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$bindAdapter, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"skinAdapter"})
    public static final void bindSkinAdapter(@org.jetbrains.annotations.NotNull()
    com.jackandphantom.carouselrecyclerview.CarouselRecyclerview $this$bindSkinAdapter, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"itemDecoration"})
    public static final void bindItemDecoration(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$bindItemDecoration, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ItemDecoration itemDecoration) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"championItems"})
    public static final void bindChampionItems(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$bindChampionItems, @org.jetbrains.annotations.NotNull()
    com.ready.lolchamps.ui.base.UiState<? extends java.util.List<com.ready.lolchamps.model.Champion>> uiState) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"skinItems"})
    public static final void bindSkinItems(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$bindSkinItems, @org.jetbrains.annotations.Nullable()
    java.util.List<com.ready.lolchamps.model.ChampionInfo.Skin> skinItems) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"tags"})
    public static final void bindTags(@org.jetbrains.annotations.NotNull()
    com.google.android.material.chip.ChipGroup $this$bindTags, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> tags) {
    }
}