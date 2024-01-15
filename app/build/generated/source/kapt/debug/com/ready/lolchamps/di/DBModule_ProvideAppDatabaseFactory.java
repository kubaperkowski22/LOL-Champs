// Generated by Dagger (https://dagger.dev).
package com.ready.lolchamps.di;

import android.content.Context;
import com.ready.lolchamps.db.AppDatabase;
import com.ready.lolchamps.db.ImageTypeConverter;
import com.ready.lolchamps.db.PassiveTypeConverter;
import com.ready.lolchamps.db.SkinTypeConverter;
import com.ready.lolchamps.db.SpellTypeConverter;
import com.ready.lolchamps.db.StringListTypeConverter;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DBModule_ProvideAppDatabaseFactory implements Factory<AppDatabase> {
  private final Provider<Context> contextProvider;

  private final Provider<ImageTypeConverter> imageTypeConverterProvider;

  private final Provider<StringListTypeConverter> stringListTypeConverterProvider;

  private final Provider<SkinTypeConverter> skinTypeConverterProvider;

  private final Provider<SpellTypeConverter> spellTypeConverterProvider;

  private final Provider<PassiveTypeConverter> passiveTypeConverterProvider;

  public DBModule_ProvideAppDatabaseFactory(Provider<Context> contextProvider,
      Provider<ImageTypeConverter> imageTypeConverterProvider,
      Provider<StringListTypeConverter> stringListTypeConverterProvider,
      Provider<SkinTypeConverter> skinTypeConverterProvider,
      Provider<SpellTypeConverter> spellTypeConverterProvider,
      Provider<PassiveTypeConverter> passiveTypeConverterProvider) {
    this.contextProvider = contextProvider;
    this.imageTypeConverterProvider = imageTypeConverterProvider;
    this.stringListTypeConverterProvider = stringListTypeConverterProvider;
    this.skinTypeConverterProvider = skinTypeConverterProvider;
    this.spellTypeConverterProvider = spellTypeConverterProvider;
    this.passiveTypeConverterProvider = passiveTypeConverterProvider;
  }

  @Override
  public AppDatabase get() {
    return provideAppDatabase(contextProvider.get(), imageTypeConverterProvider.get(), stringListTypeConverterProvider.get(), skinTypeConverterProvider.get(), spellTypeConverterProvider.get(), passiveTypeConverterProvider.get());
  }

  public static DBModule_ProvideAppDatabaseFactory create(Provider<Context> contextProvider,
      Provider<ImageTypeConverter> imageTypeConverterProvider,
      Provider<StringListTypeConverter> stringListTypeConverterProvider,
      Provider<SkinTypeConverter> skinTypeConverterProvider,
      Provider<SpellTypeConverter> spellTypeConverterProvider,
      Provider<PassiveTypeConverter> passiveTypeConverterProvider) {
    return new DBModule_ProvideAppDatabaseFactory(contextProvider, imageTypeConverterProvider, stringListTypeConverterProvider, skinTypeConverterProvider, spellTypeConverterProvider, passiveTypeConverterProvider);
  }

  public static AppDatabase provideAppDatabase(Context context,
      ImageTypeConverter imageTypeConverter, StringListTypeConverter stringListTypeConverter,
      SkinTypeConverter skinTypeConverter, SpellTypeConverter spellTypeConverter,
      PassiveTypeConverter passiveTypeConverter) {
    return Preconditions.checkNotNullFromProvides(DBModule.INSTANCE.provideAppDatabase(context, imageTypeConverter, stringListTypeConverter, skinTypeConverter, spellTypeConverter, passiveTypeConverter));
  }
}
