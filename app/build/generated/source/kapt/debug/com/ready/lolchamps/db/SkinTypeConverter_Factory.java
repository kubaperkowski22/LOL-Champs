// Generated by Dagger (https://dagger.dev).
package com.ready.lolchamps.db;

import com.squareup.moshi.Moshi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SkinTypeConverter_Factory implements Factory<SkinTypeConverter> {
  private final Provider<Moshi> moshiProvider;

  public SkinTypeConverter_Factory(Provider<Moshi> moshiProvider) {
    this.moshiProvider = moshiProvider;
  }

  @Override
  public SkinTypeConverter get() {
    return newInstance(moshiProvider.get());
  }

  public static SkinTypeConverter_Factory create(Provider<Moshi> moshiProvider) {
    return new SkinTypeConverter_Factory(moshiProvider);
  }

  public static SkinTypeConverter newInstance(Moshi moshi) {
    return new SkinTypeConverter(moshi);
  }
}