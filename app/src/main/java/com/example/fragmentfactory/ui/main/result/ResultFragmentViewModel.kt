package com.example.fragmentfactory.ui.main.result

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject
import javax.inject.Provider

/**
 * Created by kietnlt on 29 Apr 2019.
 */
class ResultFragmentViewModel @Inject constructor(
    private val args: ResultFragmentArgs
) : ViewModel() {
    private val _result = MutableLiveData<Int>().apply { value = args.numberA + args.numberB }
    val result: LiveData<Int>
        get() = _result


    @Suppress("UNCHECKED_CAST")
    class Factory @Inject constructor(
        private val provider: Provider<ResultFragmentViewModel>
    ) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return provider.get() as T
        }

    }
}