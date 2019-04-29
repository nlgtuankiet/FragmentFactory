package com.example.fragmentfactory.base

import androidx.fragment.app.Fragment


/**
 * Created by kietnlt on 29 Apr 2019.
 */
interface FragmentComponent<T : Fragment> {
    fun fragment(): T
    interface Factory<T : FragmentComponent<out Fragment>> {
        fun create(): T
    }
}