package com.example.onenex_ui_test_hmyh.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.onenex_ui_test_hmyh.data.vos.DoctorSpecialistVO
import com.example.onenex_ui_test_hmyh.data.vos.DoctorVO
import com.example.onenex_ui_test_hmyh.data.vos.TopDoctorCategoryVO
import com.example.onenex_ui_test_hmyh.databinding.ViewHolderInDoctorSpecialistBinding
import com.example.onenex_ui_test_hmyh.databinding.ViewHolderInTopDoctorBinding
import com.example.onenex_ui_test_hmyh.databinding.ViewHolderInTopDoctorCategoryBinding
import com.example.onenex_ui_test_hmyh.viewholder.DoctorSpecialistViewHolder
import com.example.onenex_ui_test_hmyh.viewholder.TopDoctorCategoryViewHolder
import com.example.onenex_ui_test_hmyh.viewholder.TopDoctorViewHolder

class TopDoctorAdapter(private val delegate: Delegate): BaseRecyclerAdapter<TopDoctorViewHolder, DoctorVO>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopDoctorViewHolder {
        return TopDoctorViewHolder(
            ViewHolderInTopDoctorBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            ),
            delegate
        )
    }

    interface Delegate{
        fun onTapTopDoctorItem()
    }

}