package com.maxor.digitalturbine.games

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/** This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 * Copyright 2020, Gerardo Marquez.
 */

@Parcelize
data class GameData (val productId: Int, val name: String, val thumbnail: String, val rating: String) : Parcelable