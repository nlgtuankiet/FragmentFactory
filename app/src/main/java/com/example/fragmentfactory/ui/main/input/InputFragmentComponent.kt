package com.example.fragmentfactory.ui.main.input

import com.example.fragmentfactory.base.FragmentComponent
import com.example.fragmentfactory.base.Holder
import com.example.fragmentfactory.di.FragmentScope
import dagger.Module
import dagger.Provides
import dagger.Subcomponent

/**
 * Created by kietnlt on 29 Apr 2019.
 */
@Subcomponent(
    modules = [
        InputFragmentComponent.Provision::class
    ]
)
@FragmentScope
interface InputFragmentComponent : FragmentComponent<InputFragment> {

    @Module
    object Provision {
        @JvmStatic
        @Provides
        fun fragment(
            holder: Holder<InputFragment>,
            navigator: InputNavigator
        ): InputFragment {
            return InputFragment(
                navigator = navigator
            ).also { holder.reference = it }
        }

        @JvmStatic
        @Provides
        @FragmentScope
        fun holder(): Holder<InputFragment> = Holder()
    }

    @Subcomponent.Factory
    interface Factory : FragmentComponent.Factory<InputFragmentComponent>
}