package com.example.onenex_ui_test_hmyh.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.onenex_ui_test_hmyh.databinding.ActivityDoctorDetailBinding

class DoctorDetailActivity: AppCompatActivity() {

    private lateinit var binding: ActivityDoctorDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDoctorDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    companion object{

        fun newIntent(context: Context): Intent{
            return Intent(context,DoctorDetailActivity::class.java).apply {

            }
        }

    }

}