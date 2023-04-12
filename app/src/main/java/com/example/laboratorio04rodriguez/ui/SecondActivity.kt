package com.example.laboratorio04rodriguez.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.laboratorio04rodriguez.R

class SecondActivity : AppCompatActivity() {
    private lateinit var nameTextView: TextView
    private lateinit var emailTextView: TextView
    private lateinit var numberTextView: TextView
    private lateinit var actionshare: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        nameTextView =findViewById(R.id.resultTextView)
        emailTextView = findViewById(R.id.EmailResultTextView)
        numberTextView= findViewById(R.id.NumberResultTextView)
        actionshare = findViewById(R.id.ShareBUtton)

        val nameShared = intent.getStringExtra(MainActivity.Share_Name).toString()
        nameTextView.text = "Nombre: ${nameShared}"

        val emailShared = intent.getStringExtra(MainActivity.SHare_Email).toString()
        emailTextView.text = "Correo Electrónico: ${emailShared}"

        val numberShared = intent.getStringExtra(MainActivity.Share_Number).toString()
        numberTextView.text = "Número telefónico: ${numberShared}"

        actionshare.setOnClickListener {
            val sendIntent = Intent()
            sendIntent.action = Intent.ACTION_SEND
            sendIntent.putExtra(
                Intent.EXTRA_TEXT,
                "Hey Check out this Great app:"
            )
            sendIntent.type = "text/plain"
            startActivity(Intent.createChooser(sendIntent, "compartir"))
        }
    }
}