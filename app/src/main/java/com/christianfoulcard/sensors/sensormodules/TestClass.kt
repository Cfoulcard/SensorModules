package com.christianfoulcard.sensors.sensormodules

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.christianfoulcard.sensors.lightsensor.SensorLight
import com.christianfoulcard.sensors.lightsensor.Toaster

class TestClass : AppCompatActivity(), SensorLight {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val extraText = "Extraaa"

        val toaster = Toaster()
        textView.text = toaster.toasterMessage
    }

}