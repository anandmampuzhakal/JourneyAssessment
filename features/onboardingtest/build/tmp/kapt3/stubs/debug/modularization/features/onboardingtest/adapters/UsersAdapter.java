package modularization.features.onboardingtest.adapters;

import java.lang.System;

/**
 * @author Anand M Joseph (anandmampuzhakal@hotmail.com)
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0014B%\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lmodularization/features/onboardingtest/adapters/UsersAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lmodularization/features/onboardingtest/adapters/UsersAdapter$MyViewHolder;", "list", "Ljava/util/ArrayList;", "Lcom/nz/anand/network/model/User;", "Lkotlin/collections/ArrayList;", "onClickListener", "Lmodularization/features/onboardingtest/callback/OnItemClickListener;", "(Ljava/util/ArrayList;Lmodularization/features/onboardingtest/callback/OnItemClickListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MyViewHolder", "onboardingtest_debug"})
public final class UsersAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<modularization.features.onboardingtest.adapters.UsersAdapter.MyViewHolder> {
    private java.util.ArrayList<com.nz.anand.network.model.User> list;
    private final modularization.features.onboardingtest.callback.OnItemClickListener onClickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public modularization.features.onboardingtest.adapters.UsersAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    modularization.features.onboardingtest.adapters.UsersAdapter.MyViewHolder holder, int position) {
    }
    
    public UsersAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.nz.anand.network.model.User> list, @org.jetbrains.annotations.NotNull()
    modularization.features.onboardingtest.callback.OnItemClickListener onClickListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006\u0018"}, d2 = {"Lmodularization/features/onboardingtest/adapters/UsersAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lmodularization/features/onboardingtest/adapters/UsersAdapter;Landroid/view/View;)V", "postButton", "Landroid/widget/Button;", "getPostButton", "()Landroid/widget/Button;", "setPostButton", "(Landroid/widget/Button;)V", "userEmailTxt", "Landroid/widget/TextView;", "getUserEmailTxt", "()Landroid/widget/TextView;", "setUserEmailTxt", "(Landroid/widget/TextView;)V", "userNameTxt", "getUserNameTxt", "setUserNameTxt", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "onboardingtest_debug"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView userNameTxt;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView userEmailTxt;
        @org.jetbrains.annotations.NotNull()
        private android.widget.Button postButton;
        @org.jetbrains.annotations.NotNull()
        private android.view.View view;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getUserNameTxt() {
            return null;
        }
        
        public final void setUserNameTxt(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getUserEmailTxt() {
            return null;
        }
        
        public final void setUserEmailTxt(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.Button getPostButton() {
            return null;
        }
        
        public final void setPostButton(@org.jetbrains.annotations.NotNull()
        android.widget.Button p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getView() {
            return null;
        }
        
        public final void setView(@org.jetbrains.annotations.NotNull()
        android.view.View p0) {
        }
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}