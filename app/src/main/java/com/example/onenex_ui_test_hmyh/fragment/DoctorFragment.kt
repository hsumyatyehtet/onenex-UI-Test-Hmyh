package com.example.onenex_ui_test_hmyh.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.onenex_ui_test_hmyh.databinding.FragmentDoctorBinding
import com.example.onenex_ui_test_hmyh.databinding.FragmentHomeBinding

class DoctorFragment: Fragment() {

    private lateinit var binding: FragmentDoctorBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDoctorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}