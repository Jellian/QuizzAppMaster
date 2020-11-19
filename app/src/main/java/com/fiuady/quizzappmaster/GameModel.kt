package com.fiuady.quizzappmaster

import androidx.lifecycle.ViewModel


class GameModel : ViewModel() {

    private val questionArrays = arrayListOf<Question>(
            Question(0, R.string.question_text_1, 2, R.string.question_answer_1a, R.string.question_answer_1b, R.string.question_answer_1c, R.string.question_answer_1d, R.string.respuesta_correcta1, false, false, 0, false, false, false, false, false, 0),
            Question(0, R.string.question_text_2, 2, R.string.question_answer_2a, R.string.question_answer_2b, R.string.question_answer_2c, R.string.question_answer_2d, R.string.respuesta_correcta2, false, false, 0, false, false, false, false, false, 0),

            )
    var currentQuestionIndex = 0
    private val questionaux = arrayListOf<Question>()
    private val answeraux = arrayListOf<Int>()

    fun random() {
        for (i in 0 until questionArrays.size) {
            answeraux.add(questionArrays[i].answer1)
            answeraux.add(questionArrays[i].answer2)
            answeraux.add(questionArrays[i].answer3)
            answeraux.add(questionArrays[i].answer4)
            answeraux.shuffle()
            questionaux.add(Question(questionArrays[i].question_number, questionArrays[i].questionText, questionArrays[i].topic, answeraux[0], answeraux[1], answeraux[2], answeraux[3], questionArrays[i].answer, questionArrays[i].enabled, questionArrays[i].cheated, questionArrays[i].status, questionArrays[i].correct, questionArrays[i].resp1, questionArrays[i].resp2, questionArrays[i].resp3, questionArrays[i].resp4, questionArrays[i].respuesta))
            answeraux.clear()
        }
    }

    val currentQuestion: Question
        get() = questionaux[currentQuestionIndex]
    val questionNumber: Int
        get() = questionaux.size

    fun nextQuestion() {
        currentQuestionIndex = (currentQuestionIndex + 1) % questionaux.size
    }

    fun prevQuestion() {
        currentQuestionIndex = (questionaux.size + currentQuestionIndex - 1) % questionaux.size
    }


}