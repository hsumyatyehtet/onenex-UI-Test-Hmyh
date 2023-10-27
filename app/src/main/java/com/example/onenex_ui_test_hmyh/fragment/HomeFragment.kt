package com.example.onenex_ui_test_hmyh.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.onenex_ui_test_hmyh.adapter.DoctorSpecialistAdapter
import com.example.onenex_ui_test_hmyh.databinding.FragmentHomeBinding
import com.example.onenex_ui_test_hmyh.util.getDoctorSpecialist

class HomeFragment: Fragment() {

    private lateinit var binding: FragmentHomeBinding

    private lateinit var mDoctorSpecialistAdapter: DoctorSpecialistAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        mDoctorSpecialistAdapter = DoctorSpecialistAdapter()
        binding.viewDoctorSpecialist.rvDoctorSpecialists.layoutManager =
            GridLayoutManager(requireContext(),4)
        binding.viewDoctorSpecialist.rvDoctorSpecialists.adapter = mDoctorSpecialistAdapter

        mDoctorSpecialistAdapter.setNewData(getDoctorSpecialist())
    }

}