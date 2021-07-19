package com.christianfoulcard.sensors

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEventListener
import android.hardware.SensorManager

interface SensorRelativeHumidity : SensorEventListener {

    fun getRelativeHumidity(context: Context) {
        val sensorManager: SensorManager = context.getSystemService(Context.SENSOR_SERVICE) as SensorManager
        var relativeHumidity: Sensor? = null

        relativeHumidity = sensorManager.getDefaultSensor(Sensor.TYPE_RELATIVE_HUMIDITY)
        if (relativeHumidity == sensorManager.getDefaultSensor(Sensor.TYPE_RELATIVE_HUMIDITY)) {
            sensorManager.registerListener(this, relativeHumidity, SensorManager.SENSOR_DELAY_NORMAL)
        } else {

        }
    }
}