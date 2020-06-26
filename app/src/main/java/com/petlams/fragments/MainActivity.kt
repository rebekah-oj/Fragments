package com.petlams.fragments

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = NewFragment()
        val secondFragment = SecondFragment()


        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, firstFragment)
            commit()
        }

        Fragment1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, firstFragment)
                commit()
            }

            Fragment2.setOnClickListener {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.flFragment, secondFragment)
                    commit()
                }
            }
        }

        fun onStart() {
            super.onStart()
            Log.d("activity_lifecycle", " On start called")

        }

        fun onResume() {
            super.onResume()
            Log.d("activity_lifecycle", "On resume called")
        }

        fun onPause() {
            super.onPause()
            Log.d("activity_lifecycle", "On pasued called")
        }

        fun onStop() {
            super.onStop()
            Log.d("activity_lifecycle", "On stop called")
        }

        fun onDestroy() {
            super.onDestroy()
            Log.d("activity_lifecycle", "On destroy called")
        }
    }

}