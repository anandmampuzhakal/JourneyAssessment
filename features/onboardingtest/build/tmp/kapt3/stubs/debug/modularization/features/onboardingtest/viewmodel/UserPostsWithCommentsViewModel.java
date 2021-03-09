package modularization.features.onboardingtest.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J)\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J$\u0010\u0013\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00150\u0004j\b\u0012\u0004\u0012\u00020\u0015`\u00060\u00142\u0006\u0010\u0016\u001a\u00020\u0011R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lmodularization/features/onboardingtest/viewmodel/UserPostsWithCommentsViewModel;", "Lcom/nz/anand/mvvmlibrary/mvvm/MVVMBaseViewModel;", "()V", "result", "Ljava/util/ArrayList;", "Lcom/nz/anand/network/model/CommentsData;", "Lkotlin/collections/ArrayList;", "getResult", "()Ljava/util/ArrayList;", "userPostsAndCommentsRepository", "Lcom/nz/anand/network/repository/UserPostsAndCommentsRepository;", "getUserPostsAndCommentsRepository", "()Lcom/nz/anand/network/repository/UserPostsAndCommentsRepository;", "userPostsAndCommentsRepository$delegate", "Lkotlin/Lazy;", "getCommentsFromRepo", "postID", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPostData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/nz/anand/network/model/PostWithComments;", "userID", "onboardingtest_debug"})
public final class UserPostsWithCommentsViewModel extends com.nz.anand.mvvmlibrary.mvvm.MVVMBaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.nz.anand.network.model.CommentsData> result = null;
    private final kotlin.Lazy userPostsAndCommentsRepository$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.nz.anand.network.model.CommentsData> getResult() {
        return null;
    }
    
    private final com.nz.anand.network.repository.UserPostsAndCommentsRepository getUserPostsAndCommentsRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.nz.anand.network.model.PostWithComments>> getPostData(int userID) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCommentsFromRepo(int postID, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.ArrayList<com.nz.anand.network.model.CommentsData>> p1) {
        return null;
    }
    
    public UserPostsWithCommentsViewModel() {
        super();
    }
}