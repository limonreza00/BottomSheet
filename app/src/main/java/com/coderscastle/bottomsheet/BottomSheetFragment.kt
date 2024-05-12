package com.coderscastle.bottomsheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class BottomSheetFragment : BottomSheetDialogFragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val view = inflater.inflate(R.layout.fragment_bottom_sheet, container, false)

        val btn = view.findViewById<Button>(R.id.insideButton)

        btn.setOnClickListener {
            Toast.makeText(context, "Inside Button Clicked", Toast.LENGTH_SHORT).show()
        }

        return view
    }




}