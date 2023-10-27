package com.example.onenex_ui_test_hmyh.viewholder

import com.example.onenex_ui_test_hmyh.data.vos.DoctorVO
import com.example.onenex_ui_test_hmyh.databinding.ViewHolderInTopDoctorBinding

class TopDoctorViewHolder(private val binding: ViewHolderInTopDoctorBinding)
    :BaseViewHolder<DoctorVO>(binding.root){


    override fun bindData(data: DoctorVO) {
        mData = data



    }
}