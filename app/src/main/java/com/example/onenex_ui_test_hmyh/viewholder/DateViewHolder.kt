package com.example.onenex_ui_test_hmyh.viewholder

import com.example.onenex_ui_test_hmyh.R
import com.example.onenex_ui_test_hmyh.adapter.DateAdapter
import com.example.onenex_ui_test_hmyh.data.vos.DateVo
import com.example.onenex_ui_test_hmyh.databinding.ViewHolderInDateBinding

class DateViewHolder(
    private val binding: ViewHolderInDateBinding,
    private val delegate: DateAdapter.Delegate
) : BaseViewHolder<DateVo>(binding.root) {

    init {
        itemView.setOnClickListener {
            mData?.let {dateVo ->
                delegate.onTapDateItem(dateVo)
            }
        }
    }

    override fun bindData(data: DateVo) {
        mData = data

        binding.tvDate.text = data.date.toString()
        binding.tvDay.text = data.day

        if (data.isSelected){
            binding.tvDate.setTextColor(itemView.resources.getColor(R.color.colorButtonBlue))
            binding.tvDay.setTextColor(itemView.resources.getColor(R.color.colorButtonBlue))
            itemView.setBackgroundDrawable(itemView.resources.getDrawable(R.drawable.bg_reactangle_blue_stoke_12))
        }
        else{
            binding.tvDate.setTextColor(itemView.resources.getColor(R.color.colorTitle))
            binding.tvDay.setTextColor(itemView.resources.getColor(R.color.colorTitle))
            itemView.setBackgroundDrawable(itemView.resources.getDrawable(R.drawable.bg_reactangle_black_10))
        }

    }
}