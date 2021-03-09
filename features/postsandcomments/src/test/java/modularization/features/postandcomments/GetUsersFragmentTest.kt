package modularization.features.postandcomments

import modularization.features.postandcomments.viewmodel.GetUsersViewModel
import org.junit.Assert
import org.junit.Test

/**
 * @author Anand M Joseph (anandmampuzhakal@hotmail.com)
 */
class GetUsersFragmentTest {
   private lateinit var getUsersViewModel :GetUsersViewModel
       @Test
     fun testGetUsers() {
        //given
        getUsersViewModel = GetUsersViewModel()
        //when
        //then
        Assert.assertNotNull(getUsersViewModel.listData)
    }
}