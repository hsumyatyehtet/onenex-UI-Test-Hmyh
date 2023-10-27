package com.example.onenex_ui_test_hmyh.viewholder

import com.example.onenex_ui_test_hmyh.adapter.AvailableDoctorAdapter
import com.example.onenex_ui_test_hmyh.data.vos.DoctorVO
import com.example.onenex_ui_test_hmyh.databinding.ViewHolderInTopDoctorBinding

class AvailableDoctorViewHolder(
    private val binding: ViewHolderInTopDoctorBinding,
    private val delegate: AvailableDoctorAdapter.Delegate
)
    :BaseViewHolder<DoctorVO>(binding.root){

    init {
        binding.rlMakeAppointment.setOnClickListener {
            delegate.onTapTopAvailableDoctor()
        }
    }

    override fun bindData(data: DoctorVO) {
        mData = data

    }
}