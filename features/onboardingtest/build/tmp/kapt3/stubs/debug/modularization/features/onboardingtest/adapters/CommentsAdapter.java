package modularization.features.onboardingtest.adapters;

import java.lang.System;

/**
 * @author Anand M Joseph (anandmampuzhakal@hotmail.com)
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0016R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lmodularization/features/onboardingtest/adapters/CommentsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lmodularization/features/onboardingtest/adapters/CommentsAdapter$CommentsHolder;", "list", "Ljava/util/ArrayList;", "Lcom/nz/anand/network/model/CommentsData;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CommentsHolder", "onboardingtest_debug"})
public final class CommentsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<modularization.features.onboardingtest.adapters.CommentsAdapter.CommentsHolder> {
    private java.util.ArrayList<com.nz.anand.network.model.CommentsData> list;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public modularization.features.onboardingtest.adapters.CommentsAdapter.CommentsHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    modularization.features.onboardingtest.adapters.CommentsAdapter.CommentsHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public CommentsAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.nz.anand.network.model.CommentsData> list) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0004\u00a8\u0006\u0014"}, d2 = {"Lmodularization/features/onboardingtest/adapters/CommentsAdapter$CommentsHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "commentsBodyTxt", "Landroid/widget/TextView;", "getCommentsBodyTxt", "()Landroid/widget/TextView;", "setCommentsBodyTxt", "(Landroid/widget/TextView;)V", "commentsEmailTxt", "getCommentsEmailTxt", "setCommentsEmailTxt", "titleTxt", "getTitleTxt", "setTitleTxt", "getView", "()Landroid/view/View;", "setView", "onboardingtest_debug"})
    public static final class CommentsHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView titleTxt;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView commentsBodyTxt;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView commentsEmailTxt;
        @org.jetbrains.annotations.NotNull()
        private android.view.View view;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTitleTxt() {
            return null;
        }
        
        public final void setTitleTxt(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getCommentsBodyTxt() {
            return null;
        }
        
        public final void setCommentsBodyTxt(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getCommentsEmailTxt() {
            return null;
        }
        
        public final void setCommentsEmailTxt(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getView() {
            return null;
        }
        
        public final void setView(@org.jetbrains.annotations.NotNull()
        android.view.View p0) {
        }
        
        public CommentsHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}