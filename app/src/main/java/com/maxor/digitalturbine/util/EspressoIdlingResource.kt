package com.maxor.digitalturbine.util

import androidx.test.espresso.IdlingResource
import androidx.test.espresso.idling.CountingIdlingResource
import javax.inject.Inject

class EspressoIdlingResource {

    companion object {
        val resourceName : String = "resource"
        val idlingResource: CountingIdlingResource = CountingIdlingResource(resourceName)
    }


    fun increment() {
        idlingResource.increment()
    }

    fun decrement() {
        idlingResource.decrement()
    }


}