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
    private lateinit var prevButton: ImageButton
    private lateinit var nextButton: ImageButton
    private lateinit var opcion1Button: Button
    private lateinit var opcion2Button: Button
    private lateinit var opcion3Button: Button
    private lateinit var opcion4Button: Button

    val gameModel: GameModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_juego)

        gameModel.random()
        questionText = findViewById(R.id.question_text)
        prevButton = findViewById(R.id.prev_button)
        nextButton = findViewById(R.id.next_button)
        opcion1Button = findViewById(R.id.opcion1_button)
        opcion2Button = findViewById(R.id.opcion2_button)
        opcion3Button = findViewById(R.id.opcion3_button)
        opcion4Button = findViewById(R.id.opcion4_button)
        pregunta = findViewById(R.id.pregunta)
        questionText.setText(gameModel.currentQuestion.questionText)
        opcion1Button.setText(gameModel.currentQuestion.answer1)
        opcion2Button.setText(gameModel.currentQuestion.answer2)
        opcion3Button.setText(gameModel.currentQuestion.answer3)
        opcion4Button.setText(gameModel.currentQuestion.answer4)
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
            pregunta.text = ("${gameModel.currentQuestionIndex + 1}/${gameModel.questionNumber}")
            questionText.setText(gameModel.currentQuestion.questionText)
            opcion1Button.setText(gameModel.currentQuestion.answer1)
            opcion2Button.setText(gameModel.currentQuestion.answer2)
            opcion3Button.setText(gameModel.currentQuestion.answer3)
            opcion4Button.setText(gameModel.currentQuestion.answer4)
            status()


        }

        prevButton.setOnClickListener { _ ->
            gameModel.prevQuestion()
            pregunta.text = ("${gameModel.currentQuestionIndex + 1}/${gameModel.questionNumber}")
            questionText.setText(gameModel.currentQuestion.questionText)
            opcion1Button.setText(gameModel.currentQuestion.answer1)
            opcion2Button.setText(gameModel.currentQuestion.answer2)
            opcion3Button.setText(gameModel.currentQuestion.answer3)
            opcion4Button.setText(gameModel.currentQuestion.answer4)
            status()


        }
    }

    fun status() {
        when (gameModel.currentQuestion.status) {
            0 -> {
                //questionText.setTextColor(Color.parseColor("#000000"))
                opcion1Button.isEnabled = true
                opcion2Button.isEnabled = true
                opcion3Button.isEnabled = true
                opcion4Button.isEnabled = true
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

}