package com.example.fragmentfactory.base

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

/**
 * Created by kietnlt on 29 Apr 2019.
 */
abstract class FragmentNavigator<T : Fragment>(holder: Holder<T>) {
    protected val fragment: T by lazy { holder.reference }
    protected val activity: FragmentActivity by lazy { fragment.activity ?: TODO() }
}