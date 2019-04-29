package com.example.fragmentfactory.di

import androidx.fragment.app.Fragment
import dagger.MapKey
import kotlin.reflect.KClass

/**
 * Created by kietnlt on 29 Apr 2019.
 */
@MapKey
@Retention(AnnotationRetention.RUNTIME)
annotation class FragmentKey(val value: KClass<out Fragment>)