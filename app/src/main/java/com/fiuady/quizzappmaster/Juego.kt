package com.fiuady.quizzappmaster

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels

class Juego : AppCompatActivity() {


    private lateinit var questionText: TextView
    private lateinit var pregunta: TextView
    private lateinit var pistas: TextView
    private lateinit var prevButton: ImageButton
    private lateinit var nextButton: ImageButton
    private lateinit var opcion1Button: Button
    private lateinit var opcion2Button: Button
    private lateinit var opcion3Button: Button
    private lateinit var opcion4Button: Button
    var hints = 1
    private var cont = 1
    private val gameModel: GameModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_juego)

        var game = intent

        val preguntas = game.getIntExtra("intNoQuestions", 5)
        val maxHints = game.getIntExtra("intNopistas", 0)
        val boolpistas = game.getBooleanExtra("boolpistas", false)
        val dificultad = game.getIntExtra("dificultad", 2)

        questionText = findViewById(R.id.question_text)
        prevButton = findViewById(R.id.prev_button)
        nextButton = findViewById(R.id.next_button)
        opcion1Button = findViewById(R.id.opcion1_button)
        opcion2Button = findViewById(R.id.opcion2_button)
        opcion3Button = findViewById(R.id.opcion3_button)
        opcion4Button = findViewById(R.id.opcion4_button)
        pistas = findViewById(R.id.pistas)
        pregunta = findViewById(R.id.pregunta)
        questionText.setText(gameModel.currentQuestion.questionText)
        opcion1Button.setText(gameModel.currentQuestion.answer1)
        opcion2Button.setText(gameModel.currentQuestion.answer2)
        opcion3Button.setText(gameModel.currentQuestion.answer3)
        opcion4Button.setText(gameModel.currentQuestion.answer4)
        val buttonArray = arrayListOf<Button>(opcion1Button, opcion2Button, opcion3Button, opcion4Button)
        val buttonArrayAux = arrayListOf<Button>()
        if (boolpistas) {
            pistas.setText("${hints - 1}/${maxHints}")
        } else pistas.setText("")
       pregunta.setText("${1}/${preguntas}")
        //pregunta.setText("${gameModel.currentQuestion}/${preguntas}")
        dificultadfun(buttonArray, buttonArrayAux, dificultad)

        opcion1Button.setOnClickListener { _ ->
            if (getText(gameModel.currentQuestion.answer) == opcion1Button.text) {
                Toast.makeText(this, R.string.correct_text, Toast.LENGTH_SHORT).show()
                gameModel.currentQuestion.status = 1
                gameModel.currentQuestion.respuesta = 1
                status()
            } else {
                Toast.makeText(this, R.string.incorrect_text, Toast.LENGTH_SHORT).show()
                gameModel.currentQuestion.status = 2
                gameModel.currentQuestion.respuesta = 1
                status()
            }
        }

        opcion2Button.setOnClickListener { _ ->
            if (getText(gameModel.currentQuestion.answer) == opcion2Button.text) {
                Toast.makeText(this, R.string.correct_text, Toast.LENGTH_SHORT).show()
                gameModel.currentQuestion.status = 1
                gameModel.currentQuestion.respuesta = 2
                status()
            } else {
                Toast.makeText(this, R.string.incorrect_text, Toast.LENGTH_SHORT).show()
                gameModel.currentQuestion.status = 2
                gameModel.currentQuestion.respuesta = 2
                status()
            }
        }

        opcion3Button.setOnClickListener { _ ->
            if (getText(gameModel.currentQuestion.answer) == opcion3Button.text) {
                Toast.makeText(this, R.string.correct_text, Toast.LENGTH_SHORT).show()
                gameModel.currentQuestion.status = 1
                gameModel.currentQuestion.respuesta = 3
                status()
            } else {
                Toast.makeText(this, R.string.incorrect_text, Toast.LENGTH_SHORT).show()
                gameModel.currentQuestion.status = 2
                gameModel.currentQuestion.respuesta = 3
                status()
            }
        }

        opcion4Button.setOnClickListener { _ ->
            if (getText(gameModel.currentQuestion.answer) == opcion4Button.text) {
                Toast.makeText(this, R.string.correct_text, Toast.LENGTH_SHORT).show()
                gameModel.currentQuestion.status = 1
                gameModel.currentQuestion.respuesta = 4
                status()
            } else {
                Toast.makeText(this, R.string.incorrect_text, Toast.LENGTH_SHORT).show()
                gameModel.currentQuestion.status = 2
                gameModel.currentQuestion.respuesta = 4
                status()
            }
        }

        nextButton.setOnClickListener { _ ->
            gameModel.nextQuestion()
            buttonArrayAux.clear()
            cont = 1
            pregunta.text = ("${gameModel.currentQuestionIndex + 1}/${gameModel.questionNumber}")
            questionText.setText(gameModel.currentQuestion.questionText)
            opcion1Button.setText(gameModel.currentQuestion.answer1)
            opcion2Button.setText(gameModel.currentQuestion.answer2)
            opcion3Button.setText(gameModel.currentQuestion.answer3)
            opcion4Button.setText(gameModel.currentQuestion.answer4)
            status()
            dificultadfun(buttonArray, buttonArrayAux, dificultad)
        }

        prevButton.setOnClickListener { _ ->
            gameModel.prevQuestion()
            buttonArrayAux.clear()
            cont = 1
            pregunta.text = ("${gameModel.currentQuestionIndex + 1}/${gameModel.questionNumber}")
            questionText.setText(gameModel.currentQuestion.questionText)
            opcion1Button.setText(gameModel.currentQuestion.answer1)
            opcion2Button.setText(gameModel.currentQuestion.answer2)
            opcion3Button.setText(gameModel.currentQuestion.answer3)
            opcion4Button.setText(gameModel.currentQuestion.answer4)
            status()
            dificultadfun(buttonArray, buttonArrayAux, dificultad)
        }

        questionText.setOnClickListener {

            if (!boolpistas) {
            } else {
                if (hints <= maxHints) {
                    //pistas.text = ("${hints}/${maxHints}")
                    hints++
                    Toast.makeText(this, if (hints == maxHints) R.string.no_more_hints else R.string.cheater, Toast.LENGTH_SHORT).show()
                    cheats(buttonArray, buttonArrayAux, dificultad)
                    //dificultad(buttonArray)
                    pistas.text = ("${hints - 1}/${maxHints}")
                }
            }
        }
    }

    fun status() {
//        val gameModel: GameModel by viewModels()
        when (gameModel.currentQuestion.status) {
            0 -> {
                //questionText.setTextColor(Color.parseColor("#000000"))
//                opcion1Button.isEnabled = true
//                opcion2Button.isEnabled = true
//                opcion3Button.isEnabled = true
//                opcion4Button.isEnabled = true
                //dificultad()
            }
            1 -> {
                // questionText.setTextColor(Color.parseColor("#00FF00"))
                opcion1Button.isEnabled = false
                opcion2Button.isEnabled = false
                opcion3Button.isEnabled = false
                opcion4Button.isEnabled = false
            }
            2 -> {
                //questionText.setTextColor(Color.parseColor("#FF0000"))
                opcion1Button.isEnabled = false
                opcion2Button.isEnabled = false
                opcion3Button.isEnabled = false
                opcion4Button.isEnabled = false
            }
        }
        when (gameModel.currentQuestion.respuesta) {
            0 -> {
                opcion1Button.setBackgroundResource(android.R.drawable.btn_default)
                opcion2Button.setBackgroundResource(android.R.drawable.btn_default)
                opcion3Button.setBackgroundResource(android.R.drawable.btn_default)
                opcion4Button.setBackgroundResource(android.R.drawable.btn_default)
            }
            1 -> {
                if ((gameModel.currentQuestion.status == 1 && gameModel.currentQuestion.respuesta == 1)) {
                    opcion1Button.setBackgroundColor(Color.parseColor("#00FF00"))
                    opcion2Button.setBackgroundResource(android.R.drawable.btn_default)
                    opcion3Button.setBackgroundResource(android.R.drawable.btn_default)
                    opcion4Button.setBackgroundResource(android.R.drawable.btn_default)
                }
                if ((gameModel.currentQuestion.status == 2 && gameModel.currentQuestion.respuesta == 1)) {
                    opcion1Button.setBackgroundColor(Color.parseColor("#FF0000"))
                    opcion2Button.setBackgroundResource(android.R.drawable.btn_default)
                    opcion3Button.setBackgroundResource(android.R.drawable.btn_default)
                    opcion4Button.setBackgroundResource(android.R.drawable.btn_default)
                }

            }
            2 -> {
                if ((gameModel.currentQuestion.status == 1 && gameModel.currentQuestion.respuesta == 2)) {
                    opcion2Button.setBackgroundColor(Color.parseColor("#00FF00"))
                    opcion1Button.setBackgroundResource(android.R.drawable.btn_default)
                    opcion3Button.setBackgroundResource(android.R.drawable.btn_default)
                    opcion4Button.setBackgroundResource(android.R.drawable.btn_default)
                }
                if ((gameModel.currentQuestion.status == 2 && gameModel.currentQuestion.respuesta == 2)) {
                    opcion2Button.setBackgroundColor(Color.parseColor("#FF0000"))
                    opcion1Button.setBackgroundResource(android.R.drawable.btn_default)
                    opcion3Button.setBackgroundResource(android.R.drawable.btn_default)
                    opcion4Button.setBackgroundResource(android.R.drawable.btn_default)
                }
            }
            3 -> {
                if ((gameModel.currentQuestion.status == 1 && gameModel.currentQuestion.respuesta == 3)) {
                    opcion3Button.setBackgroundColor(Color.parseColor("#00FF00"))
                    opcion2Button.setBackgroundResource(android.R.drawable.btn_default)
                    opcion1Button.setBackgroundResource(android.R.drawable.btn_default)
                    opcion4Button.setBackgroundResource(android.R.drawable.btn_default)
                }
                if ((gameModel.currentQuestion.status == 2 && gameModel.currentQuestion.respuesta == 3)) {
                    opcion3Button.setBackgroundColor(Color.parseColor("#FF0000"))
                    opcion2Button.setBackgroundResource(android.R.drawable.btn_default)
                    opcion1Button.setBackgroundResource(android.R.drawable.btn_default)
                    opcion4Button.setBackgroundResource(android.R.drawable.btn_default)
                }
            }
            4 -> {
                if ((gameModel.currentQuestion.status == 1 && gameModel.currentQuestion.respuesta == 4)) {
                    opcion4Button.setBackgroundColor(Color.parseColor("#00FF00"))
                    opcion2Button.setBackgroundResource(android.R.drawable.btn_default)
                    opcion3Button.setBackgroundResource(android.R.drawable.btn_default)
                    opcion1Button.setBackgroundResource(android.R.drawable.btn_default)
                }
                if ((gameModel.currentQuestion.status == 2 && gameModel.currentQuestion.respuesta == 4)) {
                    opcion4Button.setBackgroundColor(Color.parseColor("#FF0000"))
                    opcion2Button.setBackgroundResource(android.R.drawable.btn_default)
                    opcion3Button.setBackgroundResource(android.R.drawable.btn_default)
                    opcion1Button.setBackgroundResource(android.R.drawable.btn_default)
                }
            }
            else -> {
            }
        }

    }

    private fun dificultadfun(buttonArray: ArrayList<Button>, buttonArrayAux: ArrayList<Button>, dificultad: Int) {
//        val gameModel: GameModel by viewModels()
        // var buttonArrayAux = arrayListOf<Button>()
        //Este valor hay que mandarlo desde el menu opciones
        //val dificultad = 1
        //var contador = 0
        if (gameModel.currentQuestion.status == 0) {

            for (i in 0 until buttonArray.size) {
                if (buttonArray[i].text == getText(gameModel.currentQuestion.answer)) {
                    buttonArray[i].isEnabled = true
                } else buttonArrayAux.add(buttonArray[i])
            }
            buttonArrayAux[0].isEnabled = false
            buttonArrayAux[1].isEnabled = false
            buttonArrayAux[2].isEnabled = false
            for (j in 0 until dificultad) {
                buttonArrayAux[j].isEnabled = true
            }

        }
    }

    private fun cheats(buttonArray: ArrayList<Button>, buttonArrayAux: ArrayList<Button>, dificultad: Int) {
//        val gameModel: GameModel by viewModels()
        // var buttonArrayAux = arrayListOf<Button>()
        if (gameModel.currentQuestion.status == 0 && hints > 0) {
            if (dificultad == 1) {
                for (i in 0 until buttonArray.size) {
                    if (buttonArray[i].text == getText(gameModel.currentQuestion.answer)) {
                        gameModel.currentQuestion.respuesta = i + 1
                    }
                    gameModel.currentQuestion.status = 1
                    status()
                }
            } else if (dificultad > 1) {
                for (i in 0 until buttonArray.size) {
                    if (buttonArray[i].text == getText(gameModel.currentQuestion.answer)) {
                        buttonArray[i].isEnabled = true
                    } else buttonArrayAux.add(buttonArray[i])
                }
                buttonArrayAux[0].isEnabled = false
                buttonArrayAux[1].isEnabled = false
                buttonArrayAux[2].isEnabled = false
                for (j in 0 until (dificultad - cont)) {
                    buttonArrayAux[j].isEnabled = true
                }
                cont++
            }

        }
    }
}