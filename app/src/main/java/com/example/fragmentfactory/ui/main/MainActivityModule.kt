package com.example.fragmentfactory.ui.main

import com.example.fragmentfactory.base.FragmentComponent
import com.example.fragmentfactory.di.ActivityScope
import com.example.fragmentfactory.di.FragmentKey
import com.example.fragmentfactory.ui.main.input.InputFragment
import com.example.fragmentfactory.ui.main.input.InputFragmentComponent
import com.example.fragmentfactory.ui.main.input.InputFragmentModule
import com.example.fragmentfactory.ui.main.result.ResultFragment
import com.example.fragmentfactory.ui.main.result.ResultFragmentComponent
import com.example.fragmentfactory.ui.main.result.ResultFragmentModule
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

/**
 * Created by kietnlt on 29 Apr 2019.
 */
@Module
interface MainActivityModule {
    @ContributesAndroidInjector(
        modules = [
            ResultFragmentModule::class,
            InputFragmentModule::class,
            Binding::class
        ]
    )
    @ActivityScope
    fun activity(): MainActivity


    @Module
    interface Binding {
        @Binds
        @IntoMap
        @FragmentKey(InputFragment::class)
        fun inputFactory(impl: InputFragmentComponent.Factory): FragmentComponent.Factory<*>

        @Binds
        @IntoMap
        @FragmentKey(ResultFragment::class)
        fun resultFactory(impl: ResultFragmentComponent.Factory): FragmentComponent.Factory<*>
    }
}