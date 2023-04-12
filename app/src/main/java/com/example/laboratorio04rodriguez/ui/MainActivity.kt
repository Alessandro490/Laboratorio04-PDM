package com.example.laboratorio04rodriguez.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.laboratorio04rodriguez.R

class MainActivity : AppCompatActivity() {
    private lateinit var nameEditText: EditText
    private lateinit var actionNext: Button
    private lateinit var emailEdiText: EditText
    private lateinit var numberEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameEditText=findViewById(R.id.NameTextField)
        emailEdiText=findViewById(R.id.EmailTextField)
        numberEditText=findViewById(R.id.NumberTextField)
        actionNext=findViewById(R.id.ActionButton)

        actionNext.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(Share_Name, nameEditText.text.toString())
            intent.putExtra(SHare_Email, emailEdiText.text.toString())
            intent.putExtra(Share_Number, numberEditText.text.toString())
            startActivity(intent)
        }
    }

    companion object{
        const val Share_Name = "name"
        const val SHare_Email = "email"
        const val Share_Number = "number"
    }
}