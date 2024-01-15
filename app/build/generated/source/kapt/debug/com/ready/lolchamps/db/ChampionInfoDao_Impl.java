package com.ready.lolchamps.db;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.ready.lolchamps.model.ChampionInfo;
import com.ready.lolchamps.model.Image;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ChampionInfoDao_Impl implements ChampionInfoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ChampionInfo> __insertionAdapterOfChampionInfo;

  private ImageTypeConverter __imageTypeConverter;

  private StringListTypeConverter __stringListTypeConverter;

  private SkinTypeConverter __skinTypeConverter;

  private SpellTypeConverter __spellTypeConverter;

  private PassiveTypeConverter __passiveTypeConverter;

  public ChampionInfoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfChampionInfo = new EntityInsertionAdapter<ChampionInfo>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `ChampionInfo` (`id`,`name`,`title`,`lore`,`image`,`tags`,`skins`,`spells`,`passive`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ChampionInfo value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
        if (value.getLore() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getLore());
        }
        final String _tmp;
        _tmp = __imageTypeConverter().fromImage(value.getImage());
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = __stringListTypeConverter().fromImage(value.getTags());
        if (_tmp_1 == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, _tmp_1);
        }
        final String _tmp_2;
        _tmp_2 = __skinTypeConverter().fromImage(value.getSkins());
        if (_tmp_2 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, _tmp_2);
        }
        final String _tmp_3;
        _tmp_3 = __spellTypeConverter().fromImage(value.getSpells());
        if (_tmp_3 == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, _tmp_3);
        }
        final String _tmp_4;
        _tmp_4 = __passiveTypeConverter().fromImage(value.getPassive());
        if (_tmp_4 == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, _tmp_4);
        }
      }
    };
  }

  @Override
  public Object insertChampionInfo(final ChampionInfo championInfo,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfChampionInfo.insert(championInfo);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object getChampionInfo(final String id, final Continuation<? super ChampionInfo> p1) {
    final String _sql = "SELECT * FROM ChampionInfo WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<ChampionInfo>() {
      @Override
      public ChampionInfo call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfLore = CursorUtil.getColumnIndexOrThrow(_cursor, "lore");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfTags = CursorUtil.getColumnIndexOrThrow(_cursor, "tags");
          final int _cursorIndexOfSkins = CursorUtil.getColumnIndexOrThrow(_cursor, "skins");
          final int _cursorIndexOfSpells = CursorUtil.getColumnIndexOrThrow(_cursor, "spells");
          final int _cursorIndexOfPassive = CursorUtil.getColumnIndexOrThrow(_cursor, "passive");
          final ChampionInfo _result;
          if(_cursor.moveToFirst()) {
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpLore;
            if (_cursor.isNull(_cursorIndexOfLore)) {
              _tmpLore = null;
            } else {
              _tmpLore = _cursor.getString(_cursorIndexOfLore);
            }
            final Image _tmpImage;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfImage);
            }
            _tmpImage = __imageTypeConverter().fromString(_tmp);
            final List<String> _tmpTags;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfTags)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfTags);
            }
            _tmpTags = __stringListTypeConverter().fromString(_tmp_1);
            final List<ChampionInfo.Skin> _tmpSkins;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfSkins)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfSkins);
            }
            _tmpSkins = __skinTypeConverter().fromString(_tmp_2);
            final List<ChampionInfo.Spell> _tmpSpells;
            final String _tmp_3;
            if (_cursor.isNull(_cursorIndexOfSpells)) {
              _tmp_3 = null;
            } else {
              _tmp_3 = _cursor.getString(_cursorIndexOfSpells);
            }
            _tmpSpells = __spellTypeConverter().fromString(_tmp_3);
            final ChampionInfo.Passive _tmpPassive;
            final String _tmp_4;
            if (_cursor.isNull(_cursorIndexOfPassive)) {
              _tmp_4 = null;
            } else {
              _tmp_4 = _cursor.getString(_cursorIndexOfPassive);
            }
            _tmpPassive = __passiveTypeConverter().fromString(_tmp_4);
            _result = new ChampionInfo(_tmpId,_tmpName,_tmpTitle,_tmpLore,_tmpImage,_tmpTags,_tmpSkins,_tmpSpells,_tmpPassive);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Arrays.asList(ImageTypeConverter.class,StringListTypeConverter.class,SkinTypeConverter.class,SpellTypeConverter.class,PassiveTypeConverter.class);
  }

  private synchronized ImageTypeConverter __imageTypeConverter() {
    if (__imageTypeConverter == null) {
      __imageTypeConverter = __db.getTypeConverter(ImageTypeConverter.class);
    }
    return __imageTypeConverter;
  }

  private synchronized StringListTypeConverter __stringListTypeConverter() {
    if (__stringListTypeConverter == null) {
      __stringListTypeConverter = __db.getTypeConverter(StringListTypeConverter.class);
    }
    return __stringListTypeConverter;
  }

  private synchronized SkinTypeConverter __skinTypeConverter() {
    if (__skinTypeConverter == null) {
      __skinTypeConverter = __db.getTypeConverter(SkinTypeConverter.class);
    }
    return __skinTypeConverter;
  }

  private synchronized SpellTypeConverter __spellTypeConverter() {
    if (__spellTypeConverter == null) {
      __spellTypeConverter = __db.getTypeConverter(SpellTypeConverter.class);
    }
    return __spellTypeConverter;
  }

  private synchronized PassiveTypeConverter __passiveTypeConverter() {
    if (__passiveTypeConverter == null) {
      __passiveTypeConverter = __db.getTypeConverter(PassiveTypeConverter.class);
    }
    return __passiveTypeConverter;
  }
}
