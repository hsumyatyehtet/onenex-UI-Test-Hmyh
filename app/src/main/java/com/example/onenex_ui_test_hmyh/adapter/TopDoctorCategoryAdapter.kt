package com.example.onenex_ui_test_hmyh.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.onenex_ui_test_hmyh.data.vos.DoctorSpecialistVO
import com.example.onenex_ui_test_hmyh.data.vos.TopDoctorCategoryVO
import com.example.onenex_ui_test_hmyh.databinding.ViewHolderInDoctorSpecialistBinding
import com.example.onenex_ui_test_hmyh.databinding.ViewHolderInTopDoctorCategoryBinding
import com.example.onenex_ui_test_hmyh.viewholder.DoctorSpecialistViewHolder
import com.example.onenex_ui_test_hmyh.viewholder.TopDoctorCategoryViewHolder

class TopDoctorCategoryAdapter: BaseRecyclerAdapter<TopDoctorCategoryViewHolder, TopDoctorCategoryVO>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopDoctorCategoryViewHolder {
        return TopDoctorCategoryViewHolder(
            ViewHolderInTopDoctorCategoryBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

}