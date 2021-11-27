package com.example.kniga

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.util.regex.Pattern

class SignInActivity : AppCompatActivity() {
    lateinit var email: EditText
    lateinit var password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        email = findViewById(R.id.email_login)
        password = findViewById(R.id.password_login)
    }

    val pattern = ("[a-z0-9]{1,256}" +
            "\\@" +
            "[a-z0-9]{1,10}" +
            "\\." +
            "[a-z]{1,3}")


    fun EmailValid(email: String): Boolean {
        return Pattern.compile(pattern).matcher(email).matches()
    }

    fun signin(view: android.view.View) {
        if (email.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()) {
            if (EmailValid(email.text.toString())) {
                val intent = Intent(this@SignInActivity, MainActivity::class.java)
                startActivity(intent)
            } else {
                val alert = AlertDialog.Builder(this)
                    .setTitle("Ошибка")
                    .setMessage("Введите корректный E-mail")
                    .setPositiveButton("OK", null)
                    .create()
                    .show()
            }

        } else {
            val alert = AlertDialog.Builder(this)
                .setTitle("Ошибка")
                .setMessage("Заполните все поля")
                .setPositiveButton("OK", null)
                .create()
                .show()
        }
    }

    fun registration(view: android.view.View) {

        val intent = Intent(this@SignInActivity, SignUpActivity::class.java)
        startActivity(intent)

    }
}