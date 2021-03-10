package com.example.demoapp

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_dash_board.*


class DashBoardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)
        supportActionBar!!.hide()
        btnActivity.setOnClickListener {
            val mIntent = Intent(this@DashBoardActivity, LogInActivity::class.java)
            startActivity(mIntent)
        }

        btnFragment.setOnClickListener {
            val mIntent = Intent(this@DashBoardActivity, DemoActivity::class.java)
            startActivity(mIntent)
        }

        btnDialog.setOnClickListener {
            /* val dialog: EditDialog = EditDialog.newInstance()
             dialog.show(supportFragmentManager, "")*/
            showDialog()
        }
    }

    private fun showDialog() {
        AlertDialog.Builder(this)
            .setTitle("Title")
            .setMessage("Are you sure?")
            .setPositiveButton(
                android.R.string.yes
            ) { _, _ ->
                Toast.makeText(this, "OK", Toast.LENGTH_SHORT).show()
            } // A null listener allows the button to dismiss the dialog and take no further action.
            .setNegativeButton(android.R.string.no, null)
            .show()
    }
}