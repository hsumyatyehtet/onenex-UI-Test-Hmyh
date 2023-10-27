package com.example.onenex_ui_test_hmyh.viewholder

import com.example.onenex_ui_test_hmyh.data.vos.TopDoctorCategoryVO
import com.example.onenex_ui_test_hmyh.databinding.ViewHolderInTopDoctorCategoryBinding

class TopDoctorCategoryViewHolder(private val binding: ViewHolderInTopDoctorCategoryBinding)
    :BaseViewHolder<TopDoctorCategoryVO>(binding.root){


    override fun bindData(data: TopDoctorCategoryVO) {
        mData = data

        binding.tvTopDoctorCategory.text = data.name

    }
}