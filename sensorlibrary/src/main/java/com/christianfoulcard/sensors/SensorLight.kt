package com.christianfoulcard.sensors

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.util.Log

interface SensorLight : SensorEventListener {

    fun getLightSensor(context: Context) {
        val tag = this::class.java.simpleName
        val sensorManager: SensorManager = context.getSystemService(Context.SENSOR_SERVICE) as SensorManager
        Log.d(tag, "Getting light data")

        val light = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT)
        if (light == sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT) && light != null) {
            sensorManager.registerListener(this, light, SensorManager.SENSOR_DELAY_NORMAL)
        } else {
            Log.d(tag, "Light sensor not supported on this device")
        }
    }
}