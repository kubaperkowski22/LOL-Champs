// Generated by Dagger (https://dagger.dev).
package com.ready.lolchamps.di;

import com.ready.lolchamps.db.AppDatabase;
import com.ready.lolchamps.db.ChampionDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DBModule_ProvideChampionDaoFactory implements Factory<ChampionDao> {
  private final Provider<AppDatabase> appDatabaseProvider;

  public DBModule_ProvideChampionDaoFactory(Provider<AppDatabase> appDatabaseProvider) {
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public ChampionDao get() {
    return provideChampionDao(appDatabaseProvider.get());
  }

  public static DBModule_ProvideChampionDaoFactory create(
      Provider<AppDatabase> appDatabaseProvider) {
    return new DBModule_ProvideChampionDaoFactory(appDatabaseProvider);
  }

  public static ChampionDao provideChampionDao(AppDatabase appDatabase) {
    return Preconditions.checkNotNullFromProvides(DBModule.INSTANCE.provideChampionDao(appDatabase));
  }
}