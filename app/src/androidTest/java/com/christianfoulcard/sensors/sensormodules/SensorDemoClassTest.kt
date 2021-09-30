//package com.christianfoulcard.sensors.sensormodules
//
//import androidx.lifecycle.Lifecycle
//import androidx.test.core.app.ActivityScenario
//import androidx.test.core.app.ActivityScenario.launch
//import androidx.test.ext.junit.rules.ActivityScenarioRule
//import androidx.test.ext.junit.runners.AndroidJUnit4
//import androidx.test.filters.SmallTest
//import org.junit.Assert.*
//
//import org.junit.Before
//import org.junit.Rule
//import org.junit.Test
//import org.junit.runner.RunWith
//import androidx.test.rule.ActivityTestRule
//
//@RunWith(AndroidJUnit4::class)
//class SensorDemoClassTest {
//
//    @get:Rule
//    val activityRule = ActivityScenarioRule(SensorDemoClass::class.java)
//    private val sensorDemoClass: SensorDemoClass? = null
//
//    @Test
//    fun valueOfX() {
//        val scenario = launch(SensorDemoClass::class.java) // Creates the activity, in resume state
//        scenario.moveToState(Lifecycle.State.RESUMED)
//
//        val expected = 9
//        val actual = sensorDemoClass?.valueOfX(z = 9)
//        assertEquals(expected, actual)
//
//        scenario.moveToState(Lifecycle.State.DESTROYED)
//    }
//
//}