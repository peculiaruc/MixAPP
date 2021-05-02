package com.peculiaruc.mixapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.peculiaruc.mixapp.R
import android.widget.Button
import android.content.Intent
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class LogInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        logIn()
    }

    private fun logIn() {
        val email = findViewById<TextInputEditText>(R.id.editText_email)
        val password = findViewById<TextInputEditText>(R.id.editText_passWord)
        val btn_Login = findViewById<Button>(R.id.btn_login)

        btn_Login.setOnClickListener() {
            if (email.text.toString().isNullOrEmpty() || password.text.toString().isNullOrEmpty()){
                Toast.makeText(this, "Email or Password not found", Toast.LENGTH_LONG).show()
            }else {
                if (email.text.toString() == "pecuben@yahoo.com" && password.text.toString() == "567890"){
                    val intent = Intent(this, ListViewActivity::class.java)
                    startActivity(intent)
                }else{
                    Toast.makeText(this, "Email or Password is wrong", Toast.LENGTH_LONG).show()

                }
            }
        }
    }

}