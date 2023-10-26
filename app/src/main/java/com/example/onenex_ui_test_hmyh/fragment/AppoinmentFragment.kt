package com.example.onenex_ui_test_hmyh.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.onenex_ui_test_hmyh.databinding.FragmentAppoinmentBinding
import com.example.onenex_ui_test_hmyh.databinding.FragmentHomeBinding

class AppoinmentFragment: Fragment() {

    private lateinit var binding: FragmentAppoinmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAppoinmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}