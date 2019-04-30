package com.example.about

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentFactory
import javax.inject.Inject

/**
 * Created by kietnlt on 29 Apr 2019.
 */
class AboutActivity : AppCompatActivity() {
    @Inject
    lateinit var fragmentFactory: FragmentFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        AboutActivityComponent.inject(this)
        supportFragmentManager.fragmentFactory = fragmentFactory
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about_activity)

        if (savedInstanceState == null) {
            AboutFragment.attachTo(this, R.id.fragment_container)
        }
    }
}