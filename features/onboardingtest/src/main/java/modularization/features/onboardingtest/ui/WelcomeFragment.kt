package modularization.features.onboardingtest.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import modularization.features.onboardingtest.R
/**
 * @author Anand M Joseph (anandmampuzhakal@hotmail.com)
 */
class WelcomeFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_welcome, container, false)
        view.findViewById<Button>(R.id.button_user_registration_start).setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragment_to_get_user)
        }
        return view
    }
}