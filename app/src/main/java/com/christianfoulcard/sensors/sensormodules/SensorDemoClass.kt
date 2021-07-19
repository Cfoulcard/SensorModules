package com.christianfoulcard.sensors.sensormodules

import android.hardware.Sensor
import android.hardware.SensorEvent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.christianfoulcard.sensors.lightsensor.SensorLight
import com.example.pressuresensor.SensorPressure

class SensorDemoClass : AppCompatActivity(), SensorLight, SensorPressure {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        getLightSensor(this)
        getPressureSensor(this)
    }

    override fun onSensorChanged(event: SensorEvent?) {
        val lightView = findViewById<TextView>(R.id.lightView)
        val pressureView = findViewById<TextView>(R.id.pressureView)

        if (event?.sensor?.type == Sensor.TYPE_LIGHT) {
            val lightValue = event.values?.get(0).toString()
            lightView.text = "Light: $lightValue"
        }

        if (event?.sensor?.type == Sensor.TYPE_PRESSURE) {
            val pressureValue = event.values?.get(0).toString()
            pressureView.text = "Pressure: $pressureValue"
        }
    }


    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
        return
    }

}