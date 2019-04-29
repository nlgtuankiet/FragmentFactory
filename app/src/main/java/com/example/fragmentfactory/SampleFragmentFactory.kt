package com.example.fragmentfactory

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.example.fragmentfactory.base.FragmentComponent
import javax.inject.Inject
import javax.inject.Provider

/**
 * Created by kietnlt on 29 Apr 2019.
 */
class SampleFragmentFactory @Inject constructor(
    private val providers: Map<Class<out Fragment>, @JvmSuppressWildcards Provider<FragmentComponent.Factory<*>>>
) : FragmentFactory() {

    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        val fragmentClass = classLoader.loadClass(className)
        return providers.entries.find { it.key.isAssignableFrom(fragmentClass) }
            ?.value?.get()?.create()?.fragment() ?: super.instantiate(classLoader, className)
    }
}