package com.fiuady.quizzappmaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.viewModels


class MainActivity : AppCompatActivity() {
    private lateinit var jugar_button : Button
    private lateinit var opciones_button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gameModel:GameModel by viewModels()

        jugar_button=findViewById(R.id.jugar_button)
        opciones_button= findViewById(R.id.opciones_button)


        val booltodos = intent.getBooleanExtra("intTodos", false)
        val boolciencia = intent.getBooleanExtra("intciencia", true)
        val boolcine = intent.getBooleanExtra("intcine", false)
        val booldeporte = intent.getBooleanExtra("intdeporte", false)
        val boolmusica = intent.getBooleanExtra("intmusica", false)
        val boolarte = intent.getBooleanExtra("intarte", false)
        val boolvideojuegos = intent.getBooleanExtra("intvideojuegos", false)
        val stringNopreguntas = intent.getIntExtra("intNoQuestions", 0)
        val stringNoCpistas = intent.getIntExtra("intNopistas", 0)
        val boolbajo = intent.getBooleanExtra("intbajo", false)
        val boolmedio = intent.getBooleanExtra("intMedio", false)
        val boolalto = intent.getBooleanExtra("intAlto", true)
        val boolspistas = intent.getBooleanExtra("intspinpistas", false)





        jugar_button.setOnClickListener{_->
            val intent = Intent(this@MainActivity, Juego::class.java)
            intent.putExtra("intTodos", booltodos)
            intent.putExtra("intciencia", boolciencia)
            intent.putExtra("intcine", boolcine )
            intent.putExtra("intdeporte", booldeporte)
            intent.putExtra("intmusica", boolmusica)
            intent.putExtra("intarte", boolarte)
            intent.putExtra("intvideojuegos", boolvideojuegos)
            intent.putExtra("intNoQuestions", stringNopreguntas);
            intent.putExtra("intNopistas", stringNoCpistas);
            intent.putExtra("intbajo", boolbajo)
            intent.putExtra("intMedio", boolmedio)
            intent.putExtra("intAlto", boolalto)
            intent.putExtra("intspinpistas", boolspistas)
            startActivity(intent)


        }

        opciones_button.setOnClickListener{_->
            val intent = Intent(this@MainActivity, Opciones::class.java)

            intent.putExtra("intTodos", booltodos)
            intent.putExtra("intciencia", boolciencia)
            intent.putExtra("intcine", boolcine )
            intent.putExtra("intdeporte", booldeporte)
            intent.putExtra("intmusica", boolmusica)
            intent.putExtra("intarte", boolarte)
            intent.putExtra("intvideojuegos", boolvideojuegos)
            intent.putExtra("intNoQuestions", stringNopreguntas);
            intent.putExtra("intNopistas", stringNoCpistas);
            intent.putExtra("intbajo", boolbajo)
            intent.putExtra("intMedio", boolmedio)
            intent.putExtra("intAlto", boolalto)
            intent.putExtra("intspinpistas", boolalto)

            startActivity(intent)

        }

    }
}