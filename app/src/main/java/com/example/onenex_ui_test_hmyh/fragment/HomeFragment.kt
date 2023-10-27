package com.example.onenex_ui_test_hmyh.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.onenex_ui_test_hmyh.activity.DoctorDetailActivity
import com.example.onenex_ui_test_hmyh.adapter.AvailableDoctorAdapter
import com.example.onenex_ui_test_hmyh.adapter.DoctorSpecialistAdapter
import com.example.onenex_ui_test_hmyh.adapter.TopDoctorAdapter
import com.example.onenex_ui_test_hmyh.adapter.TopDoctorCategoryAdapter
import com.example.onenex_ui_test_hmyh.databinding.FragmentHomeBinding
import com.example.onenex_ui_test_hmyh.util.getDoctor
import com.example.onenex_ui_test_hmyh.util.getDoctorSpecialist
import com.example.onenex_ui_test_hmyh.util.getTopDoctorCategoryList

class HomeFragment: Fragment(),TopDoctorAdapter.Delegate,AvailableDoctorAdapter.Delegate {

    private lateinit var binding: FragmentHomeBinding

    private lateinit var mDoctorSpecialistAdapter: DoctorSpecialistAdapter
    private lateinit var mTopDoctorCategoryAdapter: TopDoctorCategoryAdapter
    private lateinit var mTopDoctorAdapter: TopDoctorAdapter
    private lateinit var mAvailableDoctorAdapter: AvailableDoctorAdapter

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
        setUpDataObservation()
    }

    private fun setUpRecyclerView() {
        //doctor specialist
        mDoctorSpecialistAdapter = DoctorSpecialistAdapter()
        binding.viewDoctorSpecialist.rvDoctorSpecialists.layoutManager =
            GridLayoutManager(requireContext(),4)
        binding.viewDoctorSpecialist.rvDoctorSpecialists.adapter = mDoctorSpecialistAdapter


        //top doctor category
        mTopDoctorCategoryAdapter = TopDoctorCategoryAdapter()
        binding.viewPodTopDoctor.rvTopDoctorCategory.layoutManager =
            LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
        binding.viewPodTopDoctor.rvTopDoctorCategory.adapter = mTopDoctorCategoryAdapter


        mTopDoctorAdapter = TopDoctorAdapter(this)
        binding.viewPodTopDoctor.rvTopDoctor.layoutManager =
            GridLayoutManager(requireContext(),2)
        binding.viewPodTopDoctor.rvTopDoctor.adapter = mTopDoctorAdapter


        mAvailableDoctorAdapter = AvailableDoctorAdapter(this)
        binding.viewPodAvailableDoctor.rvAvailableDoctor.layoutManager =
            GridLayoutManager(requireContext(),2)
        binding.viewPodAvailableDoctor.rvAvailableDoctor.adapter = mAvailableDoctorAdapter

    }

    private fun setUpDataObservation() {
        mDoctorSpecialistAdapter.setNewData(getDoctorSpecialist())
        mTopDoctorCategoryAdapter.setNewData(getTopDoctorCategoryList())
        mTopDoctorAdapter.setNewData(getDoctor())
        mAvailableDoctorAdapter.setNewData(getDoctor())
    }

    override fun onTapTopDoctorItem() {
        startActivity(DoctorDetailActivity.newIntent(requireContext()))
    }

    override fun onTapTopAvailableDoctor() {
        startActivity(DoctorDetailActivity.newIntent(requireContext()))
    }


}