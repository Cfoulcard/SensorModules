package com.christianfoulcard.livedatatesting

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.christianfoulcard.sensors.sensormodules.R

/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragmentOne.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragmentOne : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank_one, container, false)
    }

}