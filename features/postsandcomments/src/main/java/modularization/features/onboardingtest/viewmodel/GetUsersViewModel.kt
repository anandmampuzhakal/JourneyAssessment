package modularization.features.onboardingtest.viewmodel

import androidx.lifecycle.MutableLiveData
import com.nz.anand.mvvmlibrary.mvvm.MVVMBaseViewModel
import com.nz.anand.network.model.User
import com.nz.anand.network.repository.JsonPlaceHolderAPIRepository

/**
 * @author Anand M Joseph (anandmampuzhakal@hotmail.com)
 */
class GetUsersViewModel : MVVMBaseViewModel() {
     var listData = MutableLiveData<ArrayList<User>>()
    init {
        val jsonPlaceHolderAPIRepository: JsonPlaceHolderAPIRepository by lazy {
            JsonPlaceHolderAPIRepository
        }
        listData = jsonPlaceHolderAPIRepository.getMutableLiveData()
    }
}