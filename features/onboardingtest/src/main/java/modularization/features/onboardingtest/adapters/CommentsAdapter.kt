package modularization.features.onboardingtest.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nz.anand.network.model.CommentsData
import modularization.features.onboardingtest.R
/**
 * @author Anand M Joseph (anandmampuzhakal@hotmail.com)
 */
class CommentsAdapter (private var list: ArrayList<CommentsData>): RecyclerView.Adapter<CommentsAdapter.CommentsHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommentsHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view: View = inflater.inflate(R.layout.comments_item,parent,false)
        return CommentsHolder(view)
    }

    override fun onBindViewHolder(holder: CommentsHolder, position: Int) {
        val comments = list[position]
        holder.titleTxt.text = comments.name
        holder.commentsBodyTxt.text = comments.body
        holder.commentsEmailTxt.text = comments.email
    }

    override fun getItemCount(): Int {
        return list.size
    }
    class CommentsHolder(var view: View) : RecyclerView.ViewHolder(view){
        var titleTxt: TextView = view.findViewById(R.id.title_txt)
        var commentsBodyTxt: TextView = view.findViewById(R.id.comments_body_txt)
        var commentsEmailTxt: TextView = view.findViewById(R.id.comments_email_txt)

    }
}