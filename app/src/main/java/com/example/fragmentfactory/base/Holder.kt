package com.example.fragmentfactory.base

/**
 * Created by kietnlt on 29 Apr 2019.
 */
class Holder<T : Any> {
    private var _reference: T? = null
    var reference: T
        get() = requireNotNull(_reference)
        set(value) {
            require(_reference == null)
            _reference = value
        }
}