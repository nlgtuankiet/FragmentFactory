package com.example.fragmentfactory

import com.example.fragmentfactory.di.ApplicationComponent
import com.example.fragmentfactory.di.DaggerApplicationComponent
import dagger.android.support.DaggerApplication

/**
 * Created by kietnlt on 29 Apr 2019.
 */
class SampleApplication : DaggerApplication() {
    private val appicationComponent: ApplicationComponent by lazy { DaggerApplicationComponent.create() }

    override fun applicationInjector() = appicationComponent
}