package com.example.demoapp

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class EditDialog : androidx.fragment.app.DialogFragment() {
    private lateinit var edtNumber: EditText

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity)
        val inflater = activity!!.layoutInflater
        val view = inflater.inflate(R.layout.dialog_edit, null)
        val imgClose = view.findViewById<ImageView>(R.id.btn_close)
        edtNumber = view.findViewById(R.id.edtNumber)
        imgClose.setOnClickListener { dismiss() }
        val btnOkay = view.findViewById<Button>(R.id.btn_ok)

        isCancelable = true
        btnOkay.setOnClickListener {
            dismiss()
            Toast.makeText(activity!!, edtNumber.text.toString(), Toast.LENGTH_SHORT).show()
        }
        builder.setView(view)
        return builder.create()
    }

    companion object {
        fun newInstance(): EditDialog {
            val frag = EditDialog()
            val args = Bundle()
            frag.arguments = args
            return frag
        }
    }
}