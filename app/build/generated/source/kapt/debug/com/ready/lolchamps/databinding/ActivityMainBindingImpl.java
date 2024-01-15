package com.ready.lolchamps.databinding;
import com.ready.lolchamps.R;
import com.ready.lolchamps.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.app_bar_layout, 3);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.appbar.AppBarLayout) bindings[3]
            , (android.widget.ProgressBar) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            );
        this.loadingBar.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.recyclerView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.vm == variableId) {
            setVm((com.ready.lolchamps.ui.main.MainViewModel) variable);
        }
        else if (BR.adapter == variableId) {
            setAdapter((com.ready.lolchamps.ui.main.ChampionAdapter) variable);
        }
        else if (BR.itemDecoration == variableId) {
            setItemDecoration((com.ready.lolchamps.ui.main.ChampionItemDecoration) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.ready.lolchamps.ui.main.MainViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setAdapter(@Nullable com.ready.lolchamps.ui.main.ChampionAdapter Adapter) {
        this.mAdapter = Adapter;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.adapter);
        super.requestRebind();
    }
    public void setItemDecoration(@Nullable com.ready.lolchamps.ui.main.ChampionItemDecoration ItemDecoration) {
        this.mItemDecoration = ItemDecoration;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.itemDecoration);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmUiState((kotlinx.coroutines.flow.StateFlow<com.ready.lolchamps.ui.base.UiState<java.util.List<com.ready.lolchamps.model.Champion>>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmUiState(kotlinx.coroutines.flow.StateFlow<com.ready.lolchamps.ui.base.UiState<java.util.List<com.ready.lolchamps.model.Champion>>> VmUiState, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        com.ready.lolchamps.ui.main.MainViewModel vm = mVm;
        java.lang.Throwable uiStateKtThrowableOrNullVmUiState = null;
        com.ready.lolchamps.ui.main.ChampionAdapter adapter = mAdapter;
        kotlinx.coroutines.flow.StateFlow<com.ready.lolchamps.ui.base.UiState<java.util.List<com.ready.lolchamps.model.Champion>>> vmUiState = null;
        com.ready.lolchamps.ui.base.UiState<java.util.List<com.ready.lolchamps.model.Champion>> vmUiStateGetValue = null;
        com.ready.lolchamps.ui.main.ChampionItemDecoration itemDecoration = mItemDecoration;

        if ((dirtyFlags & 0x13L) != 0) {



                if (vm != null) {
                    // read vm.uiState
                    vmUiState = vm.getUiState();
                }
                androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(this, 0, vmUiState);


                if (vmUiState != null) {
                    // read vm.uiState.getValue()
                    vmUiStateGetValue = vmUiState.getValue();
                }


                // read UiStateKt.throwableOrNull(vm.uiState.getValue())
                uiStateKtThrowableOrNullVmUiState = com.ready.lolchamps.ui.base.UiStateKt.throwableOrNull(vmUiStateGetValue);
        }
        if ((dirtyFlags & 0x14L) != 0) {
        }
        if ((dirtyFlags & 0x18L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x13L) != 0) {
            // api target 1

            com.ready.lolchamps.utils.BindingAdaptersKt.bindShow(this.loadingBar, vmUiStateGetValue);
            com.ready.lolchamps.utils.BindingAdaptersKt.bindToast(this.recyclerView, uiStateKtThrowableOrNullVmUiState);
            com.ready.lolchamps.utils.BindingAdaptersKt.bindChampionItems(this.recyclerView, vmUiStateGetValue);
        }
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            com.ready.lolchamps.utils.BindingAdaptersKt.bindAdapter(this.recyclerView, adapter);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            com.ready.lolchamps.utils.BindingAdaptersKt.bindItemDecoration(this.recyclerView, itemDecoration);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.uiState
        flag 1 (0x2L): vm
        flag 2 (0x3L): adapter
        flag 3 (0x4L): itemDecoration
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}