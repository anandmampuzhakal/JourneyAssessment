package modularization.features.onboardingtest.viewmodel;

import java.lang.System;

/**
 * @author Anand M Joseph (anandmampuzhakal@hotmail.com)
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lmodularization/features/onboardingtest/viewmodel/GetUsersViewModel;", "Lcom/nz/anand/mvvmlibrary/mvvm/MVVMBaseViewModel;", "()V", "listData", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/nz/anand/network/model/User;", "getListData", "()Landroidx/lifecycle/MutableLiveData;", "setListData", "(Landroidx/lifecycle/MutableLiveData;)V", "onboardingtest_debug"})
public final class GetUsersViewModel extends com.nz.anand.mvvmlibrary.mvvm.MVVMBaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.nz.anand.network.model.User>> listData;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.nz.anand.network.model.User>> getListData() {
        return null;
    }
    
    public final void setListData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.nz.anand.network.model.User>> p0) {
    }
    
    public GetUsersViewModel() {
        super();
    }
}