package com.example.about

import com.example.fragmentfactory.base.FragmentComponent
import com.example.fragmentfactory.di.FragmentScope
import dagger.Module
import dagger.Provides
import dagger.Subcomponent

/**
 * Created by kietnlt on 29 Apr 2019.
 */
@Subcomponent(
    modules = [
        AboutFragmentComponent.Provision::class
    ]
)
@FragmentScope
interface AboutFragmentComponent : FragmentComponent<AboutFragment> {

    @Module
    object Provision {
        @Provides
        @JvmStatic
        fun fragment(aboutRepository: AboutRepository) = AboutFragment(aboutRepository)
    }

    @Subcomponent.Factory
    interface Factory : FragmentComponent.Factory<AboutFragmentComponent>
}