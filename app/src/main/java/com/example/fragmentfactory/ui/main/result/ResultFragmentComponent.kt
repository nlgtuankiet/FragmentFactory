package com.example.fragmentfactory.ui.main.result

import com.example.fragmentfactory.base.FragmentComponent
import com.example.fragmentfactory.di.FragmentScope
import com.example.fragmentfactory.ui.main.input.InputFragment
import dagger.Subcomponent


/**
 * Created by kietnlt on 29 Apr 2019.
 */
@Subcomponent
@FragmentScope
interface ResultFragmentComponent : FragmentComponent<InputFragment> {

    @Subcomponent.Factory
    interface Factory : FragmentComponent.Factory<ResultFragmentComponent>
}