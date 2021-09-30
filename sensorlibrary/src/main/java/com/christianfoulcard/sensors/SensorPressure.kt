package com.christianfoulcard.sensors

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.util.Log

interface SensorPressure : SensorEventListener {

    fun getPressureSensor(context: Context) {
        val tag = this::class.java.simpleName
        val sensorManager: SensorManager = context.getSystemService(Context.SENSOR_SERVICE) as SensorManager
        Log.d(tag, "Getting pressure data")

        val pressure = sensorManager.getDefaultSensor(Sensor.TYPE_PRESSURE)
        if (pressure == sensorManager.getDefaultSensor(Sensor.TYPE_PRESSURE) && pressure != null) {
            sensorManager.registerListener(this, pressure, SensorManager.SENSOR_DELAY_NORMAL)
        } else {
            Log.d(tag, "Pressure sensor not supported on this device")
        }
    }
}