// Generated by Dagger (https://dagger.dev).
package com.ready.lolchamps.di;

import com.squareup.moshi.Moshi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DBModule_ProvideMoshiFactory implements Factory<Moshi> {
  @Override
  public Moshi get() {
    return provideMoshi();
  }

  public static DBModule_ProvideMoshiFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Moshi provideMoshi() {
    return Preconditions.checkNotNullFromProvides(DBModule.INSTANCE.provideMoshi());
  }

  private static final class InstanceHolder {
    private static final DBModule_ProvideMoshiFactory INSTANCE = new DBModule_ProvideMoshiFactory();
  }
}