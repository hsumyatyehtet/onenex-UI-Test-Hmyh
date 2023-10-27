package com.example.onenex_ui_test_hmyh.viewholder

import com.bumptech.glide.Glide
import com.example.onenex_ui_test_hmyh.R
import com.example.onenex_ui_test_hmyh.data.vos.DoctorSpecialistVO
import com.example.onenex_ui_test_hmyh.databinding.ViewHolderInDoctorSpecialistBinding

class DoctorSpecialistViewHolder(private val binding: ViewHolderInDoctorSpecialistBinding)
    :BaseViewHolder<DoctorSpecialistVO>(binding.root){


    override fun bindData(data: DoctorSpecialistVO) {
        mData = data

        Glide.with(itemView.context)
            .load(R.drawable.bg_circle_photo)
            .circleCrop()
            .into(binding.ivBackground)

        binding.tvDoctorSpecialists.text = data.name

        Glide.with(itemView.context)
            .load(data.image)
            .circleCrop()
            .into(binding.ivIcon)

    }
}