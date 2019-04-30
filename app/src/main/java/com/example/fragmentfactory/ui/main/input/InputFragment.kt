package com.example.fragmentfactory.ui.main.input

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.fragmentfactory.R

/**
 * Created by kietnlt on 29 Apr 2019.
 */
@SuppressLint("ValidFragment")
class InputFragment(
    private val navigator: InputNavigator
) : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.input_fragment, container, false).apply {
            findViewById<Button>(R.id.go_button).setOnClickListener {
                val numberA = findViewById<EditText>(R.id.number_1_edit_text).text.toString().toInt()
                val numberB = findViewById<EditText>(R.id.number_2_edit_text).text.toString().toInt()
                navigator.toResult(numberA, numberB)
            }
            findViewById<Button>(R.id.about_button).setOnClickListener {
                navigator.toAbout()
            }
        }
    }

}