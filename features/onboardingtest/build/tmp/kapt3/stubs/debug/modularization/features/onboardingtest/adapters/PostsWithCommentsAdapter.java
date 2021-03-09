package modularization.features.onboardingtest.adapters;

import java.lang.System;

/**
 * @author Anand M Joseph (anandmampuzhakal@hotmail.com)
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B%\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J(\u0010\u0019\u001a\u00020\u00122\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u0004j\b\u0012\u0004\u0012\u00020\u001b`\u00062\u0006\u0010\u0013\u001a\u00020\u0002H\u0002J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J&\u0010\u001f\u001a\u00020\u00122\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u0004j\b\u0012\u0004\u0012\u00020\u001b`\u00062\u0006\u0010\u0014\u001a\u00020\u0010R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R*\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0004j\b\u0012\u0004\u0012\u00020\u0002`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lmodularization/features/onboardingtest/adapters/PostsWithCommentsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lmodularization/features/onboardingtest/adapters/PostsWithCommentsAdapter$PostsWithCommentsHolder;", "list", "Ljava/util/ArrayList;", "Lcom/nz/anand/network/model/PostWithComments;", "Lkotlin/collections/ArrayList;", "onClickListener", "Lmodularization/features/onboardingtest/callback/OnItemClickListener;", "(Ljava/util/ArrayList;Lmodularization/features/onboardingtest/callback/OnItemClickListener;)V", "myViewHolders", "getMyViewHolders", "()Ljava/util/ArrayList;", "setMyViewHolders", "(Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setCommentsList", "comments", "Lcom/nz/anand/network/model/CommentsData;", "showProgressRight", "button", "Landroid/widget/Button;", "updateComments", "PostsWithCommentsHolder", "onboardingtest_debug"})
public final class PostsWithCommentsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<modularization.features.onboardingtest.adapters.PostsWithCommentsAdapter.PostsWithCommentsHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<modularization.features.onboardingtest.adapters.PostsWithCommentsAdapter.PostsWithCommentsHolder> myViewHolders;
    private java.util.ArrayList<com.nz.anand.network.model.PostWithComments> list;
    private final modularization.features.onboardingtest.callback.OnItemClickListener onClickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<modularization.features.onboardingtest.adapters.PostsWithCommentsAdapter.PostsWithCommentsHolder> getMyViewHolders() {
        return null;
    }
    
    public final void setMyViewHolders(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<modularization.features.onboardingtest.adapters.PostsWithCommentsAdapter.PostsWithCommentsHolder> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public modularization.features.onboardingtest.adapters.PostsWithCommentsAdapter.PostsWithCommentsHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    modularization.features.onboardingtest.adapters.PostsWithCommentsAdapter.PostsWithCommentsHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    private final void showProgressRight(android.widget.Button button) {
    }
    
    public final void updateComments(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.nz.anand.network.model.CommentsData> comments, int position) {
    }
    
    private final void setCommentsList(java.util.ArrayList<com.nz.anand.network.model.CommentsData> comments, modularization.features.onboardingtest.adapters.PostsWithCommentsAdapter.PostsWithCommentsHolder holder) {
    }
    
    public PostsWithCommentsAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.nz.anand.network.model.PostWithComments> list, @org.jetbrains.annotations.NotNull()
    modularization.features.onboardingtest.callback.OnItemClickListener onClickListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\u0004\u00a8\u0006#"}, d2 = {"Lmodularization/features/onboardingtest/adapters/PostsWithCommentsAdapter$PostsWithCommentsHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "buttonRecyclerview", "Landroidx/recyclerview/widget/RecyclerView;", "getButtonRecyclerview", "()Landroidx/recyclerview/widget/RecyclerView;", "setButtonRecyclerview", "(Landroidx/recyclerview/widget/RecyclerView;)V", "commentsAdapter", "Lmodularization/features/onboardingtest/adapters/CommentsAdapter;", "getCommentsAdapter", "()Lmodularization/features/onboardingtest/adapters/CommentsAdapter;", "setCommentsAdapter", "(Lmodularization/features/onboardingtest/adapters/CommentsAdapter;)V", "commentsButton", "Landroid/widget/Button;", "getCommentsButton", "()Landroid/widget/Button;", "setCommentsButton", "(Landroid/widget/Button;)V", "postBodyTxt", "Landroid/widget/TextView;", "getPostBodyTxt", "()Landroid/widget/TextView;", "setPostBodyTxt", "(Landroid/widget/TextView;)V", "titleTxt", "getTitleTxt", "setTitleTxt", "getView", "()Landroid/view/View;", "setView", "onboardingtest_debug"})
    public static final class PostsWithCommentsHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView titleTxt;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView postBodyTxt;
        @org.jetbrains.annotations.NotNull()
        private android.widget.Button commentsButton;
        @org.jetbrains.annotations.NotNull()
        private androidx.recyclerview.widget.RecyclerView buttonRecyclerview;
        public modularization.features.onboardingtest.adapters.CommentsAdapter commentsAdapter;
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
        public final android.widget.TextView getPostBodyTxt() {
            return null;
        }
        
        public final void setPostBodyTxt(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.Button getCommentsButton() {
            return null;
        }
        
        public final void setCommentsButton(@org.jetbrains.annotations.NotNull()
        android.widget.Button p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.RecyclerView getButtonRecyclerview() {
            return null;
        }
        
        public final void setButtonRecyclerview(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final modularization.features.onboardingtest.adapters.CommentsAdapter getCommentsAdapter() {
            return null;
        }
        
        public final void setCommentsAdapter(@org.jetbrains.annotations.NotNull()
        modularization.features.onboardingtest.adapters.CommentsAdapter p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getView() {
            return null;
        }
        
        public final void setView(@org.jetbrains.annotations.NotNull()
        android.view.View p0) {
        }
        
        public PostsWithCommentsHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}