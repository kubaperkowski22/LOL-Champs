// Generated by Dagger (https://dagger.dev).
package com.ready.lolchamps.di;

import com.ready.lolchamps.db.ImageTypeConverter;
import com.squareup.moshi.Moshi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DBModule_ProvideImageTypeConverterFactory implements Factory<ImageTypeConverter> {
  private final Provider<Moshi> moshiProvider;

  public DBModule_ProvideImageTypeConverterFactory(Provider<Moshi> moshiProvider) {
    this.moshiProvider = moshiProvider;
  }

  @Override
  public ImageTypeConverter get() {
    return provideImageTypeConverter(moshiProvider.get());
  }

  public static DBModule_ProvideImageTypeConverterFactory create(Provider<Moshi> moshiProvider) {
    return new DBModule_ProvideImageTypeConverterFactory(moshiProvider);
  }

  public static ImageTypeConverter provideImageTypeConverter(Moshi moshi) {
    return Preconditions.checkNotNullFromProvides(DBModule.INSTANCE.provideImageTypeConverter(moshi));
  }
}
