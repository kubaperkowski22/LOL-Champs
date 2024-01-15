// Generated by data binding compiler. Do not edit!
package com.ready.lolchamps.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ready.lolchamps.R;
import com.ready.lolchamps.model.Champion;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemChampionBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView championSplashImage;

  @Bindable
  protected Champion mChampion;

  protected ItemChampionBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView championSplashImage) {
    super(_bindingComponent, _root, _localFieldCount);
    this.championSplashImage = championSplashImage;
  }

  public abstract void setChampion(@Nullable Champion champion);

  @Nullable
  public Champion getChampion() {
    return mChampion;
  }

  @NonNull
  public static ItemChampionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_champion, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemChampionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemChampionBinding>inflateInternal(inflater, R.layout.item_champion, root, attachToRoot, component);
  }

  @NonNull
  public static ItemChampionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_champion, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemChampionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemChampionBinding>inflateInternal(inflater, R.layout.item_champion, null, false, component);
  }

  public static ItemChampionBinding bind(@NonNull View view) {
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
  public static ItemChampionBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemChampionBinding)bind(component, view, R.layout.item_champion);
  }
}
