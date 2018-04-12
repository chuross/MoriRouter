package com.github.chuross.morirouter.transition

import android.support.transition.ChangeBounds
import android.support.transition.ChangeImageTransform
import android.support.transition.TransitionSet
import com.github.chuross.morirouter.core.TransitionFactory

class DetailScreenTransitionFactory : TransitionFactory {

    override fun create(): Any = TransitionSet().also {
        it.ordering = TransitionSet.ORDERING_TOGETHER
        it.addTransition(ChangeBounds())
        it.addTransition(ChangeImageTransform())
    }
}