package com.example.onenex_ui_test_hmyh.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.onenex_ui_test_hmyh.data.vos.DoctorSpecialistVO
import com.example.onenex_ui_test_hmyh.databinding.ViewHolderInDoctorSpecialistBinding
import com.example.onenex_ui_test_hmyh.viewholder.DoctorSpecialistViewHolder

class DoctorSpecialistAdapter: BaseRecyclerAdapter<DoctorSpecialistViewHolder, DoctorSpecialistVO>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoctorSpecialistViewHolder {
        return DoctorSpecialistViewHolder(
            ViewHolderInDoctorSpecialistBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

}