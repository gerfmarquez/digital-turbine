package com.maxor.digitalturbine.games

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class GameData (val productId: Int, val name: String, val thumbnail: String, val rating: String) : Parcelable