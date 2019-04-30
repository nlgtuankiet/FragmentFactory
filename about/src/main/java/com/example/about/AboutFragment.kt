package com.example.about

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

/**
 * Created by kietnlt on 29 Apr 2019.
 */
@SuppressLint("ValidFragment")
class AboutFragment(
    private val aboutRepository: AboutRepository
) : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.about_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.info_text_view).text = aboutRepository.getInfo()
    }

    companion object {
        fun attachTo(activity: FragmentActivity, @IdRes container: Int) {
            val fragment = activity.supportFragmentManager.fragmentFactory.instantiate(
                activity.classLoader,
                AboutFragment::class.java.name
            )
            activity.supportFragmentManager.beginTransaction()
                .add(container, fragment)
                .commit()
        }
    }
}