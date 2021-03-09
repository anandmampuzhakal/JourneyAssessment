package modularization.features.onboardingtest.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nz.anand.network.model.User
import modularization.features.onboardingtest.R
import modularization.features.onboardingtest.callback.OnItemClickListener

/**
 * @author Anand M Joseph (anandmampuzhakal@hotmail.com)
 */
class UsersAdapter(
    private var list: ArrayList<User>,
    private val onClickListener: OnItemClickListener
) : RecyclerView.Adapter<UsersAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view: View = inflater.inflate(R.layout.card_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val user = list[position]
        holder.userNameTxt.text = user.name
        holder.userEmailTxt.text = user.email

        holder.postButton.setOnClickListener {
            onClickListener.onItemClick(position, position)
        }
    }

    inner class MyViewHolder(var view: View) : RecyclerView.ViewHolder(view) {
        var userNameTxt: TextView = view.findViewById(R.id.user_name_txt)
        var userEmailTxt: TextView = view.findViewById(R.id.user_email_txt)
        var postButton: Button = view.findViewById(R.id.post_btn)
    }
}