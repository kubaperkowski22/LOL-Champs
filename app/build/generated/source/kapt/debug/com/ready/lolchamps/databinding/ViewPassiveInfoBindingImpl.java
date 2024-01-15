package com.ready.lolchamps.databinding;
import com.ready.lolchamps.R;
import com.ready.lolchamps.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ViewPassiveInfoBindingImpl extends ViewPassiveInfoBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.spell_command_text_view, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ViewPassiveInfoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ViewPassiveInfoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
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
                mDirtyFlags = 0x2L;
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
        if (BR.passive == variableId) {
            setPassive((com.ready.lolchamps.model.ChampionInfo.Passive) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPassive(@Nullable com.ready.lolchamps.model.ChampionInfo.Passive Passive) {
        this.mPassive = Passive;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.passive);
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
        com.ready.lolchamps.model.Image passiveImage = null;
        com.ready.lolchamps.model.ChampionInfo.Passive passive = mPassive;
        java.lang.String passiveImageFileName = null;
        java.lang.String passiveJavaLangObjectNullPassiveNameJavaLangObjectNull = null;
        java.lang.String passiveName = null;
        java.lang.String passiveJavaLangObjectNullUriHelperGetPassiveImageUriPassiveImageFileNameJavaLangObjectNull = null;
        boolean passiveJavaLangObjectNull = false;
        java.lang.String passiveDescription = null;
        java.lang.String passiveJavaLangObjectNullPassiveDescriptionJavaLangObjectNull = null;
        java.lang.String uriHelperGetPassiveImageUriPassiveImageFileName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                // read passive != null
                passiveJavaLangObjectNull = (passive) != (null);
            if((dirtyFlags & 0x3L) != 0) {
                if(passiveJavaLangObjectNull) {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x4L;
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x20L) != 0) {

                if (passive != null) {
                    // read passive.image
                    passiveImage = passive.getImage();
                }


                if (passiveImage != null) {
                    // read passive.image.fileName
                    passiveImageFileName = passiveImage.getFileName();
                }


                // read UriHelper.getPassiveImageUri(passive.image.fileName)
                uriHelperGetPassiveImageUriPassiveImageFileName = com.ready.lolchamps.utils.UriHelperKt.getPassiveImageUri(passiveImageFileName);
        }
        if ((dirtyFlags & 0x8L) != 0) {

                if (passive != null) {
                    // read passive.name
                    passiveName = passive.getName();
                }
        }
        if ((dirtyFlags & 0x80L) != 0) {

                if (passive != null) {
                    // read passive.description
                    passiveDescription = passive.getDescription();
                }
        }

        if ((dirtyFlags & 0x3L) != 0) {

                // read passive != null ? passive.name : null
                passiveJavaLangObjectNullPassiveNameJavaLangObjectNull = ((passiveJavaLangObjectNull) ? (passiveName) : (null));
                // read passive != null ? UriHelper.getPassiveImageUri(passive.image.fileName) : null
                passiveJavaLangObjectNullUriHelperGetPassiveImageUriPassiveImageFileNameJavaLangObjectNull = ((passiveJavaLangObjectNull) ? (uriHelperGetPassiveImageUriPassiveImageFileName) : (null));
                // read passive != null ? passive.description : null
                passiveJavaLangObjectNullPassiveDescriptionJavaLangObjectNull = ((passiveJavaLangObjectNull) ? (passiveDescription) : (null));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.spellDescView, passiveJavaLangObjectNullPassiveDescriptionJavaLangObjectNull);
            com.ready.lolchamps.utils.BindingAdaptersKt.bindImage(this.spellIconView, passiveJavaLangObjectNullUriHelperGetPassiveImageUriPassiveImageFileNameJavaLangObjectNull);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.spellTitleView, passiveJavaLangObjectNullPassiveNameJavaLangObjectNull);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): passive
        flag 1 (0x2L): null
        flag 2 (0x3L): passive != null ? passive.name : null
        flag 3 (0x4L): passive != null ? passive.name : null
        flag 4 (0x5L): passive != null ? UriHelper.getPassiveImageUri(passive.image.fileName) : null
        flag 5 (0x6L): passive != null ? UriHelper.getPassiveImageUri(passive.image.fileName) : null
        flag 6 (0x7L): passive != null ? passive.description : null
        flag 7 (0x8L): passive != null ? passive.description : null
    flag mapping end*/
    //end
}