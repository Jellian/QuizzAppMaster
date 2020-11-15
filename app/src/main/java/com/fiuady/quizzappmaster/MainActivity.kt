package com.fiuady.quizzappmaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.viewModels

private const val CHEAT_ACTIVITY_REQUEST_CODE=0;
class MainActivity : AppCompatActivity() {
    private lateinit var jugar_button : Button
    private lateinit var opciones_button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gameModel:GameModel by viewModels()

        jugar_button=findViewById(R.id.jugar_button)
        opciones_button= findViewById(R.id.opciones_button)

        jugar_button.setOnClickListener{_->
            val intent = Intent(this@MainActivity, Juego::class.java)
            startActivity(intent)
            finish()
        }

        opciones_button.setOnClickListener{_->
            val intent = Intent(this@MainActivity, Opciones::class.java)
            startActivity(intent)
            finish()
        }

    }
}