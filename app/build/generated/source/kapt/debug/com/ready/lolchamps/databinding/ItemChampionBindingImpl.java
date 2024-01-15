package com.ready.lolchamps.databinding;
import com.ready.lolchamps.R;
import com.ready.lolchamps.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemChampionBindingImpl extends ItemChampionBinding  {

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
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemChampionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ItemChampionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            );
        this.championSplashImage.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
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
        if (BR.champion == variableId) {
            setChampion((com.ready.lolchamps.model.Champion) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setChampion(@Nullable com.ready.lolchamps.model.Champion Champion) {
        this.mChampion = Champion;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.champion);
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
        java.lang.String uriHelperGetSplashImageUriChampionId = null;
        java.lang.String championId = null;
        com.ready.lolchamps.model.Champion champion = mChampion;
        java.lang.String championName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (champion != null) {
                    // read champion.id
                    championId = champion.getId();
                    // read champion.name
                    championName = champion.getName();
                }


                // read UriHelper.getSplashImageUri(champion.id)
                uriHelperGetSplashImageUriChampionId = com.ready.lolchamps.utils.UriHelperKt.getSplashImageUri(championId);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.ready.lolchamps.utils.BindingAdaptersKt.bindImage(this.championSplashImage, uriHelperGetSplashImageUriChampionId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, championName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): champion
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}