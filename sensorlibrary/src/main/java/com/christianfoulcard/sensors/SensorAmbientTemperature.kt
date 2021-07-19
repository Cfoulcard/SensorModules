package com.christianfoulcard.sensors

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEventListener
import android.hardware.SensorManager

interface SensorAmbientTemperature : SensorEventListener {

    fun getAmbientTemperatureSensor(context: Context) {
        val sensorManager: SensorManager = context.getSystemService(Context.SENSOR_SERVICE) as SensorManager
        var ambientTemperature: Sensor? = null

        ambientTemperature = sensorManager.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE)
        if (ambientTemperature == sensorManager.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE)) {
            sensorManager.registerListener(this, ambientTemperature, SensorManager.SENSOR_DELAY_NORMAL)
        } else {

        }
    }
}