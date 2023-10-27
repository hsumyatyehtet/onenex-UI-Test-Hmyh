package com.example.onenex_ui_test_hmyh.viewholder

import com.example.onenex_ui_test_hmyh.adapter.TopDoctorAdapter
import com.example.onenex_ui_test_hmyh.data.vos.DoctorVO
import com.example.onenex_ui_test_hmyh.databinding.ViewHolderInTopDoctorBinding

class TopDoctorViewHolder(
    private val binding: ViewHolderInTopDoctorBinding,
    private val delegate: TopDoctorAdapter.Delegate)
    :BaseViewHolder<DoctorVO>(binding.root){

    init {
        binding.rlMakeAppointment.setOnClickListener {
            delegate.onTapTopDoctorItem()
        }
    }

    override fun bindData(data: DoctorVO) {
        mData = data


    }
}