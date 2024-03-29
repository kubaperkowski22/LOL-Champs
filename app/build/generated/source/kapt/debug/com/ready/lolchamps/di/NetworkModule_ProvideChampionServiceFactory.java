// Generated by Dagger (https://dagger.dev).
package com.ready.lolchamps.di;

import com.ready.lolchamps.network.ChampionService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideChampionServiceFactory implements Factory<ChampionService> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideChampionServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ChampionService get() {
    return provideChampionService(retrofitProvider.get());
  }

  public static NetworkModule_ProvideChampionServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideChampionServiceFactory(retrofitProvider);
  }

  public static ChampionService provideChampionService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideChampionService(retrofit));
  }
}
