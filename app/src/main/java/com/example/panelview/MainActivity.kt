package com.example.panelview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buton: Button = findViewById(R.id.button)
        val user_name: EditText = findViewById(R.id.editTextTextPersonName2)
        //var usr = user_name.text.toString()
        val parola: EditText = findViewById(R.id.editTextTextPassword2)
        //var pwd = parola.text.toString()
        buton.setOnClickListener { aut(user_name.text.toString(), parola.text.toString()) }

    }

    fun aut(usr: String, pwd: String) {
        val myToast:Toast
        if (usr.isEmpty() || pwd.isEmpty()) {
            myToast = Toast.makeText(applicationContext,"Introdu numele si parola",Toast.LENGTH_SHORT)
            myToast.show()


        }
        else
        {
            //myToast = Toast.makeText(applicationContext,"Imd apare activitatea 2",Toast.LENGTH_SHORT)
            //myToast.show()
            Intent(this,MainActivity2::class.java).also{
              startActivity(it)
            }


        }
    }
}