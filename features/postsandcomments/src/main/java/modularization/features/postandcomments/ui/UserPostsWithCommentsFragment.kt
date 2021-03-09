package modularization.features.postandcomments.ui

import android.os.Bundle
import android.view.View
import com.nz.anand.mvvmlibrary.extension.viewDataBindingOf
import com.nz.anand.mvvmlibrary.extension.viewModelOf
import com.nz.anand.mvvmlibrary.mvvm.MVVMBaseFragment
import com.nz.anand.network.model.PostWithComments
import kotlinx.coroutines.*
import modularization.features.postandcomments.R
import modularization.features.postandcomments.adapters.PostsWithCommentsAdapter
import modularization.features.postandcomments.callback.OnItemClickListener
import modularization.features.postandcomments.databinding.FragmentUserPostsCommentsBinding
import modularization.features.postandcomments.viewmodel.UserPostsWithCommentsViewModel
/**
 * @author Anand M Joseph (anandmampuzhakal@hotmail.com)
 */
class UserPostsWithCommentsFragment : MVVMBaseFragment(R.layout.fragment_user_posts_comments) {
    private val mViewModel: UserPostsWithCommentsViewModel by viewModelOf()
    private lateinit var db : FragmentUserPostsCommentsBinding
    private  lateinit var postsWithCommentsAdapter:PostsWithCommentsAdapter
    private val scope = CoroutineScope(Job() + Dispatchers.Main)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        db = viewDataBindingOf()
        val userID =  arguments?.getInt("userId") as Int

        mViewModel.getPostData(userID).observe(viewLifecycleOwner){
            postsWithCommentsAdapter = PostsWithCommentsAdapter(it as ArrayList<PostWithComments>, object : OnItemClickListener{
                override fun onItemClick(commentsId: Int, position: Int) {
                    getComments(commentsId, position)
                }
            })
            if(userID != 0)
                db.noDataFound.visibility = View.GONE
            db.postWithCommentsCardList.adapter = postsWithCommentsAdapter
        }
    }

    fun getComments(commentsId: Int, position: Int) {
        scope.launch {
         var result = mViewModel.getCommentsFromRepo(commentsId)
            delay(3000)
            postsWithCommentsAdapter.updateComments(result, position)
        }
    }
}