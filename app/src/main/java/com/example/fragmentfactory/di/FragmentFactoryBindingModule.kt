package com.example.fragmentfactory.di

import androidx.fragment.app.FragmentFactory
import com.example.fragmentfactory.SampleFragmentFactory
import dagger.Module


/**
 * Created by kietnlt on 29 Apr 2019.
 */
@Module
interface FragmentFactoryBindingModule {
    fun fragmentFactory(impl: SampleFragmentFactory): FragmentFactory
}