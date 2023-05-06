package com.example.healthmate

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.healthmate.databinding.ActivityMainBinding
import com.example.healthmate.fragment.HealthFragment
import com.example.healthmate.fragment.MateFragment
import com.example.healthmate.fragment.SettingFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var healthFragment: HealthFragment
    private lateinit var mateFragment: MateFragment
    private lateinit var settingFragment: SettingFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_HealthMate);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        healthFragment = HealthFragment()
        mateFragment = MateFragment()
        settingFragment = SettingFragment()


        supportFragmentManager.beginTransaction().replace(R.id.fl_container,  healthFragment).commit()

        var bottomNavigation = binding.bottomNavigationView;
        bottomNavigation.setOnItemSelectedListener { item ->
                when (item.itemId) {
                    R.id.navigation_health -> {
                        supportFragmentManager.beginTransaction().replace(R.id.fl_container,  healthFragment).commit()
                    }
                    R.id.navigation_mate -> {
                        supportFragmentManager.beginTransaction().replace(R.id.fl_container,  mateFragment).commit()
                    }
                    R.id.navigation_setting -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.fl_container, settingFragment).commit()
                    }
                }
            true
            }

    }

}