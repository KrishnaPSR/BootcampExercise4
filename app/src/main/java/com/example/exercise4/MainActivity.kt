package com.example.exercise4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var username_at=findViewById(R.id.UserName_at) as EditText
        var password_at=findViewById(R.id.Password_at) as EditText
        var button1=findViewById(R.id.button1) as Button

        button1.setOnClickListener{
            var status=if (username_at.text.toString().equals("kpsrathore") && password_at.text.toString().equals("password")) "Logged in Successfully" else "Login Fail"
            Toast.makeText(this,status,Toast.LENGTH_SHORT).show()
        }
    }
}