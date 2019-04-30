package com.example.fragmentfactory.di

import com.example.fragmentfactory.SampleApplication
import com.example.fragmentfactory.ui.main.MainActivityModule
import com.example.fragmentfactory.ui.main.input.InputFragmentComponent
import com.example.fragmentfactory.ui.main.result.ResultFragmentComponent
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

/**
 * Created by kietnlt on 29 Apr 2019.
 */
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        FragmentFactoryBindingModule::class,
        MainActivityModule::class
    ]
)
@ApplicationScope
interface ApplicationComponent : AndroidInjector<SampleApplication> {
    fun inputFragmentComponentFactory(): InputFragmentComponent.Factory
    fun resultFragmentComponentFactory(): ResultFragmentComponent.Factory
}