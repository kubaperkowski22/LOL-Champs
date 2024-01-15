package com.ready.lolchamps.databinding;
import com.ready.lolchamps.R;
import com.ready.lolchamps.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDetailBindingImpl extends ActivityDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(15);
        sIncludes.setIncludes(1, 
            new String[] {"view_passive_info", "view_spell_info", "view_spell_info", "view_spell_info", "view_spell_info"},
            new int[] {9, 10, 11, 12, 13},
            new int[] {com.ready.lolchamps.R.layout.view_passive_info,
                com.ready.lolchamps.R.layout.view_spell_info,
                com.ready.lolchamps.R.layout.view_spell_info,
                com.ready.lolchamps.R.layout.view_spell_info,
                com.ready.lolchamps.R.layout.view_spell_info});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.app_bar_layout, 14);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private ActivityDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , (com.google.android.material.appbar.AppBarLayout) bindings[14]
            , (android.widget.TextView) bindings[7]
            , (com.google.android.material.chip.ChipGroup) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (com.ready.lolchamps.databinding.ViewSpellInfoBinding) bindings[12]
            , (android.widget.ProgressBar) bindings[3]
            , (com.ready.lolchamps.databinding.ViewPassiveInfoBinding) bindings[9]
            , (com.ready.lolchamps.databinding.ViewSpellInfoBinding) bindings[10]
            , (com.ready.lolchamps.databinding.ViewSpellInfoBinding) bindings[13]
            , (com.jackandphantom.carouselrecyclerview.CarouselRecyclerview) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (com.ready.lolchamps.databinding.ViewSpellInfoBinding) bindings[11]
            );
        this.championDescView.setTag(null);
        this.championTagsView.setTag(null);
        this.championTitleView.setTag(null);
        setContainedBinding(this.eSpellView);
        this.loadingBar.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        setContainedBinding(this.passiveSpellView);
        setContainedBinding(this.qSpellView);
        setContainedBinding(this.rSpellView);
        this.skinRecyclerView.setTag(null);
        this.splashImageView.setTag(null);
        setContainedBinding(this.wSpellView);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
        }
        passiveSpellView.invalidateAll();
        qSpellView.invalidateAll();
        wSpellView.invalidateAll();
        eSpellView.invalidateAll();
        rSpellView.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (passiveSpellView.hasPendingBindings()) {
            return true;
        }
        if (qSpellView.hasPendingBindings()) {
            return true;
        }
        if (wSpellView.hasPendingBindings()) {
            return true;
        }
        if (eSpellView.hasPendingBindings()) {
            return true;
        }
        if (rSpellView.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.vm == variableId) {
            setVm((com.ready.lolchamps.ui.detail.DetailViewModel) variable);
        }
        else if (BR.adapter == variableId) {
            setAdapter((com.ready.lolchamps.ui.detail.SkinAdapter) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.ready.lolchamps.ui.detail.DetailViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setAdapter(@Nullable com.ready.lolchamps.ui.detail.SkinAdapter Adapter) {
        this.mAdapter = Adapter;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.adapter);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        passiveSpellView.setLifecycleOwner(lifecycleOwner);
        qSpellView.setLifecycleOwner(lifecycleOwner);
        wSpellView.setLifecycleOwner(lifecycleOwner);
        eSpellView.setLifecycleOwner(lifecycleOwner);
        rSpellView.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeWSpellView((com.ready.lolchamps.databinding.ViewSpellInfoBinding) object, fieldId);
            case 1 :
                return onChangeESpellView((com.ready.lolchamps.databinding.ViewSpellInfoBinding) object, fieldId);
            case 2 :
                return onChangePassiveSpellView((com.ready.lolchamps.databinding.ViewPassiveInfoBinding) object, fieldId);
            case 3 :
                return onChangeRSpellView((com.ready.lolchamps.databinding.ViewSpellInfoBinding) object, fieldId);
            case 4 :
                return onChangeVmChampionInfo((kotlinx.coroutines.flow.StateFlow<com.ready.lolchamps.model.ChampionInfo>) object, fieldId);
            case 5 :
                return onChangeQSpellView((com.ready.lolchamps.databinding.ViewSpellInfoBinding) object, fieldId);
            case 6 :
                return onChangeVmUiState((kotlinx.coroutines.flow.StateFlow<com.ready.lolchamps.ui.base.UiState<com.ready.lolchamps.model.ChampionInfo>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeWSpellView(com.ready.lolchamps.databinding.ViewSpellInfoBinding WSpellView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeESpellView(com.ready.lolchamps.databinding.ViewSpellInfoBinding ESpellView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangePassiveSpellView(com.ready.lolchamps.databinding.ViewPassiveInfoBinding PassiveSpellView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRSpellView(com.ready.lolchamps.databinding.ViewSpellInfoBinding RSpellView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmChampionInfo(kotlinx.coroutines.flow.StateFlow<com.ready.lolchamps.model.ChampionInfo> VmChampionInfo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeQSpellView(com.ready.lolchamps.databinding.ViewSpellInfoBinding QSpellView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmUiState(kotlinx.coroutines.flow.StateFlow<com.ready.lolchamps.ui.base.UiState<com.ready.lolchamps.model.ChampionInfo>> VmUiState, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
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
        java.util.List<java.lang.String> vmChampionInfoTags = null;
        java.lang.String vmChampionInfoLore = null;
        com.ready.lolchamps.ui.base.UiState<com.ready.lolchamps.model.ChampionInfo> vmUiStateGetValue = null;
        com.ready.lolchamps.ui.detail.DetailViewModel vm = mVm;
        java.lang.Throwable uiStateKtThrowableOrNullVmUiState = null;
        java.util.List<com.ready.lolchamps.model.ChampionInfo.Skin> vmChampionInfoSkins = null;
        kotlinx.coroutines.flow.StateFlow<com.ready.lolchamps.model.ChampionInfo> vmChampionInfo = null;
        java.util.List<com.ready.lolchamps.model.ChampionInfo.Spell> vmChampionInfoSpells = null;
        java.lang.String vmChampionInfoName = null;
        java.lang.String uriHelperGetSplashImageUriVmChampionInfoId = null;
        java.lang.String vmChampionInfoTitle = null;
        com.ready.lolchamps.ui.detail.SkinAdapter adapter = mAdapter;
        kotlinx.coroutines.flow.StateFlow<com.ready.lolchamps.ui.base.UiState<com.ready.lolchamps.model.ChampionInfo>> vmUiState = null;
        java.lang.String vmChampionInfoId = null;
        com.ready.lolchamps.model.ChampionInfo vmChampionInfoGetValue = null;
        com.ready.lolchamps.model.ChampionInfo.Passive vmChampionInfoPassive = null;

        if ((dirtyFlags & 0x2d0L) != 0) {


            if ((dirtyFlags & 0x290L) != 0) {

                    if (vm != null) {
                        // read vm.championInfo
                        vmChampionInfo = vm.getChampionInfo();
                    }
                    androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(this, 4, vmChampionInfo);


                    if (vmChampionInfo != null) {
                        // read vm.championInfo.getValue()
                        vmChampionInfoGetValue = vmChampionInfo.getValue();
                    }


                    if (vmChampionInfoGetValue != null) {
                        // read vm.championInfo.getValue().tags
                        vmChampionInfoTags = vmChampionInfoGetValue.getTags();
                        // read vm.championInfo.getValue().lore
                        vmChampionInfoLore = vmChampionInfoGetValue.getLore();
                        // read vm.championInfo.getValue().skins
                        vmChampionInfoSkins = vmChampionInfoGetValue.getSkins();
                        // read vm.championInfo.getValue().spells
                        vmChampionInfoSpells = vmChampionInfoGetValue.getSpells();
                        // read vm.championInfo.getValue().name
                        vmChampionInfoName = vmChampionInfoGetValue.getName();
                        // read vm.championInfo.getValue().title
                        vmChampionInfoTitle = vmChampionInfoGetValue.getTitle();
                        // read vm.championInfo.getValue().id
                        vmChampionInfoId = vmChampionInfoGetValue.getId();
                        // read vm.championInfo.getValue().passive
                        vmChampionInfoPassive = vmChampionInfoGetValue.getPassive();
                    }


                    // read UriHelper.getSplashImageUri(vm.championInfo.getValue().id)
                    uriHelperGetSplashImageUriVmChampionInfoId = com.ready.lolchamps.utils.UriHelperKt.getSplashImageUri(vmChampionInfoId);
            }
            if ((dirtyFlags & 0x2c0L) != 0) {

                    if (vm != null) {
                        // read vm.uiState
                        vmUiState = vm.getUiState();
                    }
                    androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(this, 6, vmUiState);


                    if (vmUiState != null) {
                        // read vm.uiState.getValue()
                        vmUiStateGetValue = vmUiState.getValue();
                    }


                    // read UiStateKt.throwableOrNull(vm.uiState.getValue())
                    uiStateKtThrowableOrNullVmUiState = com.ready.lolchamps.ui.base.UiStateKt.throwableOrNull(vmUiStateGetValue);
            }
        }
        if ((dirtyFlags & 0x300L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x290L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.championDescView, vmChampionInfoLore);
            com.ready.lolchamps.utils.BindingAdaptersKt.bindTags(this.championTagsView, vmChampionInfoTags);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.championTitleView, vmChampionInfoTitle);
            this.eSpellView.setSpellList(vmChampionInfoSpells);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, vmChampionInfoName);
            this.passiveSpellView.setPassive(vmChampionInfoPassive);
            this.qSpellView.setSpellList(vmChampionInfoSpells);
            this.rSpellView.setSpellList(vmChampionInfoSpells);
            com.ready.lolchamps.utils.BindingAdaptersKt.bindSkinItems(this.skinRecyclerView, vmChampionInfoSkins);
            com.ready.lolchamps.utils.BindingAdaptersKt.bindImage(this.splashImageView, uriHelperGetSplashImageUriVmChampionInfoId);
            this.wSpellView.setSpellList(vmChampionInfoSpells);
        }
        if ((dirtyFlags & 0x200L) != 0) {
            // api target 1

            this.eSpellView.setCommand("E");
            this.eSpellView.setIndex(2);
            this.qSpellView.setCommand("Q");
            this.qSpellView.setIndex(0);
            this.rSpellView.setCommand("R");
            this.rSpellView.setIndex(3);
            this.wSpellView.setCommand("W");
            this.wSpellView.setIndex(1);
        }
        if ((dirtyFlags & 0x2c0L) != 0) {
            // api target 1

            com.ready.lolchamps.utils.BindingAdaptersKt.bindShow(this.loadingBar, vmUiStateGetValue);
            com.ready.lolchamps.utils.BindingAdaptersKt.bindToast(this.mboundView1, uiStateKtThrowableOrNullVmUiState);
        }
        if ((dirtyFlags & 0x300L) != 0) {
            // api target 1

            com.ready.lolchamps.utils.BindingAdaptersKt.bindSkinAdapter(this.skinRecyclerView, adapter);
        }
        executeBindingsOn(passiveSpellView);
        executeBindingsOn(qSpellView);
        executeBindingsOn(wSpellView);
        executeBindingsOn(eSpellView);
        executeBindingsOn(rSpellView);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): wSpellView
        flag 1 (0x2L): eSpellView
        flag 2 (0x3L): passiveSpellView
        flag 3 (0x4L): rSpellView
        flag 4 (0x5L): vm.championInfo
        flag 5 (0x6L): qSpellView
        flag 6 (0x7L): vm.uiState
        flag 7 (0x8L): vm
        flag 8 (0x9L): adapter
        flag 9 (0xaL): null
    flag mapping end*/
    //end
}