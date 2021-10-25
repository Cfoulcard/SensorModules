package com.christianfoulcard.livedatatesting

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.christianfoulcard.livedatatesting.TheBoolean.booleanThing

class MainViewModel: ViewModel() {

     private val changeBoolean: MutableLiveData<Boolean> by lazy {
         MutableLiveData<Boolean>()
     }

    // val changeBoolean = MutableLiveData<Boolean>()

    // The function to be observed
    fun booleanValue(): MutableLiveData<Boolean> {
        Log.d("ViewModel", "returning boolean :: $changeBoolean")
        return changeBoolean
    }

    fun booleanChange() {
            if (!booleanThing) {
                changeBoolean.value = false
                Log.d("ViewModel", "It is ${changeBoolean.value}")
                Log.d("ViewModel", "It is ${booleanThing}")
            } else if (booleanThing) {
                changeBoolean.value = true
                Log.d("ViewModel", "It is ${changeBoolean.value}")
                Log.d("ViewModel", "It is ${booleanThing}")
            }
            booleanThing = !booleanThing
        }
    }