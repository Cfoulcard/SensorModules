package com.christianfoulcard.sensors.sensormodules

import android.annotation.SuppressLint
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.christianfoulcard.sensors.SensorAmbientTemperature
import com.christianfoulcard.sensors.SensorLight
import com.christianfoulcard.sensors.SensorPressure
import com.christianfoulcard.sensors.SensorRelativeHumidity

class SensorDemoClass : AppCompatActivity(), SensorLight, SensorPressure, SensorAmbientTemperature,
    SensorRelativeHumidity {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        initializeSensors()
    }

    private fun initializeSensors() {
        getLightSensor(this)
        getPressureSensor(this)
        getAmbientTemperatureSensor(this)
        getRelativeHumidity(this)
    }

    @SuppressLint("SetTextI18n")
    override fun onSensorChanged(event: SensorEvent?) {
        val lightView = findViewById<TextView>(R.id.lightView)
        val pressureView = findViewById<TextView>(R.id.pressureView)
        val ambientTemperatureView = findViewById<TextView>(R.id.ambientTemperatureView)
        val relativeHumidityView = findViewById<TextView>(R.id.relativeHumidityView)

        if (event?.sensor?.type == Sensor.TYPE_LIGHT) {
            val lightValue = event.values?.get(0).toString()
            lightView.text = "Light: $lightValue"
        }

        if (event?.sensor?.type == Sensor.TYPE_PRESSURE) {
            val pressureValue = event.values?.get(0).toString()
            pressureView.text = "Pressure: $pressureValue"
        }

        if (event?.sensor?.type == Sensor.TYPE_AMBIENT_TEMPERATURE) {
            val ambientTemperatureValue = event.values?.get(0).toString()
            ambientTemperatureView.text = "Ambient Temperature: $ambientTemperatureValue"
        }

        if (event?.sensor?.type == Sensor.TYPE_RELATIVE_HUMIDITY) {
            val relativeHumidityValue = event.values?.get(0).toString()
            relativeHumidityView.text = "Relative Humidity: $relativeHumidityValue"
        }
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
        return
    }

}