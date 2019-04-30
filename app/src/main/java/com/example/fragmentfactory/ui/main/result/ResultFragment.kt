package com.example.fragmentfactory.ui.main.result

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.fragmentfactory.R

/**
 * Created by kietnlt on 29 Apr 2019.
 */
@SuppressLint("ValidFragment")
class ResultFragment constructor(
    private val viewModelFactory: ViewModelProvider.Factory
) : Fragment() {
    private val viewModel: ResultFragmentViewModel by viewModels { viewModelFactory }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.result_ragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.result.observe(viewLifecycleOwner, Observer<Int> {
            view.findViewById<TextView>(R.id.result_text_view).text = it.toString()
        })
    }
}