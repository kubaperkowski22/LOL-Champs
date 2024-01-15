package com.ready.lolchamps.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile ChampionDao _championDao;

  private volatile ChampionInfoDao _championInfoDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Champion` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ChampionInfo` (`id` TEXT NOT NULL, `name` TEXT, `title` TEXT, `lore` TEXT, `image` TEXT, `tags` TEXT, `skins` TEXT, `spells` TEXT, `passive` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2f8eca7ff0559db7fbd259a41a1ead07')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Champion`");
        _db.execSQL("DROP TABLE IF EXISTS `ChampionInfo`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsChampion = new HashMap<String, TableInfo.Column>(2);
        _columnsChampion.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChampion.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysChampion = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesChampion = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoChampion = new TableInfo("Champion", _columnsChampion, _foreignKeysChampion, _indicesChampion);
        final TableInfo _existingChampion = TableInfo.read(_db, "Champion");
        if (! _infoChampion.equals(_existingChampion)) {
          return new RoomOpenHelper.ValidationResult(false, "Champion(com.ready.lolchamps.model.Champion).\n"
                  + " Expected:\n" + _infoChampion + "\n"
                  + " Found:\n" + _existingChampion);
        }
        final HashMap<String, TableInfo.Column> _columnsChampionInfo = new HashMap<String, TableInfo.Column>(9);
        _columnsChampionInfo.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChampionInfo.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChampionInfo.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChampionInfo.put("lore", new TableInfo.Column("lore", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChampionInfo.put("image", new TableInfo.Column("image", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChampionInfo.put("tags", new TableInfo.Column("tags", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChampionInfo.put("skins", new TableInfo.Column("skins", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChampionInfo.put("spells", new TableInfo.Column("spells", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChampionInfo.put("passive", new TableInfo.Column("passive", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysChampionInfo = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesChampionInfo = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoChampionInfo = new TableInfo("ChampionInfo", _columnsChampionInfo, _foreignKeysChampionInfo, _indicesChampionInfo);
        final TableInfo _existingChampionInfo = TableInfo.read(_db, "ChampionInfo");
        if (! _infoChampionInfo.equals(_existingChampionInfo)) {
          return new RoomOpenHelper.ValidationResult(false, "ChampionInfo(com.ready.lolchamps.model.ChampionInfo).\n"
                  + " Expected:\n" + _infoChampionInfo + "\n"
                  + " Found:\n" + _existingChampionInfo);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "2f8eca7ff0559db7fbd259a41a1ead07", "77ff983309d5c1a479ee6654866686f9");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Champion","ChampionInfo");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Champion`");
      _db.execSQL("DELETE FROM `ChampionInfo`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(ChampionDao.class, ChampionDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(ChampionInfoDao.class, ChampionInfoDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public ChampionDao championDao() {
    if (_championDao != null) {
      return _championDao;
    } else {
      synchronized(this) {
        if(_championDao == null) {
          _championDao = new ChampionDao_Impl(this);
        }
        return _championDao;
      }
    }
  }

  @Override
  public ChampionInfoDao championInfoDao() {
    if (_championInfoDao != null) {
      return _championInfoDao;
    } else {
      synchronized(this) {
        if(_championInfoDao == null) {
          _championInfoDao = new ChampionInfoDao_Impl(this);
        }
        return _championInfoDao;
      }
    }
  }
}
