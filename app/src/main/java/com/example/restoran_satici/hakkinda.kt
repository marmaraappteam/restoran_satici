package com.example.restoran_satici

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_hakkinda.*

class hakkinda : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_hakkinda,container,false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        restoran_arkaplan.setImageResource(R.drawable.restarkaplan)
        restoran_logo.setImageResource(R.drawable.restoranlogo1)
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            hakkinda().apply {
                arguments = Bundle().apply {

                }
            }
    }
}