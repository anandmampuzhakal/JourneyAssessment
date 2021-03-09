package modularization.features.onboardingtest.adapters

import android.graphics.Color
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.github.razir.progressbutton.attachTextChangeAnimator
import com.github.razir.progressbutton.hideProgress
import com.github.razir.progressbutton.showProgress
import com.kingfisher.easyviewindicator.RecyclerViewIndicator
import com.nz.anand.network.model.CommentsData
import com.nz.anand.network.model.PostWithComments
import modularization.features.onboardingtest.R
import modularization.features.onboardingtest.callback.OnItemClickListener

/**
 * @author Anand M Joseph (anandmampuzhakal@hotmail.com)
 */
class PostsWithCommentsAdapter(
    private var list: ArrayList<PostWithComments>, private val onClickListener: OnItemClickListener
) : RecyclerView.Adapter<PostsWithCommentsAdapter.PostsWithCommentsHolder>() {

    var myViewHolders: ArrayList<PostsWithCommentsHolder> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostsWithCommentsHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view: View = inflater.inflate(R.layout.post_with_comments_item, parent, false)
        return PostsWithCommentsHolder(view)
    }

    override fun onBindViewHolder(holder: PostsWithCommentsHolder, position: Int) {
        val post = list[position]
        holder.titleTxt.text = post.title
        holder.postBodyTxt.text = post.body

        setCommentsList(post.comments, holder)
        holder.commentsButton.attachTextChangeAnimator()

        holder.commentsButton.setOnClickListener {
            post.id?.let { it ->
                showProgressRight(holder.commentsButton)
                onClickListener.onItemClick(it, position)
            }
        }

        myViewHolders.add(holder)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    private fun showProgressRight(button: Button) {
        button.showProgress {
            buttonTextRes = R.string.api_call
            progressColor = Color.WHITE
        }
        button.isEnabled = false
        Handler().postDelayed({
            button.isEnabled = true
            button.hideProgress(R.string.comments)
        }, 3000)
    }

    fun updateComments(comments: ArrayList<CommentsData>, position: Int) {
        list[position].comments.addAll(comments)
        setCommentsList(list[position].comments, myViewHolders[position])

    }

    private fun setCommentsList(
        comments: ArrayList<CommentsData>,
        holder: PostsWithCommentsHolder
    ) {
        if (comments.size > 0) {
            val verticalLayout =
                LinearLayoutManager(
                    holder.commentsRecyclerview.context,
                    LinearLayoutManager.HORIZONTAL,
                    false
                )
            val linearLayoutManager = LinearLayoutManager(holder.commentsRecyclerview.context)
            holder.commentsRecyclerview.layoutManager = linearLayoutManager
            holder.commentsRecyclerview.layoutManager = verticalLayout
            holder.commentsAdapter = CommentsAdapter(comments)
            holder.commentsRecyclerview.adapter = holder.commentsAdapter
            holder.recyclerViewIndicator.setRecyclerView( holder.commentsRecyclerview);
            holder.recyclerViewIndicator.forceUpdateItemCount();
            holder.commentsRecyclerview.visibility = View.VISIBLE
            holder.recyclerViewIndicator.visibility = View.VISIBLE
        } else {
            holder.commentsRecyclerview.visibility = View.GONE
            holder.recyclerViewIndicator.visibility = View.GONE
        }
    }


    class PostsWithCommentsHolder(var view: View) : RecyclerView.ViewHolder(view) {
        var titleTxt: TextView = view.findViewById(R.id.title_txt)
        var postBodyTxt: TextView = view.findViewById(R.id.post_body_txt)
        var commentsButton: Button = view.findViewById(R.id.comments_btn)
        var commentsRecyclerview: RecyclerView = view.findViewById(R.id.comments_list)
        var recyclerViewIndicator: RecyclerViewIndicator = view.findViewById(R.id.circleIndicator)
                lateinit var commentsAdapter: CommentsAdapter
    }
}
