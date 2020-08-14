package com.maxor.digitalturbine.games

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.maxor.digitalturbine.util.ListAdapter
import java.text.SimpleDateFormat

class GameAdapter (val context: Context) :  ListAdapter<GameData, GameAdapter.GameHolder>(
    diffCallback =  object : DiffUtil.ItemCallback<GameData>() {
        override fun areItemsTheSame(oldItem: GameData, newItem: GameData): Boolean {
            return oldItem.productId == newItem.productId
        }
        override fun areContentsTheSame(oldItem: GameData, newItem: GameData): Boolean {
            return oldItem.productId == newItem.productId
        }
    }
) {


}