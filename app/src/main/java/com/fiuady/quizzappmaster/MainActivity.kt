package com.fiuady.quizzappmaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.viewModels


class MainActivity : AppCompatActivity() {

    companion object {
        var topico = arrayListOf<Int>()
        var numpreg = 4
        var arreglopreg = arrayListOf<Question>()

    }
    private lateinit var jugar_button: Button
    private lateinit var opciones_button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gameModel: GameModel by viewModels()
        jugar_button = findViewById(R.id.jugar_button)
        opciones_button = findViewById(R.id.opciones_button)
        var intent = intent
        val topicsarray = intent.getIntegerArrayListExtra("topicsarray")
        val preguntas = intent.getIntExtra("intNoQuestions", 0)
        val pistas = intent.getIntExtra("intNopistas", 0)
        val dificultad = intent.getIntExtra("dificultad", 2)
        val boolspistas = intent.getBooleanExtra("intspinpistas", false)
        if (topicsarray != null) {
            topico=topicsarray
        }
        numpreg=preguntas
        arreglopreg=gameModel.random()
        jugar_button.setOnClickListener { _ ->
            val game = Intent(this, Juego::class.java)
            game.putExtra("topicsarray", topicsarray)
            opciones_button.text= numpreg.toString()
            game.putExtra("intNoQuestions", preguntas);
            game.putExtra("intNopistas", pistas);
            game.putExtra("dificultad", dificultad)
            game.putExtra("boolpistas", boolspistas)
            startActivity(game)


        }

        opciones_button.setOnClickListener { _ ->
            val option = Intent(this@MainActivity, Opciones::class.java)

            startActivity(option)

        }

    }
}