package modularization.features.postandcomments.ui


import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.nz.anand.mvvmlibrary.extension.viewDataBindingOf
import com.nz.anand.mvvmlibrary.extension.viewModelOf
import com.nz.anand.mvvmlibrary.mvvm.MVVMBaseFragment
import com.nz.anand.network.model.User
import modularization.features.postandcomments.R
import modularization.features.postandcomments.adapters.UsersAdapter
import modularization.features.postandcomments.callback.OnItemClickListener
import modularization.features.postandcomments.databinding.FragmentGetUserSelectBinding
import modularization.features.postandcomments.viewmodel.GetUsersViewModel

/**
 * @author Anand M Joseph (anandmampuzhakal@hotmail.com)
 */
class GetUsersFragment : MVVMBaseFragment(R.layout.fragment_get_user_select) {
    private val mViewModel: GetUsersViewModel by viewModelOf()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val db = viewDataBindingOf<FragmentGetUserSelectBinding>()
        mViewModel.listData.observe(viewLifecycleOwner){
           db.cardList.adapter = UsersAdapter(it as ArrayList<User>, object : OnItemClickListener{
               override fun onItemClick(item: Int, position: Int) {
                   val bundle = Bundle()
                   bundle.putInt("userId", item)
                   findNavController().navigate(R.id.action_get_users_to_post_comments_fragments, bundle)
               }
           })
        }
    }
  }