package com.christianfoulcard.livedatatesting

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.christianfoulcard.sensors.sensormodules.databinding.ActivityMainTestingBinding

class MainActivityTesting : AppCompatActivity() {

    private lateinit var binding: ActivityMainTestingBinding
    private val model: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainTestingBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // viewModel.booleanChange()

        binding.button.setOnClickListener {
            model.booleanChange()
        }

        // This is the observer which updates the UI
        val booleanChangeObserver = Observer<Boolean> {

            if (it == false)
                binding.textView2.text = "Not true"
            else if (it == true) {
                binding.textView3.text = "True"
            }
        }

        // Call ViewModel, the boolean listed in it, and observe this fragment for the boolean change above
        model.booleanValue().observe(this, booleanChangeObserver)

        // Call ViewModel, the boolean listed in it, and observe this fragment for the boolean change above
//        model.booleanValue().observe(this, Observer {
//            if (it) {
//                if (it == false)
//                    textView2?.text = "Not true"
//                else if (it == true) {
//                    textView3?.text = "True"
//                }
//            }
//        })

    }
}