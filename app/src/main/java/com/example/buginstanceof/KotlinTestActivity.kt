package com.example.buginstanceof

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter.base.viewholder.BaseViewHolder

class KotlinTestActivity: AppCompatActivity() {
    fun test() {
        val baseViewHolder = BaseViewHolder(window.decorView)
        if (baseViewHolder is RecyclerView.ViewHolder) {
            val viewHolder: RecyclerView.ViewHolder = baseViewHolder
        }
    }
}