package com.maxor.digitalturbine.games

import android.content.Context

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.maxor.digitalturbine.R
import com.maxor.digitalturbine.util.ListAdapter
import com.squareup.picasso.Picasso

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

    class GameHolder(val gameRowLayout: RelativeLayout) : RecyclerView.ViewHolder(gameRowLayout)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : GameHolder {
        val searchResultLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.game_result_list, parent, false) as RelativeLayout
        return GameHolder(searchResultLayout)
    }

    override fun onBindViewHolder(holder: GameHolder, position: Int) {
        holder.gameRowLayout.findViewById<TextView>(R.id.tv_game_rating)
            .text = getItem(position).rating
        holder.gameRowLayout.findViewById<TextView>(R.id.tv_game_product_name)
            .text =  getItem(position).name

        holder.gameRowLayout.tag = getItem(position)

        val imageView: ImageView = holder.gameRowLayout.findViewById(R.id.iv_game_thumbnail)
        Picasso.get().load(getItem(position).thumbnail).into(imageView)
    }

}