// Generated by data binding compiler. Do not edit!
package com.ready.lolchamps.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ready.lolchamps.R;
import com.ready.lolchamps.model.ChampionInfo;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemChampionSkinBinding extends ViewDataBinding {
  @Bindable
  protected String mChampionId;

  @Bindable
  protected ChampionInfo.Skin mSkin;

  protected ItemChampionSkinBinding(Object _bindingComponent, View _root, int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setChampionId(@Nullable String championId);

  @Nullable
  public String getChampionId() {
    return mChampionId;
  }

  public abstract void setSkin(@Nullable ChampionInfo.Skin skin);

  @Nullable
  public ChampionInfo.Skin getSkin() {
    return mSkin;
  }

  @NonNull
  public static ItemChampionSkinBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_champion_skin, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemChampionSkinBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemChampionSkinBinding>inflateInternal(inflater, R.layout.item_champion_skin, root, attachToRoot, component);
  }

  @NonNull
  public static ItemChampionSkinBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_champion_skin, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemChampionSkinBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemChampionSkinBinding>inflateInternal(inflater, R.layout.item_champion_skin, null, false, component);
  }

  public static ItemChampionSkinBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemChampionSkinBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemChampionSkinBinding)bind(component, view, R.layout.item_champion_skin);
  }
}