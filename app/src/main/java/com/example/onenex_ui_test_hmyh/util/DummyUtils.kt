package com.example.onenex_ui_test_hmyh.util

import com.example.onenex_ui_test_hmyh.R
import com.example.onenex_ui_test_hmyh.data.vos.DoctorSpecialistVO
import com.example.onenex_ui_test_hmyh.data.vos.DoctorVO
import com.example.onenex_ui_test_hmyh.data.vos.TopDoctorCategoryVO

fun getDoctorSpecialist(): MutableList<DoctorSpecialistVO> {
    return mutableListOf(
        DoctorSpecialistVO(1, "Workplace", R.drawable.workplace),
        DoctorSpecialistVO(2, "Abuse", R.drawable.absuse),
        DoctorSpecialistVO(3, "Anxiety", R.drawable.anxity),
        DoctorSpecialistVO(4, "Disorder", R.drawable.disorder),
        DoctorSpecialistVO(5, "Depression", R.drawable.depression),
        DoctorSpecialistVO(6, "Youth Support", R.drawable.youth_day),
        DoctorSpecialistVO(7, "Sex Edu", R.drawable.sex_education),
        DoctorSpecialistVO(8, "LGBTQ+", R.drawable.lgbt)
    )
}

fun getTopDoctorCategoryList(): MutableList<TopDoctorCategoryVO> {
    return mutableListOf(
        TopDoctorCategoryVO(1, "All"),
        TopDoctorCategoryVO(2, "General"),
        TopDoctorCategoryVO(3, "Abuse Recovery"),
        TopDoctorCategoryVO(4, "Eating Disorder")
    )
}

fun getDoctor(): MutableList<DoctorVO> {
    return mutableListOf(
        DoctorVO(1, "Dr.Myo"),
        DoctorVO(2, "Dr.Aunng"),
    )
}


