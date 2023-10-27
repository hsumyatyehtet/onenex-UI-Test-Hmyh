package com.example.onenex_ui_test_hmyh.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by Hsu Myat Ye Htet on Oct 27, 2023
 */
abstract class BaseViewHolder<W>(itemView: View): RecyclerView.ViewHolder(itemView) {

    protected var mData: W? = null

    abstract fun bindData(data: W)
}