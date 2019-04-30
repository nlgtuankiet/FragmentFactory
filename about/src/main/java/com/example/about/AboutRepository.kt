package com.example.about

import com.example.fragmentfactory.di.FragmentScope
import javax.inject.Inject

/**
 * Created by kietnlt on 29 Apr 2019.
 */
@FragmentScope
class AboutRepository @Inject constructor() {
    fun getInfo(): String {
        return "This application showcasing Dagger 2 setup with FragmentFactory!"
    }
}