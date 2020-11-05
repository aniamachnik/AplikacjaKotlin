package com.example.apkakotlin

import android.app.Activity
import android.app.Notification
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ActionMenuView
import android.widget.Toast


import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity() : AppCompatActivity () {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// Ustawienia zadarzeń przycisku oraz OnClick
        // ustawienie funkcjonalności przycisku LK_Button, po kliknięciu w przycisk zmienia się napis na "dzień dobry"

        LK_Button.setOnClickListener {

            LK_Button.setText("dzień dobry")
        }

        // ustawienie funkcjonalności przycisku SUB_button, po kliknięciu wyświetla się na dole ekranu napis "Jak się masz?"
        SUB_button.setOnClickListener {

            var message = Toast.makeText(applicationContext, "Jak się masz?", Toast.LENGTH_LONG)
            message.show()

            // Tworzymy nową instancję jawną odpalającą SecondActivity
            var nowaAktywnosc: Intent =  Intent(applicationContext, SecondActivity::class.java)
            startActivity(nowaAktywnosc)

            // tworzenie intencji niejawnej, która umożliwia pzejście na stronę youtoube po kliknięciu w przycisk
            //var adress = "https://www.youtube.com/watch?v=JHkbp7PLV5w"
            //var channelRevolShen = Intent(ACTION_VIEW (), Uri.parse(adress))
            //startActivity(channelRevolShen)

        }
    }


}
