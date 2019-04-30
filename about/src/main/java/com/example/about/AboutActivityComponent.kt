package com.example.about

import com.example.fragmentfactory.base.FragmentComponent
import com.example.fragmentfactory.di.ActivityScope
import com.example.fragmentfactory.di.FragmentFactoryBindingModule
import com.example.fragmentfactory.di.FragmentKey
import dagger.Binds
import dagger.Component
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap

/**
 * Created by kietnlt on 29 Apr 2019.
 */
@Component(
    modules = [
        AboutFragmentModule::class,
        FragmentFactoryBindingModule::class,
        AboutActivityComponent.Binding::class
    ]
)
@ActivityScope
interface AboutActivityComponent : AndroidInjector<AboutActivity> {
    fun aboutFragmentComponentFactory(): AboutFragmentComponent.Factory

    @Module
    interface Binding {
        @Binds
        @IntoMap
        @FragmentKey(AboutFragment::class)
        fun about(impl: AboutFragmentComponent.Factory): FragmentComponent.Factory<*>
    }

    @Component.Factory
    interface Factory : AndroidInjector.Factory<AboutActivity>

    companion object {
        fun inject(activity: AboutActivity) {
            DaggerAboutActivityComponent.factory().create(activity).inject(activity)
        }
    }
}