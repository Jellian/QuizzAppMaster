package com.fiuady.quizzappmaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.viewModels


class MainActivity : AppCompatActivity() {
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

        jugar_button.setOnClickListener { _ ->
            val game = Intent(this, Juego::class.java)
            game.putExtra("topicsarray", topicsarray)
            game.putExtra("intNoQuestions", preguntas);
            game.putExtra("intNopistas", pistas);
            game.putExtra("dificultad", dificultad)
            game.putExtra("boolpistas", boolspistas)
            startActivity(game)


        }

        opciones_button.setOnClickListener { _ ->
            val intent = Intent(this@MainActivity, Opciones::class.java)
            //intent.putExtra("topicsarray",topicsarray)
//            intent.putExtra("intTodos", booltodos)
//            intent.putExtra("intciencia", boolciencia)
//            intent.putExtra("intcine", boolcine )
//            intent.putExtra("intdeporte", booldeporte)
//            intent.putExtra("intmusica", boolmusica)
//            intent.putExtra("intarte", boolarte)
//            intent.putExtra("intvideojuegos", boolvideojuegos)
//            intent.putExtra("intNoQuestions", stringNopreguntas);
//            intent.putExtra("intNopistas", stringNoCpistas);
//            intent.putExtra("intbajo", boolbajo)
//            intent.putExtra("intMedio", boolmedio)
//            intent.putExtra("intAlto", boolalto)
//            intent.putExtra("intspinpistas", boolalto)

            startActivity(intent)

        }

    }
}