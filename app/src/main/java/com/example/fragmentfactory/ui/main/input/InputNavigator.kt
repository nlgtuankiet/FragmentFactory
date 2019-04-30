package com.example.fragmentfactory.ui.main.input

import android.content.Intent
import androidx.navigation.fragment.findNavController
import com.example.fragmentfactory.base.FragmentNavigator
import com.example.fragmentfactory.base.Holder
import com.example.fragmentfactory.di.FragmentScope
import javax.inject.Inject

/**
 * Created by kietnlt on 29 Apr 2019.
 */
@FragmentScope
class InputNavigator @Inject constructor(
    holder: Holder<InputFragment>
) : FragmentNavigator<InputFragment>(holder) {
    fun toResult(numberA: Int, numberb: Int) {
        val action = InputFragmentDirections.actionInputFragmentToResultFragment(numberA, numberb)
        fragment.findNavController().navigate(action)
    }

    fun toAbout() {
        val clazz = Class.forName("com.example.about.AboutActivity")
        val intent = Intent(activity, clazz)
        activity.startActivity(intent)
    }
}