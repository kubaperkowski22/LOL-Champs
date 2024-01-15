package com.ready.lolchamps.databinding;
import com.ready.lolchamps.R;
import com.ready.lolchamps.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ViewSpellInfoBindingImpl extends ViewSpellInfoBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ViewSpellInfoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ViewSpellInfoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.spellCommandTextView.setTag(null);
        this.spellDescView.setTag(null);
        this.spellIconView.setTag(null);
        this.spellTitleView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.spellList == variableId) {
            setSpellList((java.util.List<com.ready.lolchamps.model.ChampionInfo.Spell>) variable);
        }
        else if (BR.index == variableId) {
            setIndex((int) variable);
        }
        else if (BR.command == variableId) {
            setCommand((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSpellList(@Nullable java.util.List<com.ready.lolchamps.model.ChampionInfo.Spell> SpellList) {
        this.mSpellList = SpellList;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.spellList);
        super.requestRebind();
    }
    public void setIndex(int Index) {
        this.mIndex = Index;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.index);
        super.requestRebind();
    }
    public void setCommand(@Nullable java.lang.String Command) {
        this.mCommand = Command;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.command);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String indexSpellListSizeUriHelperGetSpellImageUriSpellListGetIndexIdJavaLangObjectNull = null;
        java.util.List<com.ready.lolchamps.model.ChampionInfo.Spell> spellList = mSpellList;
        java.lang.String spellListGetIndexDescription = null;
        java.lang.String indexSpellListSizeSpellListGetIndexDescriptionJavaLangObjectNull = null;
        int index = mIndex;
        java.lang.String command = mCommand;
        java.lang.String uriHelperGetSpellImageUriSpellListGetIndexId = null;
        com.ready.lolchamps.model.ChampionInfo.Spell spellListGetIndex = null;
        java.lang.String spellListGetIndexId = null;
        int spellListSize = 0;
        java.lang.String indexSpellListSizeSpellListGetIndexNameJavaLangObjectNull = null;
        boolean indexSpellListSize = false;
        java.lang.String spellListGetIndexName = null;

        if ((dirtyFlags & 0xbL) != 0) {



                if (spellList != null) {
                    // read spellList.size()
                    spellListSize = spellList.size();
                }


                // read index < spellList.size()
                indexSpellListSize = (index) < (spellListSize);
            if((dirtyFlags & 0xbL) != 0) {
                if(indexSpellListSize) {
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x80L;
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                        dirtyFlags |= 0x100L;
                }
            }
        }
        if ((dirtyFlags & 0xcL) != 0) {
        }
        // batch finished

        if ((dirtyFlags & 0x2a0L) != 0) {

                if (spellList != null) {
                    // read spellList.get(index)
                    spellListGetIndex = spellList.get(index);
                }

            if ((dirtyFlags & 0x80L) != 0) {

                    if (spellListGetIndex != null) {
                        // read spellList.get(index).description
                        spellListGetIndexDescription = spellListGetIndex.getDescription();
                    }
            }
            if ((dirtyFlags & 0x20L) != 0) {

                    if (spellListGetIndex != null) {
                        // read spellList.get(index).id
                        spellListGetIndexId = spellListGetIndex.getId();
                    }


                    // read UriHelper.getSpellImageUri(spellList.get(index).id)
                    uriHelperGetSpellImageUriSpellListGetIndexId = com.ready.lolchamps.utils.UriHelperKt.getSpellImageUri(spellListGetIndexId);
            }
            if ((dirtyFlags & 0x200L) != 0) {

                    if (spellListGetIndex != null) {
                        // read spellList.get(index).name
                        spellListGetIndexName = spellListGetIndex.getName();
                    }
            }
        }

        if ((dirtyFlags & 0xbL) != 0) {

                // read index < spellList.size() ? UriHelper.getSpellImageUri(spellList.get(index).id) : null
                indexSpellListSizeUriHelperGetSpellImageUriSpellListGetIndexIdJavaLangObjectNull = ((indexSpellListSize) ? (uriHelperGetSpellImageUriSpellListGetIndexId) : (null));
                // read index < spellList.size() ? spellList.get(index).description : null
                indexSpellListSizeSpellListGetIndexDescriptionJavaLangObjectNull = ((indexSpellListSize) ? (spellListGetIndexDescription) : (null));
                // read index < spellList.size() ? spellList.get(index).name : null
                indexSpellListSizeSpellListGetIndexNameJavaLangObjectNull = ((indexSpellListSize) ? (spellListGetIndexName) : (null));
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.spellCommandTextView, command);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.spellDescView, indexSpellListSizeSpellListGetIndexDescriptionJavaLangObjectNull);
            com.ready.lolchamps.utils.BindingAdaptersKt.bindImage(this.spellIconView, indexSpellListSizeUriHelperGetSpellImageUriSpellListGetIndexIdJavaLangObjectNull);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.spellTitleView, indexSpellListSizeSpellListGetIndexNameJavaLangObjectNull);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): spellList
        flag 1 (0x2L): index
        flag 2 (0x3L): command
        flag 3 (0x4L): null
        flag 4 (0x5L): index < spellList.size() ? UriHelper.getSpellImageUri(spellList.get(index).id) : null
        flag 5 (0x6L): index < spellList.size() ? UriHelper.getSpellImageUri(spellList.get(index).id) : null
        flag 6 (0x7L): index < spellList.size() ? spellList.get(index).description : null
        flag 7 (0x8L): index < spellList.size() ? spellList.get(index).description : null
        flag 8 (0x9L): index < spellList.size() ? spellList.get(index).name : null
        flag 9 (0xaL): index < spellList.size() ? spellList.get(index).name : null
    flag mapping end*/
    //end
}