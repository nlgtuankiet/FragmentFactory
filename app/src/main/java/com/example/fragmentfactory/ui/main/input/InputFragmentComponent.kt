package com.example.fragmentfactory.ui.main.input

import com.example.fragmentfactory.base.FragmentComponent
import com.example.fragmentfactory.di.FragmentScope
import dagger.Subcomponent


/**
 * Created by kietnlt on 29 Apr 2019.
 */
@Subcomponent
@FragmentScope
interface InputFragmentComponent : FragmentComponent<InputFragment> {

    @Subcomponent.Factory
    interface Factory : FragmentComponent.Factory<InputFragmentComponent>
}