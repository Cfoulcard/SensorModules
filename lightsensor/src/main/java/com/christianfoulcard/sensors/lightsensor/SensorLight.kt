package com.christianfoulcard.sensors.lightsensor

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager

interface SensorLight : SensorEventListener {

    fun getLightSensor(context: Context) {
        val sensorManager: SensorManager = context.getSystemService(Context.SENSOR_SERVICE) as SensorManager
        var light: Sensor? = null

        light = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT)
        if (light == sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT)) {
            sensorManager.registerListener(this, light, SensorManager.SENSOR_DELAY_NORMAL)
        } else {

        }
    }

    override fun onSensorChanged(event: SensorEvent?) {
        return
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
        return
    }
}