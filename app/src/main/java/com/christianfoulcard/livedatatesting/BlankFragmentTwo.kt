package com.christianfoulcard.livedatatesting

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.christianfoulcard.sensors.sensormodules.databinding.FragmentBlankTwoBinding

class BlankFragmentTwo : Fragment() {

    private val model: MainViewModel by activityViewModels()
    private var _binding: FragmentBlankTwoBinding? = null
    private val binding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBlankTwoBinding.inflate(inflater, container, false)

        // Inflate the layout for this fragment
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Optional
        // val model = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)

        // This is the observer which updates the UI
        val booleanChangeObserver = Observer<Boolean> {

            if (it == false) {
                binding?.textView?.text = "Not true"
                binding?.imageView3?.visibility = View.VISIBLE
                binding?.imageView2?.visibility = View.GONE
            } else if (it == true) {
            binding?.textView?.text = "True"
            binding?.imageView3?.visibility = View.GONE
            binding?.imageView2?.visibility = View.VISIBLE
        }
        }

        // Call ViewModel, the boolean listed in it, and observe this fragment for the boolean change above
        model.booleanValue().observe(viewLifecycleOwner, booleanChangeObserver)

        binding?.button2?.setOnClickListener {
            model.booleanChange()
        }

//        binding?.button2?.setOnClickListener {
//            if (booleanThing == false)
//                binding?.textView?.text = "Not true"
//            else if (booleanThing == true) {
//                binding?.textView?.text = "True"
//            }
//            booleanThing = !booleanThing
//        }

    }

}