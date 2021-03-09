package modularization.features.onboardingtest.viewmodel

import androidx.lifecycle.MutableLiveData
import com.nz.anand.mvvmlibrary.mvvm.MVVMBaseViewModel
import com.nz.anand.network.model.CommentsData
import com.nz.anand.network.model.PostWithComments
import com.nz.anand.network.repository.UserPostsAndCommentsRepository
import kotlinx.coroutines.*

class UserPostsWithCommentsViewModel : MVVMBaseViewModel() {
    val result: ArrayList<CommentsData> = ArrayList<CommentsData>()

    private val userPostsAndCommentsRepository: UserPostsAndCommentsRepository by lazy {
        UserPostsAndCommentsRepository
    }

    fun getPostData(userID: Int): MutableLiveData<ArrayList<PostWithComments>> {
        return userPostsAndCommentsRepository.getMutableLiveData(userID)
    }

    suspend fun getCommentsFromRepo(postID: Int): ArrayList<CommentsData> {
        return withContext(Dispatchers.IO) {
            userPostsAndCommentsRepository.getCommentsMutableLiveData(postID)
        }
    }


}