package com.example.onenex_ui_test_hmyh.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.onenex_ui_test_hmyh.adapter.DateAdapter
import com.example.onenex_ui_test_hmyh.data.vos.DateVo
import com.example.onenex_ui_test_hmyh.databinding.ActivityDoctorDetailBinding
import com.example.onenex_ui_test_hmyh.util.getDateList
import java.util.Date

class DoctorDetailActivity: AppCompatActivity() ,DateAdapter.Delegate{

    private lateinit var binding: ActivityDoctorDetailBinding

    private lateinit var mDateAdapter: DateAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDoctorDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpRecyclerView()
        setUpDataObservation()

    }

    private fun setUpDataObservation() {


        mDateAdapter.setNewData(getDateList())
    }

    private fun setUpRecyclerView() {
        mDateAdapter = DateAdapter(this)
        binding.viewPodDate.rvDate.layoutManager =
            LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        binding.viewPodDate.rvDate.adapter = mDateAdapter
    }

    companion object{

        fun newIntent(context: Context): Intent{
            return Intent(context,DoctorDetailActivity::class.java).apply {

            }
        }

    }

    override fun onTapDateItem(dateVo: DateVo) {

        var mDataList = getDateList()

        mDataList.map {
            if (it.id == dateVo.id){
                it.isSelected = true
            }
        }
        mDateAdapter.setNewData(mDataList)
    }

}