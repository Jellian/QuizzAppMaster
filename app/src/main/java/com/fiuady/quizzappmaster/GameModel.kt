package com.fiuady.quizzappmaster

import androidx.lifecycle.ViewModel


class GameModel : ViewModel() {

    private val questionArrays = arrayListOf<Question>(
// cine
            Question(0, R.string.question_text_1, 1, R.string.question_answer_1a, R.string.question_answer_1b, R.string.question_answer_1c, R.string.question_answer_1d, R.string.respuesta_correcta1, false, false, 0, false, false, false, false, false, 0),
            Question(0, R.string.question_text_2, 1, R.string.question_answer_2a, R.string.question_answer_2b, R.string.question_answer_2c, R.string.question_answer_2d, R.string.respuesta_correcta2, false, false, 0, false, false, false, false, false, 0),
            Question(0, R.string.question_text_3, 1, R.string.question_answer_3a, R.string.question_answer_3b, R.string.question_answer_3c, R.string.question_answer_3d, R.string.respuesta_correcta3, false, false, 0, false, false, false, false, false, 0),
            Question(0, R.string.question_text_4, 1, R.string.question_answer_4a, R.string.question_answer_4b, R.string.question_answer_4c, R.string.question_answer_4d, R.string.respuesta_correcta4, false, false, 0, false, false, false, false, false, 0),
            Question(0, R.string.question_text_5, 1, R.string.question_answer_5a, R.string.question_answer_5b, R.string.question_answer_5c, R.string.question_answer_5d, R.string.respuesta_correcta5, false, false, 0, false, false, false, false, false, 0),

            //MÃºsica
            Question(0, R.string.question_text_6, 2, R.string.question_answer_6a, R.string.question_answer_6b, R.string.question_answer_6c, R.string.question_answer_6d, R.string.respuesta_correcta6, false, false, 0, false, false, false, false, false, 0),
            Question(0, R.string.question_text_7, 2, R.string.question_answer_7a, R.string.question_answer_7b, R.string.question_answer_7c, R.string.question_answer_7d, R.string.respuesta_correcta7, false, false, 0, false, false, false, false, false, 0),
            Question(0, R.string.question_text_8, 2, R.string.question_answer_8a, R.string.question_answer_8b, R.string.question_answer_8c, R.string.question_answer_8d, R.string.respuesta_correcta8, false, false, 0, false, false, false, false, false, 0),
            Question(0, R.string.question_text_9, 2, R.string.question_answer_9a, R.string.question_answer_9b, R.string.question_answer_9c, R.string.question_answer_9d, R.string.respuesta_correcta9, false, false, 0, false, false, false, false, false, 0),
            Question(0, R.string.question_text_10, 2, R.string.question_answer_10a, R.string.question_answer_10b, R.string.question_answer_10c, R.string.question_answer_10d, R.string.respuesta_correcta10, false, false, 0, false, false, false, false, false, 0),

            //Ciencia
            Question(0, R.string.question_text_11, 3, R.string.question_answer_11a, R.string.question_answer_11b, R.string.question_answer_11c, R.string.question_answer_11d, R.string.respuesta_correcta11, false, false, 0, false, false, false, false, false, 0),
            Question(0, R.string.question_text_12, 3, R.string.question_answer_12a, R.string.question_answer_12b, R.string.question_answer_12c, R.string.question_answer_12d, R.string.respuesta_correcta12, false, false, 0, false, false, false, false, false, 0),
            Question(0, R.string.question_text_13, 3, R.string.question_answer_13a, R.string.question_answer_13b, R.string.question_answer_13c, R.string.question_answer_13d, R.string.respuesta_correcta13, false, false, 0, false, false, false, false, false, 0),
            Question(0, R.string.question_text_14, 3, R.string.question_answer_14a, R.string.question_answer_14b, R.string.question_answer_14c, R.string.question_answer_14d, R.string.respuesta_correcta14, false, false, 0, false, false, false, false, false, 0),
            Question(0, R.string.question_text_15, 3, R.string.question_answer_15a, R.string.question_answer_15b, R.string.question_answer_15c, R.string.question_answer_15d, R.string.respuesta_correcta15, false, false, 0, false, false, false, false, false, 0),

            //Deporte
            Question(0, R.string.question_text_16, 4, R.string.question_answer_16a, R.string.question_answer_16b, R.string.question_answer_16c, R.string.question_answer_16d, R.string.respuesta_correcta16, false, false, 0, false, false, false, false, false, 0),
            Question(0, R.string.question_text_17, 4, R.string.question_answer_17a, R.string.question_answer_17b, R.string.question_answer_17c, R.string.question_answer_17d, R.string.respuesta_correcta17, false, false, 0, false, false, false, false, false, 0),
            Question(0, R.string.question_text_18, 4, R.string.question_answer_18a, R.string.question_answer_18b, R.string.question_answer_18c, R.string.question_answer_18d, R.string.respuesta_correcta18, false, false, 0, false, false, false, false, false, 0),
            Question(0, R.string.question_text_19, 4, R.string.question_answer_19a, R.string.question_answer_19b, R.string.question_answer_19c, R.string.question_answer_19d, R.string.respuesta_correcta19, false, false, 0, false, false, false, false, false, 0),
            Question(0, R.string.question_text_20, 4, R.string.question_answer_20a, R.string.question_answer_20b, R.string.question_answer_20c, R.string.question_answer_20d, R.string.respuesta_correcta20, false, false, 0, false, false, false, false, false, 0),

            //Arte
            Question(0, R.string.question_text_21, 5, R.string.question_answer_21a, R.string.question_answer_21b, R.string.question_answer_21c, R.string.question_answer_21d, R.string.respuesta_correcta21, false, false, 0, false, false, false, false, false, 0),
            Question(0, R.string.question_text_22, 5, R.string.question_answer_22a, R.string.question_answer_22b, R.string.question_answer_22c, R.string.question_answer_22d, R.string.respuesta_correcta22, false, false, 0, false, false, false, false, false, 0),
            Question(0, R.string.question_text_23, 5, R.string.question_answer_23a, R.string.question_answer_23b, R.string.question_answer_23c, R.string.question_answer_23d, R.string.respuesta_correcta23, false, false, 0, false, false, false, false, false, 0),
            Question(0, R.string.question_text_24, 5, R.string.question_answer_24a, R.string.question_answer_24b, R.string.question_answer_24c, R.string.question_answer_24d, R.string.respuesta_correcta24, false, false, 0, false, false, false, false, false, 0),
            Question(0, R.string.question_text_25, 5, R.string.question_answer_25a, R.string.question_answer_25b, R.string.question_answer_25c, R.string.question_answer_25d, R.string.respuesta_correcta25, false, false, 0, false, false, false, false, false, 0),


            //Videojuegos
            Question(0, R.string.question_text_26, 6, R.string.question_answer_26a, R.string.question_answer_26b, R.string.question_answer_26c, R.string.question_answer_26d, R.string.respuesta_correcta26, false, false, 0, false, false, false, false, false, 0),
            Question(0, R.string.question_text_27, 6, R.string.question_answer_27a, R.string.question_answer_27b, R.string.question_answer_27c, R.string.question_answer_27d, R.string.respuesta_correcta27, false, false, 0, false, false, false, false, false, 0),
            Question(0, R.string.question_text_28, 6, R.string.question_answer_28a, R.string.question_answer_28b, R.string.question_answer_28c, R.string.question_answer_28d, R.string.respuesta_correcta28, false, false, 0, false, false, false, false, false, 0),
            Question(0, R.string.question_text_29, 6, R.string.question_answer_29a, R.string.question_answer_29b, R.string.question_answer_29c, R.string.question_answer_29d, R.string.respuesta_correcta29, false, false, 0, false, false, false, false, false, 0),
            Question(0, R.string.question_text_30, 6, R.string.question_answer_30a, R.string.question_answer_30b, R.string.question_answer_30c, R.string.question_answer_30d, R.string.respuesta_correcta30, false, false, 0, false, false, false, false, false, 0),
    )
    var currentQuestionIndex = 0
    var topicsarray = MainActivity.topico
    private val questionRandomAux = arrayListOf<Question>()
    val questionaux = arrayListOf<Question>()
    private val answeraux = arrayListOf<Int>()
    var numQuestions = MainActivity.numpreg
    val arreglo = MainActivity.arreglopreg

    fun random():ArrayList<Question> {
        val size = topicsarray.size
        var arrayposition = 0
// Por cada topico en el topicsarray guardo las preguntas de los topicos seleccionados en questionaux
        for (topic in topicsarray) {
            for (i in 0 until questionArrays.size) {
                if (topic == questionArrays[i].topic) {
                    questionaux.add(
                            Question(
                                    questionArrays[i].question_number,
                                    questionArrays[i].questionText,
                                    questionArrays[i].topic,
                                    questionArrays[i].answer1,
                                    questionArrays[i].answer2,
                                    questionArrays[i].answer3,
                                    questionArrays[i].answer4,
                                    questionArrays[i].answer,
                                    questionArrays[i].enabled,
                                    questionArrays[i].cheated,
                                    questionArrays[i].status,
                                    questionArrays[i].correct,
                                    questionArrays[i].resp1,
                                    questionArrays[i].resp2,
                                    questionArrays[i].resp3,
                                    questionArrays[i].resp4,
                                    questionArrays[i].respuesta
                            )
                    )
                }
            }
        }
//Revuelvo el array con las preguntas de los topicos seleccionados
        questionaux.shuffle()
        //una vez revueltas las preguntas almaceno el numero de preguntas a mostrar en el questionRandomAux
        for (i in 0 until numQuestions) {
            questionRandomAux.add(
                    Question(
                            questionaux[i].question_number,
                            questionaux[i].questionText,
                            questionaux[i].topic,
                            questionaux[i].answer1,
                            questionaux[i].answer2,
                            questionaux[i].answer3,
                            questionaux[i].answer4,
                            questionaux[i].answer,
                            questionaux[i].enabled,
                            questionaux[i].cheated,
                            questionaux[i].status,
                            questionaux[i].correct,
                            questionaux[i].resp1,
                            questionaux[i].resp2,
                            questionaux[i].resp3,
                            questionaux[i].resp4,
                            questionaux[i].respuesta
                    ))
        }
        //El total de preguntas a mostrar ya se encuentra aleatorizado en questionRandomAux
        //elimino los elementos de questionaux para reciclar el array en la aleatorizacion de respuestas
        questionaux.clear()


        for (j in 0 until questionRandomAux.size) {
            answeraux.add(questionRandomAux[j].answer1)
            answeraux.add(questionRandomAux[j].answer2)
            answeraux.add(questionRandomAux[j].answer3)
            answeraux.add(questionRandomAux[j].answer4)
            answeraux.shuffle()
            questionaux.add(
                    Question(
                            questionRandomAux[j].question_number,
                            questionRandomAux[j].questionText,
                            questionRandomAux[j].topic,
                            answeraux[0],
                            answeraux[1],
                            answeraux[2],
                            answeraux[3],
                            questionRandomAux[j].answer,
                            questionRandomAux[j].enabled,
                            questionRandomAux[j].cheated,
                            questionRandomAux[j].status,
                            questionRandomAux[j].correct,
                            questionRandomAux[j].resp1,
                            questionRandomAux[j].resp2,
                            questionRandomAux[j].resp3,
                            questionRandomAux[j].resp4,
                            questionRandomAux[j].respuesta
                    )
            )
            answeraux.clear()
        }
        return questionaux
        //en questionaux ya se encuentran las preguntas junto con sus respuestas aleatorias, las envio al mainactivity.
    }

    val currentQuestion: Question
        get() = arreglo[currentQuestionIndex]
    val questionNumber: Int
        get() = arreglo.size

    fun nextQuestion() {
        currentQuestionIndex = (currentQuestionIndex + 1) % arreglo.size
    }

    fun prevQuestion() {
        currentQuestionIndex = (arreglo.size + currentQuestionIndex - 1) % arreglo.size
    }


}