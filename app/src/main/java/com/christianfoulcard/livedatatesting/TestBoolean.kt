package com.christianfoulcard.livedatatesting

import androidx.lifecycle.LiveData

 object TestBoolean: LiveData<Boolean>() {

    override fun getValue(): Boolean? {
        TheBoolean.booleanThing
        return super.getValue()
    }

    fun test() {
        postValue(true)
    }

    override fun postValue(value: Boolean?) {
        super.postValue(value)
    }

}