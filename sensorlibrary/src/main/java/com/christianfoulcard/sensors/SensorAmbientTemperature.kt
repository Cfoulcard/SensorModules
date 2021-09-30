package com.christianfoulcard.sensors

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.util.Log

interface SensorAmbientTemperature : SensorEventListener {

    fun getAmbientTemperatureSensor(context: Context) {
        val tag = this::class.java.simpleName
        val sensorManager: SensorManager = context.getSystemService(Context.SENSOR_SERVICE) as SensorManager
        Log.d(tag, "Getting ambient temperature data")

        val ambientTemperature = sensorManager.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE)
        if (ambientTemperature == sensorManager.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE) && ambientTemperature != null) {
            sensorManager.registerListener(this, ambientTemperature, SensorManager.SENSOR_DELAY_NORMAL)
        } else {
            Log.d(tag, "Ambient Temperature sensor not supported on this device")
        }
    }
}