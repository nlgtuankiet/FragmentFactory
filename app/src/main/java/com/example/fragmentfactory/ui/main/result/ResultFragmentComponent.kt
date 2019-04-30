package com.example.fragmentfactory.ui.main.result

import android.os.Bundle
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
        ResultFragmentComponent.Provision::class
    ]
)
@FragmentScope
interface ResultFragmentComponent : FragmentComponent<ResultFragment> {

    @Module
    object Provision {
        @JvmStatic
        @Provides
        fun fragment(
            holder: Holder<ResultFragment>,
            viewModelFactory: ResultFragmentViewModel.Factory
        ): ResultFragment {
            return ResultFragment(
                viewModelFactory = viewModelFactory
            ).also { holder.reference = it }
        }

        @JvmStatic
        @Provides
        @FragmentScope
        fun holder() = Holder<ResultFragment>()

        @JvmStatic
        @Provides
        fun args(holder: Holder<ResultFragment>) =
            ResultFragmentArgs.fromBundle(holder.reference.arguments ?: Bundle.EMPTY)
    }

    @Subcomponent.Factory
    interface Factory : FragmentComponent.Factory<ResultFragmentComponent>
}