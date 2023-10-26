package com.example.onenex_ui_test_hmyh.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.onenex_ui_test_hmyh.R
import com.example.onenex_ui_test_hmyh.databinding.ActivityMainBinding
import com.example.onenex_ui_test_hmyh.fragment.AppoinmentFragment
import com.example.onenex_ui_test_hmyh.fragment.DoctorFragment
import com.example.onenex_ui_test_hmyh.fragment.HomeFragment
import com.example.onenex_ui_test_hmyh.fragment.ProfileFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var fragmentManager: FragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpHomeFragment()
        setUpBottomBar()

    }

    private fun setUpHomeFragment() {
        fragmentManager = supportFragmentManager
        val fragment = HomeFragment()
        loadFragment(fragment)
    }

    private fun loadFragment(fragment: Fragment){
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.flMain,fragment)
        transaction.commit()
    }

    @SuppressLint("WrongConstant")
    private fun setUpBottomBar() {
        binding.bottomNavBar.labelVisibilityMode = 1
        binding.bottomNavBar.background =
            ContextCompat.getDrawable(this,R.drawable.bg_bottom_bar)

        val dimensionInDp = TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP, 20.0f,
            resources.displayMetrics
        ).toInt()
        binding.bottomNavBar.itemIconSize = dimensionInDp

        binding.bottomNavBar.setOnNavigationItemSelectedListener { menuItem->
            when(menuItem.itemId){
                R.id.menuHome ->{
                    val fragment = HomeFragment()
                    loadFragment(fragment)
                }
                R.id.menuDoctor->{
                    val fragment = DoctorFragment()
                    loadFragment(fragment)
                }
                R.id.menuAppointmet->{
                    val fragment = AppoinmentFragment()
                    loadFragment(fragment)
                }
                R.id.menuProfile->{
                    val fragment = ProfileFragment()
                    loadFragment(fragment)
                }
                else ->{
                    val fragment = HomeFragment()
                    loadFragment(fragment)
                }
            }
            return@setOnNavigationItemSelectedListener true
        }

    }

}