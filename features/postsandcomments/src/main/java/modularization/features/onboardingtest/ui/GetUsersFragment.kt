package modularization.features.onboardingtest.ui


import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.nz.anand.mvvmlibrary.extension.viewDataBindingOf
import com.nz.anand.mvvmlibrary.extension.viewModelOf
import com.nz.anand.mvvmlibrary.mvvm.MVVMBaseFragment
import com.nz.anand.network.model.User
import modularization.features.onboardingtest.R
import modularization.features.onboardingtest.adapters.UsersAdapter
import modularization.features.onboardingtest.callback.OnItemClickListener
import modularization.features.onboardingtest.databinding.FragmentGetUserSelectBinding
import modularization.features.onboardingtest.viewmodel.GetUsersViewModel
import org.jetbrains.anko.bundleOf

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