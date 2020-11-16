package com.maxor.digitalturbine.util


import androidx.test.espresso.idling.CountingIdlingResource


/** This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 * Copyright 2020, Gerardo Marquez.
 */

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