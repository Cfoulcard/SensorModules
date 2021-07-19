package com.example.pressuresensor

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEventListener
import android.hardware.SensorManager

interface SensorPressure : SensorEventListener {

    fun getPressureSensor(context: Context) {
        val sensorManager: SensorManager = context.getSystemService(Context.SENSOR_SERVICE) as SensorManager
        var pressure: Sensor? = null

        pressure = sensorManager.getDefaultSensor(Sensor.TYPE_PRESSURE)
        if (pressure == sensorManager.getDefaultSensor(Sensor.TYPE_PRESSURE)) {
            sensorManager.registerListener(this, pressure, SensorManager.SENSOR_DELAY_NORMAL)
        } else {

        }
    }

}