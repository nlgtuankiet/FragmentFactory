package com.example.fragmentfactory

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication


/**
 * Created by kietnlt on 29 Apr 2019.
 */
class SampleApplication : DaggerApplication() {

    override fun onCreate() {
        super.onCreate()
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}