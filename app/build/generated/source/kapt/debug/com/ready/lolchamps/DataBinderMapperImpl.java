package com.ready.lolchamps;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.ready.lolchamps.databinding.ActivityDetailBindingImpl;
import com.ready.lolchamps.databinding.ActivityMainBindingImpl;
import com.ready.lolchamps.databinding.ItemChampionBindingImpl;
import com.ready.lolchamps.databinding.ItemChampionSkinBindingImpl;
import com.ready.lolchamps.databinding.ViewPassiveInfoBindingImpl;
import com.ready.lolchamps.databinding.ViewSpellInfoBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYDETAIL = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_ITEMCHAMPION = 3;

  private static final int LAYOUT_ITEMCHAMPIONSKIN = 4;

  private static final int LAYOUT_VIEWPASSIVEINFO = 5;

  private static final int LAYOUT_VIEWSPELLINFO = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ready.lolchamps.R.layout.activity_detail, LAYOUT_ACTIVITYDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ready.lolchamps.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ready.lolchamps.R.layout.item_champion, LAYOUT_ITEMCHAMPION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ready.lolchamps.R.layout.item_champion_skin, LAYOUT_ITEMCHAMPIONSKIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ready.lolchamps.R.layout.view_passive_info, LAYOUT_VIEWPASSIVEINFO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ready.lolchamps.R.layout.view_spell_info, LAYOUT_VIEWSPELLINFO);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYDETAIL: {
          if ("layout/activity_detail_0".equals(tag)) {
            return new ActivityDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCHAMPION: {
          if ("layout/item_champion_0".equals(tag)) {
            return new ItemChampionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_champion is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCHAMPIONSKIN: {
          if ("layout/item_champion_skin_0".equals(tag)) {
            return new ItemChampionSkinBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_champion_skin is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWPASSIVEINFO: {
          if ("layout/view_passive_info_0".equals(tag)) {
            return new ViewPassiveInfoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for view_passive_info is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWSPELLINFO: {
          if ("layout/view_spell_info_0".equals(tag)) {
            return new ViewSpellInfoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for view_spell_info is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(11);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "adapter");
      sKeys.put(2, "champion");
      sKeys.put(3, "championId");
      sKeys.put(4, "command");
      sKeys.put(5, "index");
      sKeys.put(6, "itemDecoration");
      sKeys.put(7, "passive");
      sKeys.put(8, "skin");
      sKeys.put(9, "spellList");
      sKeys.put(10, "vm");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/activity_detail_0", com.ready.lolchamps.R.layout.activity_detail);
      sKeys.put("layout/activity_main_0", com.ready.lolchamps.R.layout.activity_main);
      sKeys.put("layout/item_champion_0", com.ready.lolchamps.R.layout.item_champion);
      sKeys.put("layout/item_champion_skin_0", com.ready.lolchamps.R.layout.item_champion_skin);
      sKeys.put("layout/view_passive_info_0", com.ready.lolchamps.R.layout.view_passive_info);
      sKeys.put("layout/view_spell_info_0", com.ready.lolchamps.R.layout.view_spell_info);
    }
  }
}
