package com.example.apkakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
// użycie metody onUserInteracion -  gdy wpiszemy hasło krótsze niż 6 znaków, to informacja "Za krótkie hasło", w przeciwnym razie "Hasło poprawne"
    override fun onUserInteraction(){
        super.onUserInteraction()

        if (password.isFocused) {
            if (password.length() < 6) {
                zle_haslo.setText("Za krótkie hasło!")
                zle_haslo.visibility = TextView.VISIBLE
            } else {
                zle_haslo.setText("Hasło poprawne!")
                zle_haslo.visibility = TextView.VISIBLE
            }
        }
        // jeśli pole nie jest aktywne, to ustawiamy visibility na INVISIBLE
        else
            zle_haslo.visibility=TextView.INVISIBLE
        }

}